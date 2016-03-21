package com.mitong.fangdeniu.entity.parser;

import com.mitong.fangdeniu.entity.param.DatabasePageQueryParam;
import com.mitong.fangdeniu.entity.param.PageQueryParam;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-19
 * @decription
 */
public class Parsers {
    public static Parser<DatabasePageQueryParam, PageQueryParam> newPageQueryParamParser() {
        return new PageQueryParamParser();
    }
}
