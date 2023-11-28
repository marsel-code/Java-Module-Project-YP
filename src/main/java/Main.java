import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество человек:");
             amountPersons();
    }


    public static void amountPersons() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int amountPersons = scanner.nextInt();
            if (amountPersons >= 2) {
                System.out.println("ввели больше 2");
            }else {System.out.println("введите больше 1");}
        } System.out.println("введите целое число");
        amountPersons();
    }
}