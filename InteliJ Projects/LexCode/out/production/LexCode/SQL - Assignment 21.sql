/*
SQL - Assignment 21
Carson Pemble
11/10/20
*/

SELECT I.Itemcode, I.Descr, Q.Sname


Q.Qstatus = 'Accepted'
O.Status = 'Delivered'

SELECT I.Itemcode, I.Descr, Q.Sname
FROM Quotation Q FULL JOIN Orders O ON Q.Quotationid = O.Quotationid
FULL JOIN Item I ON I.Itemcode = Q.Itemcode




SELECT I.Itemcode, I.Descr, Q.Sname
FROM Item I LEFT JOIN Quotation Q ON I.Itemcode = Q.Itemcode
LEFT JOIN Orders O ON Q.Quotationid = O.Quotationid
WHERE Q.Sname IS NOT NULL
ORDER BY I.Itemcode
