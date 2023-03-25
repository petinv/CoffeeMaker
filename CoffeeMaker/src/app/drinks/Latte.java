package app.drinks;

import app.build_order.Drink;
import app.build_order.Sugar;

public class Latte implements Drink {
    public void make(Sugar sugar) {
        System.out.println("\nYour Latte with " + sugar.getQuantity() + " sugar. Enjoy :)");
    }
}
