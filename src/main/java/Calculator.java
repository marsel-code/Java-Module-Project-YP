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
        // System.out.println("Ввели " + persons);


        while (true) {
            //  if (scanner.hasNextLine()) {

            String menu = scanner.nextLine();
            System.out.println("Введите название товара или введите 'Завершить', что бы выйти");
            // if (menu.equalsIgnoreCase("Завершить")) {
            //       break;

            //
            //else {

            double price = scanner.nextDouble();
            System.out.println("Введите цену товара:");
            //System.out.println("Введите текст");
            // if (scanner.hasNextDouble()) {


            // priceSum += price;
            //menuSum += menu + "\n";

        } //else {
        //System.out.println("Введите число");
    }
}



