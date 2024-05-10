package model;

import java.util.List;

public class DeliveryPlanner {
    List<DeliveryExecutive> deliveryExecutives;
    List<Order> allOrders;

    public DeliveryPlanner(List<DeliveryExecutive> execs, List<Order> orders) {
        this.deliveryExecutives = execs;
        this.allOrders = orders;
    }

    // Assign orders to delivery executives based on proximity and least load.
    public void assignOrders() {
        for (Order order : allOrders) {
            DeliveryExecutive bestExec = null;
            double minDistance = Double.MAX_VALUE;

            for (DeliveryExecutive exec : deliveryExecutives) {
                double distanceToRest = Location.distance(exec.currentLocation, order.restaurant);
                if (distanceToRest < minDistance) {
                    minDistance = distanceToRest;
                    bestExec = exec;
                }
            }

            bestExec.assignOrder(order);
        }
    }

    public void printRoutes() {
        for (DeliveryExecutive exec : deliveryExecutives) {
            System.out.println("Delivery Executive starting at: " + exec.currentLocation.latitude + ", " + exec.currentLocation.longitude);
            for (Order order : exec.assignedOrders) {
                System.out.println("-> Restaurant at: " + order.restaurant.latitude + ", " + order.restaurant.longitude +
                        " -> Customer at: " + order.customer.latitude + ", " + order.customer.longitude);
            }
            System.out.println("Total Route Time: " + exec.calculateRouteTime() + " km");
        }
    }
}
