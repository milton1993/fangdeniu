package com.mitong.fangdeniu.entity.pojo;


import com.sun.istack.internal.Nullable;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 15-11-20
 */
public class ReturnMessage {
    public static final int ERROR_STATUS = -1;

    public static final int SUCCESS_STATUS = 0;

    private int status;

    private String message;

    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ReturnMessage(int status, @Nullable String message, @Nullable Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ReturnMessage(@Nullable String message, Object data) {
        this.status = SUCCESS_STATUS;
        this.message = message;
        this.data = data;
    }

    public ReturnMessage() {
    }
}
