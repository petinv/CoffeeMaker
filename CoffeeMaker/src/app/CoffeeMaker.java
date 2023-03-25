package app;

import app.utils.Validation;
import app.build_order.Sugar;
import app.drinks.Cappuccino;
import app.drinks.Espresso;
import app.drinks.Latte;

import java.util.Scanner;

public class CoffeeMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a drink:\n1 - Espresso\n2 - Cappuccino\n3 - Latte\n0 - Exit");
        int choice = Validation.getValidChoice(scanner);

        switch (choice) {
            case 1 -> System.out.println("\nYou have selected Espresso.");
            case 2 -> System.out.println("\nYou have selected Cappuccino.");
            case 3 -> System.out.println("\nYou have selected Latte.");
            case 0 -> {
                System.out.println("Good bye!");
                return;
            }
        }

        System.out.println("How many sugars do you want? (0-3)");
        int sugarQuantity = Validation.getValidChoice(scanner);
        Sugar sugar = new Sugar(sugarQuantity);

        switch (choice) {
            case 1 -> new Espresso().make(sugar);
            case 2 -> new Cappuccino().make(sugar);
            case 3 -> new Latte().make(sugar);
        }
    }
}
