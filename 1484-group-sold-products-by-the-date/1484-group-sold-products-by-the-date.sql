# Write your MySQL query statement below
SELECT sell_date,           
		COUNT(DISTINCT(product)) AS num_sold,   #counting distinct products
		GROUP_CONCAT(DISTINCT product ORDER BY product ASC SEPARATOR ',') AS products #making a list of product alphabetically
FROM Activities
GROUP BY sell_date          #ordering
ORDER BY sell_date ASC