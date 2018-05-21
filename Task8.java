import java.util.Scanner;

public class Task8 {
    /*
    Создать программу, проверяющую и сообщающую на экран, является ли целое число,
записанное в переменную n, чётным либо нечётным (n – вводит пользователь).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        final int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println("Это чётное число");
        } else {
            System.out.println("Это нечётное число");
        }
    }
}
