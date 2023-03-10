SELECT
    u.user_id AS buyer_id,
    u.join_date,
    count(o.order_id) AS orders_in_2019
FROM
    users u
    LEFT JOIN orders o ON o.buyer_id = u.user_id
    AND year(order_date) = "2019"
GROUP BY
    u.user_id