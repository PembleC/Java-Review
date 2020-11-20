/*
SQL - Assignment 12
Carson Pemble
11/10/20
*/

SELECT Sname, AVG(QuotedPrice) AS "Average quoted price"
FROM Quotation
WHERE Qstatus = 'Closed'
GROUP BY Sname
HAVING AVG(QuotedPrice) > 500;
