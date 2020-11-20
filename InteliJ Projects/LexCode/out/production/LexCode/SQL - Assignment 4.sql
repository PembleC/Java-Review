/*
SQL - Assignment 4
Carson Pemble
11/10/20
*/

SELECT Quotationid, Sname, Itemcode, Quotedprice, Qdate, Qstatus
FROM Quotation
WHERE Qstatus IN ('Rejected', 'Closed');
