/*
SQL - Assignment 11
Carson Pemble
11/10/20
*/

SELECT Itemcode, AVG(Qtyavailable) AS "Average Quantity"
FROM Retailstock
GROUP BY Itemcode
HAVING AVG(Qtyavailable) < 75;
