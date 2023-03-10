# Write your MySQL query statement below
-- Solution 1 (If condition)
-- IF(condition, value_if_true, value_if_false)
SELECT
    employee_id,
    IF(
        employee_id % 2 <> 0
        AND name NOT LIKE 'M%',
        salary,
        0
    ) AS bonus
FROM
    Employees
ORDER BY
    employee_id;

-- Solution 2 (case statement)
SELECT
    employee_id,
    CASE
        WHEN employee_id % 2 <> 0
        AND name NOT LIKE 'M%' THEN salary
        ELSE 0
    END AS bonus
FROM
    Employees
ORDER BY
    employee_id;

-- Solution 3 (simple)
SELECT
    employee_id,
    salary * (employee_id % 2) * (name NOT LIKE 'M%') AS bonus
FROM
    Employees
ORDER BY
    employee_id;

-- Solution 4 (union statement)
-- select entries with odd employee id and name not start with M
SELECT
    employee_id,
    salary AS bonus
FROM
    Employees
WHERE
    employee_id % 2 <> 0
    AND name NOT LIKE 'M%' -- join both selection
UNION
-- select remaining entries form table
SELECT
    employee_id,
    0 AS bonus
FROM
    Employees
WHERE
    employee_id % 2 = 0
    OR name LIKE 'M%'
ORDER BY
    employee_id;