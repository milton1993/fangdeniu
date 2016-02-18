DROP DATABASE IF EXISTS `fangdeniu`;

CREATE DATABASE IF NOT EXISTS `fangdeniu` DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_general_ci;

USE `fangdeniu`;

CREATE TABLE `article` (
  id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL DEFAULT '' COMMENT '文章标题',
  abstract VARCHAR(100) NOT NULL DEFAULT '' COMMENT '文章摘要',
  content TEXT NOT NULL DEFAULT '' COMMENT '文章内容',
  read_count INT NOT NULL DEFAULT 0 COMMENT '阅读数量',
  read_time LONG NOT NULL DEFAULT 0 COMMENT '最后阅读时间',
  image_path VARCHAR(50) DEFAULT '' COMMENT '展示图片路径',
  save_time LONG NOT NULL DEFAULT 0 COMMENT '保存日期',
  update_time LONG NOT NULL DEFAULT 0 COMMENT '最近修改日期',
  INDEX idx_article_title(title),
  INDEX idx_article_save_time(save_time),
  INDEX idx_article_update_time(update_time),
  INDEX idx_article_read_time(read_time)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '文章表';

CREATE TABLE `comment` (
  id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  commenter_name VARCHAR(50) NOT NULL DEFAULT '' COMMENT '评论者名称',
  commenter_email VARCHAR(50) NOT NULL DEFAULT '' COMMENT '评论者邮件',
  commenter_website VARCHAR(50) NOT NULL DEFAULT '' COMMENT '评论者网站',
  comment_content text NOT NULL DEFAULT '' COMMENT '评论内容',
  comment_time LONG NOT NULL DEFAULT 0 COMMENT '评论事件',
  INDEX idx_comment_time(comment_time)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '评论表';