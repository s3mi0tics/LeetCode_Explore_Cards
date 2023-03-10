-- 3 Different solutions (JOIN, NOT IN, NOT EXISTS)
-- Solution 1 using JOIN:
# Write your MySQL query statement below
SELECT
    customer_id,
    count(visits.visit_id) AS count_no_trans
FROM
    visits
    LEFT JOIN transactions ON visits.visit_id = transactions.visit_id
WHERE
    transaction_id IS NULL
GROUP BY
    customer_id;

-- Solution 2 using NOT IN
# Write your MySQL query statement below
SELECT
    customer_id,
    count(visits.visit_id) AS count_no_trans
FROM
    visits
WHERE
    visit_id NOT IN (
        SELECT
            visit_id
        FROM
            transactions
    )
GROUP BY
    customer_id;

-- Solution 3 using NOT EXISTS
# Write your MySQL query statement below
SELECT
    customer_id,
    count(visits.visit_id) AS count_no_trans
FROM
    visits
WHERE
    NOT EXISTS (
        SELECT
            visit_id
        FROM
            transactions
        WHERE
            visits.visit_id = transactions.visit_id
    )
GROUP BY
    customer_id;