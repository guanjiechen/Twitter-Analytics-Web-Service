DROP TABLE IF EXISTS `timeplace_q6`;
CREATE TABLE `retweets_q6` (   
	`userid` INT( 11 ) UNSIGNED NOT NULL,   
	`tweetamount` INT( 11 ) NOT NULL,   
	PRIMARY KEY (`userid`) 
) ENGINE=MyISAM;

DROP TABLE IF EXISTS `timeplace_q6_added`;
CREATE TABLE `retweets_q6_added` (   
	`userid` INT( 11 ) UNSIGNED NOT NULL,   
	`tweetamount` INT( 11 ) NOT NULL,   
	PRIMARY KEY (`userid`) 
) ENGINE=MyISAM;
