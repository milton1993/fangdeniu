package com.mitong.fangdeniu.entity.po;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-4
 * @decription
 */
public class Article {
    private int id;
    private String title;
    private String abstractContent;
    private String content;
    private int readCount;
    private long readTime;
    private String imagePath;
    private long saveTime;
    private long updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractContent() {
        return abstractContent;
    }

    public void setAbstractContent(String abstractContent) {
        this.abstractContent = abstractContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public long getReadTime() {
        return readTime;
    }

    public void setReadTime(long readTime) {
        this.readTime = readTime;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public long getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(long saveTime) {
        this.saveTime = saveTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public Article(int id, String title, String abstractContent, String content, int readCount, long readTime, String imagePath, long saveTime, long updateTime) {
        this.id = id;
        this.title = title;
        this.abstractContent = abstractContent;
        this.content = content;
        this.readCount = readCount;
        this.readTime = readTime;
        this.imagePath = imagePath;
        this.saveTime = saveTime;
        this.updateTime = updateTime;
    }

    public Article() {
    }
}
