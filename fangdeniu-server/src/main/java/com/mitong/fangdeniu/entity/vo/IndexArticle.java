package com.mitong.fangdeniu.entity.vo;

import com.mitong.fangdeniu.entity.po.Article;

import java.util.List;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-4
 * @decription
 */
public class IndexArticle {
    /**
     * 总页数
     * */
    private int pageCount;

    /**
     * 文章列表
     * */
    private List<Article> articles;

    public IndexArticle(int pageCount, List<Article> articles) {
        this.pageCount = pageCount;
        this.articles = articles;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public IndexArticle() {
    }
}
