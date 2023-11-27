import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какое количество человек Вы планируете разделить счёт?");
        int amounthPersons = scanner.nextInt();
        if (amounthPersons => 1){
            Calculator.calculator();
        } else {
                System.out.println("Некорректное значение! Пожалуйста, повторите ввод.");
                amounthPersons = scanner.nextInt();
            }
    }
}