use twitter_db;
LOAD DATA LOCAL INFILE '~/twitter/q6output' INTO TABLE retweets_q6 FIELDS TERMINATED BY '\t' LINES TERMINATED BY '\n';
LOAD DATA LOCAL INFILE '~/twitter/q6addoutput' INTO TABLE retweets_q6_added FIELDS TERMINATED BY '\t' LINES TERMINATED BY '\n';