Ecommerce Order Processing

Ecommerce website that calls various microservices using Spring Boot that backs a database schema created in PostgreSQL.
Uses Java 8 as the programming language, Spring Boot, Spring Data JPA for building microservices (REST APIs), database as PostgreSQL.

1) This application follows Database Normalization.
2) Provides an ability to have more than one item per order
3) Provides an ability to pay order by accepting more than one payment transactions.
4) Uses appropriate HTTP verbs.

Some of the RESTful APIs used are:
1) get order by Id
2) create an order
3) delete an order

Data is entered in JSON format.
Some of the examples of data stored in the database side:

Orders Table:

 order_id | order_subtotal | order_shipping_charges | status | order_customer_fk
----------+----------------+------------------------+--------+-------------------
        1 |          115.5 |                  8.085 | New    |               103
        
Customers Table:

 order_custmer_id |        email         |  name  | order_shipping_addressline1 | order_shipping_addressline2 | order_shipping_city | order_shipping_state | order_shipping_zip
------------------+----------------------+--------+-----------------------------+-----------------------------+---------------------+----------------------+--------------------
              103 | aakash.jkh@gmail.com | Aakash | 6 W                         | Van Buren Way               | Hopewell Junction   | NY                   | 12533
            
Orders Line Table:

 item_id | item_name | item_price | item_quantity | order_tax | order_total | order_id_fk
---------+-----------+------------+---------------+-----------+-------------+-------------
       1 | Eggs      |          5 |            10 |       2.5 |          50 |           1
       2 | Cookies   |          3 |            20 |         3 |          60 |           1

Billing Address Table:

billing_id | order_billing_addressline1 | order_billing_addressline2 | order_billing_city | order_billing_state | order_billing_zip | order_id_fk
------------+----------------------------+----------------------------+--------------------+---------------------+-------------------+-------------
          1 | 6 W                        | Van Buren Way              | Hopewell Junction  | NY                  | 12533             | 1
          
Payments Table:

 payment_id |    payment_date     | order_id_fk
------------+---------------------+-------------
          2 | 2021-03-23 20:00:00 | 1
