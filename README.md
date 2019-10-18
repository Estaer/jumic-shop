# Jumic
Jumic is a sample online platform for sellers to showcase their items for sale, 
and consumers to make purchases and enable then either pay online, or pay on delivery.
Jumic is growing quite large and in order to enable sellers drop-ship conveniently, 
they have acquired warehouses to store the goods of sellers that choose to keep their items with them.

#### **What you need to know.**

```A customer shopping has 3 options from the Jumic catalog.

Jumic first - Shipping price is slightly higher than normal shipping, but 2-day delivery is guaranteed. Delivery is Priority 1.
Jumic Global - Shipping price is normal, but the item is yet to be purchased and imported from overseas. Delivery is Priority 2.
Typically taking 8-10 days delivery time to the destination country + 2-day delivery to the customer.
Jumic Normal Shipping - Shipping price is low, but delivery takes 4 to 7 days to the customer. Delivery is priority 3.

Items under Jumic first and Jumic global depart from the Jumic warehouse to the customer directly.
Items under Jumic normal shipping are picked up from the seller with 3 days after an order. 
The items are then sent to the warehouse. The item is then sent to the seller.

Task 1: Creating / managing orders

Task lessons:
Use of random, collection, date, regex, math, iteration and validation functions + Object Oriented Programming.
Possible uses of Thread class / Runnable & Volatile constructs.
a. Create different catalog types
b. Generate 200 random items available for ordering. Each item should have a 
  unique name, 
  price (between 1.00 and 9.99), 
  description (optional), 
  a catalog type (randomly assigned from the 3 catalogs above)
c. Generate a random order every 5 minutes. Maximum order threshold should be 100 orders. Minimum order threshold should be 20 orders.
d. Each order should contain 
  order id
  List<Item> (between 1 and 5 items)
  total_item_price (total price of items in the order)
  Delivery delivery (a delivery object)
  Customer customer (a customer object)
e. The Customer object should contain
  unique customer id
  name (random string name)
  email (must be valid email)
  phone number (must be valid with ISO E164 format)
  
f. The delivery object should contain:
  unique id
  * location (the delivery location)
  * date (see below to calculate delivery date)
  * price (see below to calculate delivery price)
  preferred_day (customer preferred day of the week for delivery e.g. Saturday)
  
Location:

This is between Area1 < AreaX < Area10. Randomly generate and assign during generation of Delivery object.
  Area1 is 1km away, Area10 is 10km away, etc.
Delivery date:  Jumic first = 2 days from today (fixed)
                Jumic Global = 10 to 12 days from today (variable. use random days between 10 and 12)
                Jumic Normal = 4 to 7 days (variable. use random days between 4 and 7)
                If "preferred_day" is selected, adjust delivery date to next best day to deliver to customer.
Delivery price: 
                Jumic First = absoulte value of (10 + (100% of X)) rounded up
                Jumic Global = absoulte value of (5 + (50% of X)) rounded up
                Jumic Normal = absoulte value of (2 + (20% of X)) rounded up
                where X = AreaX e.g. for Area5, X=5. for Area8, X=8
                
Task 2: Managing Deliveries

Task Lessons:
Use of collections --> Queue implementations, date, JavaFX, Observables, etc.
When an order is placed, a delivery action must occur.
Decide on a Queue or Stack implementation to perform deliveries based on priorities.
Orders with catalog type Jumic Normal have least priority.
Orders with catalog type Jumic Global have medium priority
Orders with catalog type Jumic First have the highest priority
Create a JavaFX app to manage deliveries. No user security / login required.
On application start, generate 100 orders in the background (from Task 1 above).
Display these orders in an "Orders" tab of the application.
The orders should be sorted based on their priority.
"Orders awaiting pickup" should be separated from "Orders in Transit". For orders in transit, display expected delivery time, customer name, and delivery id. 
Once these orders are queued, spawn delivery personnel to perform the deliveries.

A minimum of 1 delivery personnel, and a maximum of 5 delivery personnel should be spawned. 
Spawn a delivery personnel every minute until thresholds are reached.
a. Once a delivery personnel starts a delivery, it should leave the "Orders awaiting pickup" queue and join the "Orders in Transit" queue.
b. Once a delivery personnel starts a delivery, she is not available for another delivery until she returns.
c. Delivery times should take into consideration the Location (Area1 to Area10) and account for distance. 
A rider may set off to Area10 just a minute before a second rider sets off to Area1, 
but the 2nd rider will return before the first rider because the distance to Area1 is short.
d. The orders in the queue should take into consideration the "catalog type" and "preferred_day" to prioritize deliveries accordingly.
There should be a "Rider" tab that shows all riders. Available (free) riders should be separated from riders performing deliveries. 

For riders performing deliveries, display the order id, and expected time to return. 
```

##### PS: Just using this as a sample project to practice a couple of java fundamental concepts.
_**Here's how to contribute. Feel free!**_

