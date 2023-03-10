# Write your MySQL query statement below
SELECT
    DISTINCT user_id,
    count(DISTINCT follower_id) AS followers_count
FROM
    followers
GROUP BY
    user_id
ORDER BY
    user_id ASC;