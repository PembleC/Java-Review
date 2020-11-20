/*
SQL - Assignment 16
Carson Pemble
11/10/20
*/

SELECT I.Itemcode, I.Descr, NVL(TO_CHAR(R.Qtyavailable), 'N.A.') AS QTYAVAILABLE
FROM Item I LEFT OUTER JOIN Retailstock R ON R.Itemcode = I.Itemcode AND R.Roid = 'R1001';

/* NOT THIS
SELECT I.Itemcode, I.Descr, NVL(TO_CHAR(R.Qtyavailable), 'N.A.') AS QTYAVAILABLE
FROM Item I LEFT OUTER JOIN Retailstock R ON R.Itemcode = I.Itemcode
WHERE R.Roid = 'R1001'
*/
