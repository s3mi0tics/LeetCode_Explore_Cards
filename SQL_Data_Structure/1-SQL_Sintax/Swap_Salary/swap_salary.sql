
-- Solution 1 (case statement)
# Write your MySQL query statement below
UPDATE
    Salary
SET
    sex = CASE
        sex
        WHEN 'm' THEN 'f'
        ELSE 'm'
    END;


-- Solution 2 (If condition)
# Write your MySQL query statement below
UPDATE
    Salary
SET
    sex = IF (sex = 'm', 'f', 'm');