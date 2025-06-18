package com.design.observer;

public class Client {
    public static void main(String[] args) {
        // Observers
        QuantityObserver quantityObserver = new QuantityObserver();
        PriceObserver priceObserver = new PriceObserver();

        // Order 1
        Order order1 = new Order(1);
        order1.attach(quantityObserver);
        order1.attach(priceObserver);
        System.out.println(order1);
        // Add items to the order
        order1.addItem(49.99);
        order1.addItem(25.99);
        order1.addItem(15.99);
        order1.addItem(30.00);
        order1.addItem(100.00);
        System.out.println(order1);
        order1.addItem(100.00);
        System.out.println(order1);

        // Order 2
        Order order2 = new Order(2);
        order2.attach(quantityObserver);
        order2.attach(priceObserver);
        System.out.println(order2);
        // Add items to the order
        order2.addItem(50.00);
        order2.addItem(75.00);
        order2.addItem(70.00);
        System.out.println(order2);

        // Order 3
        Order order3 = new Order(3);
        order3.attach(quantityObserver);
        order3.attach(priceObserver);
        System.out.println(order3);
        // Add items to the order
        order3.addItem(15.00);
        order3.addItem(15.00);
        order3.addItem(15.00);
        order3.addItem(15.00);
        order3.addItem(15.00);
        order3.addItem(15.00);
        System.out.println(order3);

        // Order 4
        Order order4 = new Order(4);
        order4.attach(quantityObserver);
        order4.attach(priceObserver);
        System.out.println(order4);
        // Add items to the order
        order4.addItem(120.00);
        order4.addItem(120.00);
        System.out.println(order4);

        // Order 5
        Order order5 = new Order(5);
        order5.attach(quantityObserver);
        order5.attach(priceObserver);
        System.out.println(order5);
        // Add items to the order
        order5.addItem(40.00);
        order5.addItem(40.00);
        order5.addItem(40.00);
        order5.addItem(40.00);
        order5.addItem(40.00);
        System.out.println(order5);
    }
}
