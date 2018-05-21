import java.util.Random;

public class Task5 {
    /*
    Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из
отрезка [10;99]. Вывести массив на экран.
     */
    public static void main(String[] args) {
        final Random randomizer = new Random();
        int [][] twoDimensionalArray = new int[8][5];
        for (int i = 0; i < twoDimensionalArray.length ; i++) {
            for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                twoDimensionalArray[i][j] = randomizer.nextInt(100);
                while ( twoDimensionalArray[i][j]<10){
                    twoDimensionalArray[i][j] = randomizer.nextInt(100);
                }
            }
        }
        System.out.print("Матрица 8*5, заполненная псевдослучайными числами от 0 до 99: ");
        for (int i = 0; i < twoDimensionalArray.length ; i++) {
            System.out.println(" ");
            for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
        }
    }
}
