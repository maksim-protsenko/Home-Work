import java.util.Scanner;

public class Task11 {
    /*
    В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
будет находить и выводить на экран вещественные корни квадратного уравнения
ax^2+bx+c=0, либо сообщать, что корней нет (a, b и c – вводит пользователь).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первый коэффициент a:");
        final double a = scan.nextDouble();
        System.out.println("Введите средний коэффициент b:");
        final double b = scan.nextDouble();
        System.out.println("Введите свободный член с:");
        final double c = scan.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double firstRoot;
        double secondRoot;
        if (discriminant == 0) {
            firstRoot = -1 * (b / (2 * a));
            secondRoot = firstRoot; // for using in future
            System.out.println("Уравнеие имеет 1 корень, который равен " + firstRoot + ".");
        }
        if (discriminant > 0) {
            firstRoot = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
            secondRoot = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
            System.out.println("Уравнение имеет 2 корня");
            System.out.println("Первый корень: " + firstRoot + ". Второй корень: " + secondRoot + ".");
        } else {
            System.out.println("Корней на множестве действительных чисел нет.");
        }
    }
}
