

-- 4. Find the total revenue generated for each month.
USE sakila
SHOW TABLES
SELECT * FROM payment
SELECT MONTH(payment_date), SUM(amount) FROM payment
GROUP BY MONTH(payment_date)