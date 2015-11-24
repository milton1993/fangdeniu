package com.mitong.fangdeniu.converter;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.mitong.fangdeniu.entity.pojo.ReturnMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.util.ClassUtils;
import org.springframework.util.TypeUtils;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 15-11-24
 */
public class JsonMessageConverter extends MappingJackson2HttpMessageConverter {
    private static final boolean jackson26Available = ClassUtils.hasMethod(ObjectMapper.class, "setDefaultPrettyPrinter", new Class[]{PrettyPrinter.class});
    @Override
    protected void writeInternal(Object object, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        JsonEncoding encoding = this.getJsonEncoding(outputMessage.getHeaders().getContentType());
        JsonGenerator generator = this.objectMapper.getFactory().createGenerator(outputMessage.getBody(), encoding);
        try {
            this.writePrefix(generator, object);
            Class ex = null;
            FilterProvider filters = null;
            Object value = new ReturnMessage(null, object);
            JavaType javaType = null;
            if(object instanceof MappingJacksonValue) {
                MappingJacksonValue objectWriter = (MappingJacksonValue)object;
                value = objectWriter.getValue();
                ex = objectWriter.getSerializationView();
                filters = objectWriter.getFilters();
            }

            if(jackson26Available && type != null && value != null && TypeUtils.isAssignable(type, value.getClass())) {
                javaType = this.getJavaType(type, (Class)null);
            }

            ObjectWriter objectWriter1;
            if(ex != null) {
                objectWriter1 = this.objectMapper.writerWithView(ex);
            } else if(filters != null) {
                objectWriter1 = this.objectMapper.writer(filters);
            } else {
                objectWriter1 = this.objectMapper.writer();
            }

            if(javaType != null) {
                objectWriter1 = objectWriter1.withType(javaType);
            }

            objectWriter1.writeValue(generator, value);
            this.writeSuffix(generator, object);
            generator.flush();
        } catch (JsonProcessingException var11) {
            throw new HttpMessageNotWritableException("Could not write content: " + var11.getMessage(), var11);
        }
    }
}
