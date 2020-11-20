/*
SQL - Assignment 18
Carson Pemble
11/10/20
*/

SELECT I.Itemcode, Q.Sname, O.Qtyordered
FROM Item I INNER JOIN Quotation Q ON I.Itemcode = Q.Itemcode
INNER JOIN Orders O ON O.Quotationid = Q.Quotationid
WHERE Qtyordered >= 100;


SELECT I.Itemcode, Q.Sname, SUM(O.Qtyordered)
FROM Item I INNER JOIN Quotation Q ON I.Itemcode = Q.Itemcode
INNER JOIN Orders O ON O.Quotationid = Q.Quotationid
GROUP BY I.Itemcode
HAVING SUM(O.Qtyordered) > 100
