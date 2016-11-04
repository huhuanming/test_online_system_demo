CREATE TABLE `SUBMIT_ANSWER` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `question_id` varchar(64) NOT NULL,
  `logical_answer` text NOT NULL,
  `logical_time` datetime DEFAULT NULL,
  `session_id` varchar(64) NOT NULL,
  `program_answer` text NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `submits_counts` text NOT NULL,
  `gap_times` text DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
