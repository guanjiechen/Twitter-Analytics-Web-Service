DROP PROCEDURE IF EXISTS q4;
Delimiter //
CREATE PROCEDURE q4(IN time TIMESTAMP)
BEGIN
SELECT tweet_id, tweet_text FROM tweets_q4 WHERE tweet_time = time;
END;
//
Delimiter ;
