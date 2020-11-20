/*
SQL - Exercise 17
Carson Pemble
11/10/20
*/

SELECT S.Sid, S.Sname,  NVL(SUM(SD.Quantity * P.Price), 0) AS Tamount, NVL(SUM(SD.Quantity*P.Discount/100*P.Price),0) AS TDISCOUNT
FROM Salesman S LEFT OUTER JOIN Sale SA ON SA.Sid = S.Sid
LEFT OUTER JOIN Saledetail SD ON SA.Saleid = SD.Saleid
LEFT OUTER JOIN Product P ON SD.Prodid = P.Prodid
GROUP BY S.Sid, S.Sname;
