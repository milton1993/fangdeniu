package com.mitong.fangdeniu.spring;

import com.mitong.fangdeniu.entity.pojo.ReturnMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 15-11-24
 */
@ControllerAdvice
public class JsonExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ReturnMessage handleException(HttpServletRequest request, Exception ex) {
        StringBuilder message = new StringBuilder(ex.getClass().toString().substring(6) + ": " + ex.getMessage());
        while (ex.getCause() != null) {
            message.append("    caused by " + ex.getCause().getClass().toString().substring(6) + ": " + ex.getCause().getMessage());
            ex = (Exception) ex.getCause();
        }
        return new ReturnMessage(ReturnMessage.ERROR_STATUS, message.toString(), null);
    }
}