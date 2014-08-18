DROP PROCEDURE IF EXISTS q3;
Delimiter //
CREATE PROCEDURE q3(IN id VARCHAR(15))
BEGIN
SELECT retweet FROM retweets_q3 WHERE origin = id;
END;
//
Delimiter ;