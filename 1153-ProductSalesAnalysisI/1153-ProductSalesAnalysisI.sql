-- Last updated: 10/3/2025, 2:12:34 PM
# Write your MySQL query statement below
select Product.product_name, sales.year,sales.price from sales join product on sales.product_id=product.product_id