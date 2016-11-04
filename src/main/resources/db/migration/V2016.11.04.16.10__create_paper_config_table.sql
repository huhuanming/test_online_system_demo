CREATE TABLE `PaperConfig` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `total_time` INT NULL COMMENT '总答题时间长，单位秒',
  `logic_total_time` INT DEFAULT NULL COMMENT '逻辑题答题时长，单位秒',
  `logic_total_question` INT DEFAULT NULL COMMENT '逻辑题数量',
  `programming_question` VARCHAR(255) NULL COMMENT '编程题难度及数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
