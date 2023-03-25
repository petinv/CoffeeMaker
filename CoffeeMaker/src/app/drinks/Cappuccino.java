package app.drinks;

import app.build_order.Drink;
import app.build_order.Sugar;

public class Cappuccino implements Drink {
    public void make(Sugar sugar) {
        System.out.println("\nYour Cappuccino with " + sugar.getQuantity() + " sugar. Enjoy :)");
    }
}