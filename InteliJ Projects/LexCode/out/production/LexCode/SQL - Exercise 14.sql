/*
SQL - Exercise 14
Carson Pemble
11/10/20
*/

SELECT E.Dept, COUNT(C.Make) "NUMBER OF COMPUTERS"
FROM Employee E INNER JOIN Computer C
ON E.Compid = C.Compid
WHERE C.Make = 'Dell'
GROUP BY E.dept;
