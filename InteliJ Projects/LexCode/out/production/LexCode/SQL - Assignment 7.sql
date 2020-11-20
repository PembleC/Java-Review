/*
SQL - Assignment 7
Carson Pemble
11/10/20
*/

SELECT Orderid, Quotationid, Status
FROM Orders
WHERE Orderdate BETWEEN '1-Dec-2014' AND '1-Jan-2015';
