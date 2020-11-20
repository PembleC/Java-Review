/*
SQL - Assignment 13
Carson Pemble
11/10/20
*/

SELECT Job, AVG(Sal) AS "Average Salary"
FROM Emp
WHERE Job IN ('MANAGER', 'ANALYST')
GROUP BY Job HAVING AVG(Sal) > 1500;
