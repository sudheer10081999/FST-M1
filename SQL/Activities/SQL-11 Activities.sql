REM   Script: Session 02
REM   FST

Create table salesman(salesman_id int,salesman_name varchar(20),salesman_city varchar(20),commission int);

select  
    "SALESMAN_ID", 
    "SALESMAN_NAME", 
    "SALESMAN_CITY", 
    "COMMISSION" 
from "SALESMAN";

select  
    "SALESMAN_ID", 
    "SALESMAN_NAME", 
    "SALESMAN_CITY", 
    "COMMISSION" 
from "SALESMAN";

Describe Salesman


select  
    "SALESMAN_ID", 
    "SALESMAN_NAME", 
    "SALESMAN_CITY", 
    "COMMISSION" 
from "SALESMAN";

Describe Salesman


Create table salesman(salesman_id int,salesman_name varchar(20),salesman_city varchar(20),commission int);

DESCRIBE salesman


Create table salesman(salesman_id int,salesman_name varchar(20),salesman_city varchar(20),commission int);

DESCRIBE salesman


INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesman;

-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';


-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesman;

-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';


-- Activity-3
-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesman;

-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';


-- Activity-4
-- Add the grade column
ALTER TABLE salesman ADD grade int;

-- Update the values in the grade column
UPDATE salesman SET grade=100;

-- Display data
SELECT * FROM salesman;


-- Activity-5
-- Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

-- Update the grade score of James Hoog to 300.
UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

-- Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

-- Display modified data
SELECT * FROM salesman;


-- Activity-6
-- Create a table named orders
create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);

-- Add values to the table
INSERT ALL
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)
SELECT 1 FROM DUAL;


-- Activity-6-
-- Get all salesman ids without any repeated values
select distinct salesman_id from orders;

-- Display the order number ordered by date in ascending order
select order_no, order_date from orders order by order_date;

-- Display the order number ordered by purchase amount in descending order
select order_no, purchase_amount from orders order by purchase_amount DESC;

-- Display the full data of orders that have purchase amount less than 500.
select * from orders where purchase_amount < 500;

-- Display the full data of orders that have purchase amount between 1000 and 2000.
select * from orders where purchase_amount between 1000 and 2000;


-- Activity-7
-- Write an SQL statement to find the total purchase amount of all orders.
select SUM(purchase_amount) AS "Total sum" from orders;

-- Write an SQL statement to find the average purchase amount of all orders.
select AVG(purchase_amount) AS "Average" from orders;

-- Write an SQL statement to get the maximum purchase amount of all the orders.
select MAX(purchase_amount) AS "Maximum" from orders;

-- Write an SQL statement to get the minimum purchase amount of all the orders.
select MIN(purchase_amount) AS "Minumum" from orders;

-- Write an SQL statement to find the number of salesmen listed in the table.
select COUNT(distinct salesman_id) AS "Total count" from orders;


-- Activity-8
-- Write an SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount.
SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id;

-- Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

-- Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list 2030, 3450, 5760, and 6000.
SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders
GROUP BY customer_id, order_date
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);


-- Activity-9
-- Write an SQL statement to know which salesman are working for which customer.
SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman
SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a 
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300 
ORDER BY a.customer_id;

-- Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
WHERE b.commission>12;

-- Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.
SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;


-- Activity-10
-- Write a query to find all the orders issued against the salesman who may works for customer whose id is 3007.
SELECT * FROM orders
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

-- Write a query to find all orders attributed to a salesman in New York.
SELECT * FROM orders
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

-- Write a query to count the customers with grades above New York's average.
SELECT grade, COUNT(*) FROM customers
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE salesman_city='New York');

-- Write a query to extract the data from the orders table for those salesman who earned the maximum commission
SELECT order_no, purchase_amount, order_date, salesman_id FROM orders
WHERE salesman_id IN( SELECT salesman_id FROM salesman
WHERE commission=( SELECT MAX(commission) FROM salesman));


-- Activity-11
-- Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order
SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, salesman_name FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;

-- Write a query to make a report of which salesman produce the largest and smallest orders on each date.
SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on', b.order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT a.salesman_id, a.salesman_name, b.order_no, 'lowest on', b.order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);


