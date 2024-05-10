package model;

public class Order {
    Location restaurant;
    Location customer;
    double preparationTime;

    public Order(Location restaurant, Location customer, double prepTime) {
        this.restaurant = restaurant;
        this.customer = customer;
        this.preparationTime = prepTime;
    }

}
