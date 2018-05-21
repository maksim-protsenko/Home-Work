import java.util.Scanner;

public class Task1 {
    /*
    Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его
    цифр (заранее не известно сколько цифр будет в числе).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        final int yourNumber = in.nextInt();
        int sumOfDigits = 0;
        int tempNumber = yourNumber;
        while (tempNumber != 0) {
            sumOfDigits = sumOfDigits + tempNumber % 10;
            tempNumber = tempNumber / 10;
        }
        System.out.println("Сумма цифр в числе " + yourNumber + " = " + sumOfDigits + ".");
    }
}

