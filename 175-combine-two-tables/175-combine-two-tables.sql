# Write your MySQL query statement below
Select Person.firstName, Person.lastName, Address.city, Address.state
From Person
LEFT JOIN Address ON Person.personId=Address.personId;