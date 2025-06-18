package com.design.observer;

public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }

        // If the cost of the order is more than $200, the Price monitor provides a $20 discount
        if (order.getTotalPrice() > 200d) {
            order.setDiscount(20d);
            System.out.println("PriceObserver: Discount applied to order #" + order.getId() + " - $20 off");
        } else {
            order.setDiscount(0d);
            System.out.println("PriceObserver: No discount applied to order #" + order.getId());
        }
    }
}
