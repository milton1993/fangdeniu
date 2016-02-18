package com.mitong.fangdeniu.entity.param;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-17
 * @decription
 */
public class DatabasePageQueryParam {
    private int start;

    private int limit;

    public DatabasePageQueryParam(int start, int limit) {
        this.start = start;
        this.limit = limit;
    }
}
