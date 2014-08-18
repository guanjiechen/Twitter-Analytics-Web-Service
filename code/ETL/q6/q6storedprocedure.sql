DELIMITER //
CREATE PROCEDURE q6larger(IN min_user_id INT UNSIGNED)
BEGIN
SELECT tweetamount FROM retweets_q6_added WHERE userid = min_user_id;
END;
//
Delimiter;

DELIMITER //
CREATE PROCEDURE q6smaller(IN max_user_id INT UNSIGNED)
BEGIN
SELECT tweetamount FROM retweets_q6_added WHERE userid = max_user_id;
END;
//
Delimiter;

DELIMITER //
CREATE PROCEDURE q6addonemore(IN max_user_id INT UNSIGNED)
BEGIN
SELECT tweetamount FROM retweets_q6 WHERE userid = max_user_id;
END;
//
Delimiter;