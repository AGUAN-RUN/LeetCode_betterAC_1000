/*SQL架构
Table: Person

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| PersonId    | int     |
| FirstName   | varchar |
| LastName    | varchar |
+-------------+---------+
PersonId is the primary key column for this table.
Table: Address

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| AddressId   | int     |
| PersonId    | int     |
| City        | varchar |
| State       | varchar |
+-------------+---------+
AddressId is the primary key column for this table.


Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:

FirstName, LastName, City, State*/
/*MYSQL*/
SELECT PSN.FIRSTNAME,PSN.LASTNAME,ADR.CITY,ADR.STATE FROM PERSON PSN LEFT JOIN ADDRESS ADR ON PSN.PERSONID=ADR.PERSONID;
/*ORACLE   oarcle执行一个测试用例正确  全部7个测试用例超时？？*/
SELECT PSN.FIRSTNAME,PSN.LASTNAME,ADR.CITY,ADR.STATE FROM PERSON PSN LEFT JOIN ADDRESS ADR ON PSN.PERSONID=ADR.PERSONID;