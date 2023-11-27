import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какое количество человек Вы планируете разделить счёт?");
        if (scanner.hasNextInt()) {
            int amountPersons = scanner.nextInt();
            if (amountPersons > 1) {
                System.out.println("больше 1");
            } else if (amountPersons <= 1) {
                System.out.println("Некорректное значение! Пожалуйста, повторите ввод.");
            }


        }
    }
}

//amounthPersons <= 1
//  Calculator.calculator();
//  System.out.println("Некорректное значение! Пожалуйста, повторите ввод.");