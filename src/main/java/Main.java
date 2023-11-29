import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество человек:");
        System.out.println("итого " + amountPersons() + " человек");
    }

    public static int amountPersons() {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            if (scanner.hasNextInt()) {
                int persons = scanner.nextInt();
                if (persons > 1) {
                    return persons;
                } else if (persons <= 1) {
                        System.out.println("меньше 1");
                    }
                } else {
                System.out.println("не число");
                scanner.next();}
                }

            }
        }

