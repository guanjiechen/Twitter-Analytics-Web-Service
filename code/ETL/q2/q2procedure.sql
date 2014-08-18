Delimiter //
CREATE PROCEDURE q2(IN timein timestamp, IN userin INT UNSIGNED)
BEGIN
SELECT tweet_id FROM tweets_q2 WHERE time = timein AND user_id = userin; 
END;
//
Delimiter ;
