-- Write your PostgreSQL query statement below
SELECT e1.name AS Employee FROM Employee e1 ,Employee e2
 WHERE e2.id = e1.managerId AND e2.salary < e1.salary 