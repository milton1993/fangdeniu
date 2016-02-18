package com.mitong.fangdeniu.service;

import com.mitong.fangdeniu.entity.param.PageQueryParam;
import com.mitong.fangdeniu.entity.vo.IndexArticle;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-17
 * @decription
 */
public interface ArticleService {
    /**
     * 获取首页文章列表
     * @param params
     * @return
     * */
    IndexArticle getIndexArticles(PageQueryParam params);
}
