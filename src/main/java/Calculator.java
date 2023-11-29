import java.util.Scanner;

public class Calculator {
    public static int amountPersons() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество человек:");
        while (true) {
            if (scanner.hasNextInt()) {
                int persons = scanner.nextInt();
                if (persons > 1) {
                    return persons;
                } else if (persons <= 1) {
                    System.out.println("Введите число больше 1");
                }
            } else {
                System.out.println("Введите число");
                scanner.next();
            }
        }
    }

    public static String menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название товара:");
        while (true) {
            if (scanner.hasNextLine()) {
                String menu = scanner.nextLine();
                return menu;
            } else {
                System.out.println("Введите текст");
                scanner.next();
            }
        }
    }

    public static Double price() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену товара:");
        while (true) {
            if (scanner.hasNextDouble()) {
                Double price = scanner.nextDouble();
                return price;
            } else {
                System.out.println("Введите текст");
                scanner.next();
            }
        }
    }
}
