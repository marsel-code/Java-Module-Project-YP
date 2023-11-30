import java.util.Scanner;

public class Calculator {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        int persons = 0;
        String menuSum = " ";
        double priceSum = 0;
        System.out.println("Введите количество человек:");
        while (true) {
            if (scanner.hasNextInt()) {
                persons = scanner.nextInt();
                if (persons < 2) {
                    System.out.println("Введите число больше 1");
                } else {
                    break;
                }
            } else {
                System.out.println("Введите число");
                scanner.next();
            }
        }
        while (true) {
            //  if (scanner.hasNextLine()) {
            System.out.println("Введите название товара или введите 'Завершить', что бы выйти");
            scanner.nextLine();
            String menu = scanner.nextLine();
            if (menu.equalsIgnoreCase("Завершить")) {
                break;
            } menuSum += menu + "\n";
            while (true) {
             System.out.println("Введите цену товара:");
                if (scanner.hasNextDouble()) {
            double price = scanner.nextDouble();
            priceSum += price;
            break;
                }else {
                    System.out.println("Введите число");
                    scanner.next();
                }
        }
    } System.out.println(priceSum + menuSum);
}
}



