package app.utils;

import java.util.Scanner;

public class Validation {

    // Один метод для двух вводов. Если будет больше 3-х напитков и другое количество сахара,
    // то придётся делать отдельную валидацию.

    public static int getValidChoice(Scanner scanner) {
        int choice;
        do {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 0 && choice <= 3) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid input. Please enter a correct number.");
        } while (true);
        return choice;
    }
}
