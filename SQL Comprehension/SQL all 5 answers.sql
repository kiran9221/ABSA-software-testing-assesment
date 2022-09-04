--first answer
select count(*) from customers;


--second **
select e.reports_to, count(*) from employees e, employees emp where e.reports_to = emp.employee_id
group by e.reports_to;

--third --"Jose Pavarotti" SAVEA 31 orders
select a.contact_name, a.customer_id, count(b.order_id) as orders_made from customers a inner join orders b 
on a.customer_id = b.customer_id
group by a.customer_id

--fourth **
select order_date, count(order_id) from orders group by order_date

--fifth
select a.contact_name, a.customer_id, b.order_id , b.ship_via from customers a join orders b 
on a.customer_id = b.customer_id
where a.contact_name = 'Jose Pavarotti' and b.ship_via=2





