use `eat_what`;

-- 用户表
CREATE TABLE IF NOT EXISTS  `file` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '用户ID',
  `domain` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '域名',
  `key` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '文件名',
  `content_type` VARCHAR(255) NOT NULL DEFAULT '' COMMENT 'Content-Type',
  `number` INT(11) NOT NULL DEFAULT 0 COMMENT '文件数量',
  `transcoding_code` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '转码code',
  `source_key` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '源文件文件名',
  `source_content_type` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '源文件Content-Type',
  `create_time` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '创建时间',
  `update_time` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX user_id (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='文件表';