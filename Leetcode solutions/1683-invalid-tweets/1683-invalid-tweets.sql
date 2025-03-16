# Write your MySQL query statement below
select tweet_id
from tweets
where length(content) > 15 

/*
# Write your MySQL query statement below
SELECT tweet_id 
FROM Tweets 
where CHAR_LENGTH(content) > 15;
*/
