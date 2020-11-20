/*
SQL - Assignment 14
Carson Pemble
11/10/20
*/

SELECT job, deptno, AVG(Sal) AVGSALARY
FROM Emp
WHERE deptno IN(10,20) AND Sal > 2000
GROUP BY job, deptno
HAVING AVG(Sal) > 2500;
