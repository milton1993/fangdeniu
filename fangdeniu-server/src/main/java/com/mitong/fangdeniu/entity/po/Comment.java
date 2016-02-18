package com.mitong.fangdeniu.entity.po;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-4
 * @decription
 */
public class Comment {
    private int id;
    private String commenterName;
    private String commenterEmail;
    private String commenterWebsite;
    private String commentContent;
    private long commentTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommenterName() {
        return commenterName;
    }

    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName;
    }

    public String getCommenterEmail() {
        return commenterEmail;
    }

    public void setCommenterEmail(String commenterEmail) {
        this.commenterEmail = commenterEmail;
    }

    public String getCommenterWebsite() {
        return commenterWebsite;
    }

    public void setCommenterWebsite(String commenterWebsite) {
        this.commenterWebsite = commenterWebsite;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public long getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(long commentTime) {
        this.commentTime = commentTime;
    }

    public Comment(int id, String commenterName, String commenterEmail, String commenterWebsite, String commentContent,
            long commentTime) {
        this.id = id;
        this.commenterName = commenterName;
        this.commenterEmail = commenterEmail;
        this.commenterWebsite = commenterWebsite;
        this.commentContent = commentContent;
        this.commentTime = commentTime;
    }

    public Comment() {
    }
}
