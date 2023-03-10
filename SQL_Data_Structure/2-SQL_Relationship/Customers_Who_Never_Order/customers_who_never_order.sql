# Write your MySQL query statement below
SELECT
    customers.name AS "Customers"
FROM
    customers
WHERE
    customers.Id NOT IN (
        SELECT
            customerId
        FROM
            orders
    );