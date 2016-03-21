package com.mitong.fangdeniu.service;

import com.google.common.base.Preconditions;
import com.mitong.fangdeniu.dao.ArticleDao;
import com.mitong.fangdeniu.entity.param.PageQueryParam;
import com.mitong.fangdeniu.entity.parser.Parsers;
import com.mitong.fangdeniu.entity.po.Article;
import com.mitong.fangdeniu.entity.vo.IndexArticle;
import com.mitong.fangdeniu.exception.ParamNotValidException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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

    @Resource
    private ArticleDao articleDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, timeout = 2000, readOnly = false, rollbackFor = {
            Exception.class })
    public IndexArticle getIndexArticles(PageQueryParam params) {
        Preconditions.checkNotNull(params);
        if (params.getPageIndex() > 0 && params.getPageSize() > 0) {
            List<Article> articles = articleDao.pageQueryArticles(Parsers.newPageQueryParamParser().parse(params));
            int pageCount = articleDao.queryTotalPageCount(params.getPageSize());
            return new IndexArticle(pageCount, articles);
        } else {
            throw new RuntimeException(new ParamNotValidException("Params are illegal!"));
        }
    }
}
