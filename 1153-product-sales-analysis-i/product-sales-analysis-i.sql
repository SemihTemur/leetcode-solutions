-- Write your PostgreSQL query statement below
SELECT s.year,s.price,p.product_name  FROM Sales s 
INNER JOIN  Product p on p.product_id = s.product_id
