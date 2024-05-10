package model;

import java.util.ArrayList;
import java.util.List;

public class DeliveryExecutive {
    Location currentLocation;
    List<Order> assignedOrders = new ArrayList<>();

    public DeliveryExecutive(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    void assignOrder(Order order) {
        assignedOrders.add(order);
    }

    double calculateRouteTime() {
        double totalTravelTime = 0;
        Location lastLocation = this.currentLocation;
        for (Order order : assignedOrders) {
            totalTravelTime += Math.max(Location.distance(lastLocation, order.restaurant), order.preparationTime);
            totalTravelTime += Location.distance(order.restaurant, order.customer);
            lastLocation = order.customer;
        }
        return totalTravelTime;
    }

}
