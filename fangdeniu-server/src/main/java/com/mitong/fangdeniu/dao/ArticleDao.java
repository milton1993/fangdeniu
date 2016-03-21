package com.mitong.fangdeniu.dao;

import com.mitong.fangdeniu.entity.param.DatabasePageQueryParam;
import com.mitong.fangdeniu.entity.po.Article;
import java.util.List;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-17
 * @decription
 */
public interface ArticleDao {
    /**
     * 分页查询
     * @param parse
     * @return
     * */
    List<Article> pageQueryArticles(DatabasePageQueryParam parse);

    /**
     * 查询总页数
     * @param pageSize
     * @return
     * */
    int queryTotalPageCount(int pageSize);
}
