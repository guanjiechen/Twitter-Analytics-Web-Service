DROP TABLE IF EXISTS `tweets_q2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tweets_q2` (
  `time` timestamp NOT NULL,
  `user_id` int unsigned NOT NULL,
  `tweet_id` text NOT NULL
) ENGINE=MyISAM;
/*!40101 SET character_set_client = @saved_cs_client */;
