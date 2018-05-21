import java.util.Scanner;

public class Task9 {
    /*
    В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит пользователь).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну первого катета:");
        int a = in.nextInt();
        Math.abs(a);
        System.out.println("Введите длинну второго катета:");
        int b = in.nextInt();
        Math.abs(b);
        double c;
        double perimeterOfTriangle;
        double halfPerimeter;
        double squareOfTriangle;
        if (a != 0 && b != 0) {
            c = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
            //System.out.println("Гипотенуза треугольника:" + c);
            perimeterOfTriangle = a + b + c;
            System.out.println("Периметр треугольника:" + perimeterOfTriangle);
            halfPerimeter = 0.5 * (a + b + c);
            squareOfTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
            System.out.println("Площадь треугольника:" + squareOfTriangle);

        } else {
            System.out.println("Длинна катета не может быть равна нулю.");
        }
    }
}
