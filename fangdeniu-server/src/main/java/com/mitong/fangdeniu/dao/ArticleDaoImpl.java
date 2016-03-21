package com.mitong.fangdeniu.dao;


import com.mitong.fangdeniu.entity.param.DatabasePageQueryParam;
import com.mitong.fangdeniu.entity.po.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-19
 * @decription
 */
@Repository
public class ArticleDaoImpl implements ArticleDao {
    @Override
    public List<Article> pageQueryArticles(DatabasePageQueryParam parse) {
        return null;
    }

    @Override
    public int queryTotalPageCount(int pageSize) {
        return 0;
    }
}
