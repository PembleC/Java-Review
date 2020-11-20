/*
SQL - Exercise 19
Carson Pemble
11/10/20
*/

SELECT E.Empname, E.Designation, E.Emailid
FROM Empdetails E
WHERE Worksin = 'R1001' AND E.Empname <> 'George'
