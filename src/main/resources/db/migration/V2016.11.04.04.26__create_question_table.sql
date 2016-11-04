CREATE TABLE `QUESTION` (
  `id`             BIGINT(20) NOT NULL AUTO_INCREMENT,
  `description`    TEXT,
  `selection`      TEXT,
  `correct_answer` TEXT,
  `type`           VARCHAR(20),
  `difficulty`     VARCHAR(10),
  `bank_id`        BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
