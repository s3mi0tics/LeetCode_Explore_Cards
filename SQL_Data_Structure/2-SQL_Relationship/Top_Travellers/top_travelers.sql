SELECT
    name,
    sum(IFNULL(distance, 0)) AS travelled_distance
FROM
    users
    LEFT JOIN rides ON users.id = rides.user_id
GROUP BY
    name,
    users.id
ORDER BY
    travelled_distance DESC,
    name ASC;

