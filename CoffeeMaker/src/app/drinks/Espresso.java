package app.drinks;

import app.build_order.Drink;
import app.build_order.Sugar;

public class Espresso implements Drink {
    public void make(Sugar sugar) {
        System.out.println("\nYour Espresso with " + sugar.getQuantity() + " sugar. Enjoy :)");
    }
}