package com.mitong.fangdeniu.entity.param;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-17
 * @decription
 */
public class PageQueryParam {
    private int pageIndex;

    private int pageSize;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
