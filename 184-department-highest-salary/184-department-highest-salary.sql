# Write your MySQL query statement below

SELECT 
Department.name as 'Department',
Employee.name as 'Employee',
Employee.salary as 'Salary'
FROM 
Employee INNER JOIN Department 
ON Employee.departmentID=Department.ID
WHERE  
(Employee.DepartmentId, Salary)
IN
(SELECT  departmentId, Max(Salary) FROM Employee GROUP BY DepartmentId);

