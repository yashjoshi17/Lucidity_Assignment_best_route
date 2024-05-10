# Best Route - Machine Coding

### Author: Yash Joshi

## Approach

### Entities:

1. Location Class: Represents a geographical location with latitude and longitude.

2. Order Class: Represents an order which contains information about where the food needs to be picked up and where it needs to be delivered, along with the preparation time.

3. DeliveryExecutive Class: Represents a delivery executive responsible for picking up and delivering orders.

4. DeliveryPlanner Class: Manages the assignment of orders to delivery executives and calculating efficient routes.

### Features

1. Proximity based Order Assignment: Orders are assigned to the closest available delivery executive to minimize travel time.
2. Flexible Data Structures: The use of lists for both executives and orders makes it easy to scale up by adding more of either.
3. Simplistic Assignment Logic: The current assignment logic is quite basic and prioritizes proximity. For a real-world application, this could be improved with more sophisticated scheduling algorithms, taking into account factors like traffic, time constraints, and executive workloads.

### Assumptions

1. Since Delivery executives and Restaurants were informed about these orders at the exact same time and all of them confirm on doing it immediately,
total time taken  = max(preparation time, time to reach restaurant) + time to reach consumer.