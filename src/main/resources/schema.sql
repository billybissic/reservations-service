DROP TABLE IF EXISTS `contact_times`;
CREATE TABLE `contact_times` (
  `contact_timeframe_id` int(11) NOT NULL AUTO_INCREMENT,
  `contact_timeframe` varchar(255) DEFAULT NULL,
  `contact_timeframe_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`contact_timeframe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `inquiry_types`;
CREATE TABLE `inquiry_types` (
  `inquiry_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `inquiry_type_name` varchar(255) DEFAULT NULL,
  `inquiry_type_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`inquiry_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `inquiry_status`;
CREATE TABLE `inquiry_status` (
  `inquiry_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `inquiry_status_name` varchar(255) DEFAULT NULL,
  `inquiry_status_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`inquiry_status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

CREATE TABLE `inquiries` (
  `inquiry_id` int(11) NOT NULL AUTO_INCREMENT,
  `inquiry_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `day_phone_number` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `contact_time_id` int(11) DEFAULT NULL,
  `inquiry_type_id` int(11) DEFAULT NULL,
  `inquiry_status_id` int(11) DEFAULT NULL,
  `message` text,
  PRIMARY KEY (`inquiry_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


