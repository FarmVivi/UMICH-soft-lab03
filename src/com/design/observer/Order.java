package com.design.observer;

import java.util.LinkedList;

public class Order {
    public static int DEFAULT_SHIPPING_COST = 10;

    private final LinkedList<OrderObserver> observers = new LinkedList<>();
    private int quantity;
    private double price;
    private double shippingCost = DEFAULT_SHIPPING_COST;
    private double discount;

    public void attach(OrderObserver observer) {
        // TODO implement here
    }

    public void detach(OrderObserver observer) {
        // TODO implement here
    }

    public double getTotalPrice() {
        // TODO implement here
        return 0.0d;
    }

    public int getCount() {
        // TODO implement here
        return 0;
    }

    @Override
    public String toString() {
        // TODO implement here
        return "";
    }

    public void setTotalPrice(double price) {
        // TODO implement here
    }

    public void setShippingCost(double cost) {
        // TODO implement here
    }

    public void setDiscount(double discount) {
        // TODO implement here
    }

    public double getTotalOrderCost() {
        // TODO implement here
        return 0.0d;
    }
}
