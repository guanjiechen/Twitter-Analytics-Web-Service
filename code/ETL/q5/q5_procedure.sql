Delimiter //
CREATE PROCEDURE q5(IN t1 timestamp, IN t2 timestamp, IN p char(40))
BEGIN
SELECT tweet_id FROM timeplace_q5 WHERE time BETWEEN t1 AND t2 AND place = p ORDER BY tweet_id;
END;
//
Delimiter ;