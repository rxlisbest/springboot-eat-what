use `eat_what`;

-- 用户表
CREATE TABLE IF NOT EXISTS  `food` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '用户ID',
  `name` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '名称',
  `image_file_id` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '图片ID',
  `content` TEXT COMMENT '内容',
  `create_time` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '创建时间',
  `update_time` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX user_id (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='菜谱表';