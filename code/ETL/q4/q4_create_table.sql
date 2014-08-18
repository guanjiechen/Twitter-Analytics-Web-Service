/*mysql --local-infile -u root -psupernova twitter_db
mysql -u root -psupernova twitter_db*/

DROP TABLE IF EXISTS `tweets_q4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tweets_q4` (
  `tweet_time` TIMESTAMP NOT NULL,
  `tweet_text` TEXT NOT NULL,
  PRIMARY KEY('tweet_time')
) ENGINE=MyISAM;
/*!40101 SET character_set_client = @saved_cs_client */;