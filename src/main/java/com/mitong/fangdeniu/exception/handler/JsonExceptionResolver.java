package com.mitong.fangdeniu.exception.handler;

import com.mitong.fangdeniu.entity.pojo.ReturnMessage;
import com.mitong.fangdeniu.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 15-11-20
 */
public class JsonExceptionResolver extends SimpleMappingExceptionResolver {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonExceptionResolver.class);

    public JsonExceptionResolver() {
        this.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response,
                                              Object _handler, Exception ex) {

        ReturnMessage returnMessage = new ReturnMessage(ReturnMessage.ERROR_STATUS, ex.getMessage(), null);
        try {
            JsonUtils.writeToWriter(response.getWriter(), returnMessage);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }

        // skip other resolver and view render
        return ModelAndViewResolver.UNRESOLVED;
    }
}