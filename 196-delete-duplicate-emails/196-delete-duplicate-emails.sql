# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

DELETE p1 from PERSON p1, PERSON p2
WHERE
p1.email=p2.email and p1.id>p2.id;

