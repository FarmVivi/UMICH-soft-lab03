package com.design.observer;

public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }

        // If the quantity of items in the order is more than 5, the Quantity monitor sets the shipping cost of the order to zero
        if (order.getCount() > 5) {
            order.setShippingCost(0d);
            System.out.println("QuantityObserver: Shipping cost set to zero for order #" + order.getId());
        } else {
            order.setShippingCost(Order.DEFAULT_SHIPPING_COST);
            System.out.println("QuantityObserver: Shipping cost remains at default for order #" + order.getId());
        }
    }
}
