DROP DATABASE IF EXISTS `fangdeniu`;

CREATE DATABASE IF NOT EXISTS `fangdeniu` DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_general_ci;

USE `fangdeniu`;

CREATE TABLE `article` (
  id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL DEFAULT '' COMMENT '文章标题',
  content TEXT NOT NULL DEFAULT '' COMMENT '文章内容',
  save_time LONG NOT NULL DEFAULT 0 COMMENT '保存日期',
  update_time LONG NOT NULL DEFAULT 0 COMMENT '最近修改日期',
  INDEX idx_article_title(title),
  INDEX idx_article_save_time(save_time),
  INDEX idx_article_update_time(update_time)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '文章表';