DROP TABLE IF EXISTS `retweets_q3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `retweets_q3` (
  `origin` varchar(15) NOT NULL,
  `retweet` MEDIUMTEXT NOT NULL,
  PRIMARY KEY (`origin`)
) ENGINE=MyISAM;
/*!40101 SET character_set_client = @saved_cs_client */; 