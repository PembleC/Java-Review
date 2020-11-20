/*
SQL - Exercise 18
Carson Pemble
11/10/20
*/

SELECT EMP.Id, EMP.Ename, MGR.Id MGRID, MGR.Ename MGRNAME, C.Model E_MODEL, C2.Model M_MODEL
FROM Employee EMP INNER JOIN Employee MGR ON EMP.Manager = MGR.Id
INNER JOIN Computer C ON EMP.Compid = C.Compid
INNER JOIN Computer C2 ON MGR.Compid = C2.Compid
WHERE EMP.Compid IS NOT NULL AND MGR.Compid IS NOT NULL;
