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
        if (id <= 0) {
            throw new IllegalArgumentException("Order ID must be greater than zero");
        }
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null");
        }
        observers.add(observer);
        observer.update(this);
    }

    public void detach(OrderObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null");
        }
        observers.remove(observer);
    }

    public double getTotalPrice() {
        return itemCost;
    }

    public int getCount() {
        return itemCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: #").append(id).append("\n");
        sb.append("Total Price: $").append(getTotalPrice()).append("\n");
        sb.append("Item Count: ").append(getCount()).append("\n");
        sb.append("Shipping Cost: $").append(shippingCost).append("\n");
        sb.append("Discount: $").append(discount).append("\n");
        sb.append("Total Order Cost: $").append(getTotalOrderCost()).append("\n");
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void addItem(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        System.out.println("Adding item to order #" + id + " with price: $" + price);
        this.itemCost += price;
        this.itemCount++;
        notifyObservers();
    }

    public void setTotalPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.itemCost = price;
    }

    public void setShippingCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Shipping cost cannot be negative");
        }
        this.shippingCost = cost;
    }

    public void setDiscount(double discount) {
        if (discount < 0) {
            throw new IllegalArgumentException("Discount cannot be negative");
        }
        this.discount = discount;
    }

    public double getTotalOrderCost() {
        return itemCost + shippingCost - discount;
    }
}
