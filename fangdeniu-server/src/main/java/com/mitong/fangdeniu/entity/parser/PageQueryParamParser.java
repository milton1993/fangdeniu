package com.mitong.fangdeniu.entity.parser;

import com.google.common.base.Preconditions;
import com.mitong.fangdeniu.entity.param.DatabasePageQueryParam;
import com.mitong.fangdeniu.entity.param.PageQueryParam;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-18
 * @decription
 */
public class PageQueryParamParser implements Parser<DatabasePageQueryParam, PageQueryParam> {
    @Override
    public DatabasePageQueryParam parse(PageQueryParam pageQueryParam) {
        Preconditions.checkNotNull(pageQueryParam);
        int start = pageQueryParam.getPageSize() * (pageQueryParam.getPageIndex() - 1);
        int limit = pageQueryParam.getPageSize();
        return new DatabasePageQueryParam(start, limit);
    }
}
