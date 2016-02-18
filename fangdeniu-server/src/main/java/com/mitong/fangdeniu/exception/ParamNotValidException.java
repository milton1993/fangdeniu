package com.mitong.fangdeniu.exception;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-17
 * @decription
 */
public class ParamNotValidException extends Exception {
    public ParamNotValidException() {
    }

    public ParamNotValidException(String message) {
        super(message);
    }

    public ParamNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParamNotValidException(Throwable cause) {
        super(cause);
    }

    public ParamNotValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
