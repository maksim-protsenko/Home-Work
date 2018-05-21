import java.util.Scanner;

public class Task10 {
    /*
    Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m –
вводит пользователь).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        final double m = scan.nextDouble();
        System.out.println("Введите второе число");
        final double n = scan.nextDouble();
        int fixedNumber = 10;
        double firstDestination = Math.abs(fixedNumber - m);
        double secondDestination = Math.abs(fixedNumber - n);
        if (firstDestination < secondDestination) {
            System.out.println("Ближайшее число к " + fixedNumber + " первое введённое число: " + m + ".");
        } else if (secondDestination < firstDestination) {
            System.out.println("Ближайшее число к " + fixedNumber + " второе введённое число: " + n + ".");
        } else {
            System.out.println("Оба числа находятся на одинаковом расстоянии " + firstDestination + " от " + fixedNumber + ".");
        }
    }
}

