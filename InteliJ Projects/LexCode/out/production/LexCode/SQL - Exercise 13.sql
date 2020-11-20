/*
SQL - Exercise 13
Carson Pemble
11/10/20
*/

SELECT E.Id, E.Ename, E.Compid, C.Make
From Employee E INNER JOIN Computer C
ON E.Compid = C.Compid AND C.Model IN('Precision', 'Edge');
