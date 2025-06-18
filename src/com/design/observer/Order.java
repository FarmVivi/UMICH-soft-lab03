package com.design.observer;

import java.util.LinkedList;

public class Order {
    public static int DEFAULT_SHIPPING_COST = 10;

    private final int id;
    private final LinkedList<OrderObserver> observers = new LinkedList<>();
    private int itemCount;
    private double itemCost;
    private double shippingCost = DEFAULT_SHIPPING_COST;
    private double discount;

    public Order(int id) {
        // TODO implement here
    }

    public void attach(OrderObserver observer) {
        // TODO implement here
    }

    public void detach(OrderObserver observer) {
        // TODO implement here
    }

    public double getTotalPrice() {
        // TODO implement here
    }

    public int getCount() {
        // TODO implement here
    }

    @Override
    public String toString() {
        // TODO implement here
    }

    public int getId() {
        // TODO implement here
    }

    public void notifyObservers() {
        // TODO implement here
    }

    public void addItem(double price) {
        // TODO implement here
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
    }
}
