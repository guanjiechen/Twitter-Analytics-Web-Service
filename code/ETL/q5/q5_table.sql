DROP TABLE IF EXISTS `timeplace_q5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timeplace_q5` (
  `time` timestamp NOT NULL,
  `place` char(30) NOT NULL,
  `tweet_id` bigint unsigned NOT NULL
) ENGINE=MyISAM;
/*!40101 SET character_set_client = @saved_cs_client */;