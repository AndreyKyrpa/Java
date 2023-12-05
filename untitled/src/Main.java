import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //1

        System.out.println("Your time is limited,");
        System.out.println("    so don’t waste it");
        System.out.println("        living someone else’s life");
        System.out.println("            Steve Jobs\n\n");

        //2

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение: ");
        double value = scanner.nextDouble();
        System.out.print("Введите процент: ");
        double percentage = scanner.nextDouble();
        double result2 = (percentage / 100) * value;
        System.out.println("Результат: " + result2);
        System.out.println("\n\n");

        //3

        System.out.print("Введите первую цифру: ");
        int digit1 = scanner.nextInt();
        System.out.print("Введите вторую цифру: ");
        int digit2 = scanner.nextInt();
        System.out.print("Введите третью цифру: ");
        int digit3 = scanner.nextInt();
        int result3 = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println("Результат: " + result3);
        System.out.println("\n\n");

        //4

        System.out.print("Введите шестизначное число: ");
        int number = scanner.nextInt();
        if (number <= 999999 && number >= 100000) {
            digit1 = number / 100000;
            digit2 = (number / 10000) % 10;
            digit3 = (number / 1000) % 10;
            int digit4 = (number / 100) % 10;
            int digit5 = (number / 10) % 10;
            int digit6 = number % 10;
            int result4 = digit6 * 100000 + digit5 * 10000 + digit3 * 1000 + digit4 * 100 + digit2 * 10 + digit1;
            System.out.println("Результат: " + result4);
        } else {
            System.out.println("Введено не шестизначное число.");
        }
        System.out.println("\n\n");

        //5

        System.out.print("Введите номер месяца (от 1 до 12): ");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            if (month >= 3 && month <= 5) {
                System.out.println("Весна");
            } else if (month >= 6 && month <= 8) {
                System.out.println("Лето");
            } else if (month >= 9 && month <= 11) {
                System.out.println("Осень");
            } else {
                System.out.println("Зима");
            }
        } else {
            System.out.println("Введен номер месяца меньше 1 или больше 12.");
        }
        System.out.println("\n\n");

        //6

        System.out.print("Введите количество метров: ");
        double meters = scanner.nextDouble();
        System.out.println("Выберите единицу измерения (1 - мили, 2 - дюймы, 3 - ярды): ");
        int choi = scanner.nextInt();
        double result6;
        switch (choi) {
            case 1:
                result6 = meters / 1609.34;
                System.out.println("Результат: " + result6 + " миль");
                break;
            case 2:
                result6 = meters * 39.37;
                System.out.println("Результат: " + result6 + " дюймов");
                break;
            case 3:
                result6 = meters * 1.09361;
                System.out.println("Результат: " + result6 + " ярдов");
                break;
            default:
                System.out.println("Выберите правильную единицу измерения.");
        }

        //7

        System.out.print("Введите начало диапазона: ");
        int start7 = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int end7 = scanner.nextInt();

        if (start7 > end7) {
            int temp = start7;
            start7 = end7;
            end7 = temp;
        }
        System.out.println("Нечетные числа в диапазоне от " + start7 + " до " + end7 + ":");
        for (int i = start7; i <= end7; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //8

        System.out.print("Введите начало диапазона: ");
        int start8 = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int end8 = scanner.nextInt();
        System.out.println("Таблица умножения в диапазоне от " + start8 + " до " + end8 + ":");
        for (int i = 1; i <= 10; i++) {
            for (int j = start8; j <= end8; j++) {
                System.out.print(j + "*" + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}