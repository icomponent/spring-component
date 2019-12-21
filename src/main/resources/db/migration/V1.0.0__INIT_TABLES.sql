-- 创建用户表
CREATE TABLE user (
  id bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  username varchar(255) NOT NULL DEFAULT '' COMMENT '用户名',
  password varchar(255) NOT NULL DEFAULT '' COMMENT '密码',
  PRIMARY KEY (id),
  UNIQUE KEY (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
