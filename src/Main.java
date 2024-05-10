import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DeliveryExecutive> execs = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

        // Example locations (latitude, longitude)
        execs.add(new DeliveryExecutive(new Location(12.9716, 77.5946))); // Example executive in Bangalore
        orders.add(new Order(new Location(12.9279, 77.6271), new Location(12.9250, 77.6200), 10)); // Restaurant to Customer
        orders.add(new Order(new Location(12.9330, 77.6122), new Location(12.9300, 77.6170), 15)); // Another Restaurant to Customer

        DeliveryPlanner planner = new DeliveryPlanner(execs, orders);
        planner.assignOrders();
        planner.printRoutes();
    }
}