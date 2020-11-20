/*
SQL - Assignment 15
Carson Pemble
11/10/20
*/

SELECT E.Ename, V.Vehiclename
FROM Emp E LEFT OUTER JOIN Empvehicle EV ON E.Empno = EV.Empno
LEFT OUTER JOIN Vehicle V ON EV.Vehicleid = V.Vehicleid;
