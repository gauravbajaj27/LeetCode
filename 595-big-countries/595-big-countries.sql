# Write your MySQL query statement below
SELECT name, population, area FROM World where ( World.area>=3000000 || World.population>=25000000 );