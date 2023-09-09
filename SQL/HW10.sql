--1
SELECT city.city, country.country FROM city
LEFT JOIN country ON city.country_id = country.country_id;

--2
SELECT payment.payment_id, customer.first_name, customer.last_name FROM CUSTOMER
RIGHT JOIN payment ON payment.customer_id = customer.customer_id;

--3
SELECT rental.rental_id, customer.first_name, customer.last_name FROM customer
FULL JOIN rental ON rental.customer_id = customer.customer_id;