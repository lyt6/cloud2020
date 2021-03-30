CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `age` tinyint(2) DEFAULT '0' COMMENT '年龄',
  `phone` varchar(128) DEFAULT NULL COMMENT '手机号',
  `deleted` tinyint(1) DEFAULT '0' COMMENT '是否删除 0否 1是',
  PRIMARY KEY (`id`),
  KEY `index_name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户表'

