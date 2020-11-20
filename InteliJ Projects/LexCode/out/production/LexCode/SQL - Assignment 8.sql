/*
SQL - Assignment 8
Carson Pemble
11/10/20
*/

SELECT Orderid, Status, NVL(Pymtmode, 'Payment yet not done') AS PYMTMODE
FROM Orders;
