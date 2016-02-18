package com.mitong.fangdeniu.service;

import com.google.common.base.Preconditions;
import com.mitong.fangdeniu.entity.param.PageQueryParam;
import com.mitong.fangdeniu.entity.po.Article;
import com.mitong.fangdeniu.entity.vo.IndexArticle;
import com.mitong.fangdeniu.exception.ParamNotValidException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-17
 * @decription
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleServiceImpl.class);

    @Override
    public IndexArticle getIndexArticles(PageQueryParam params) {
        Preconditions.checkNotNull(params);
        if (params.getPageIndex() > 0 && params.getPageSize() > 0) {

            List<Article> articles = null;

        } else {
            throw new RuntimeException(new ParamNotValidException("Params are illegal!"));
        }
        return null;
    }
}
