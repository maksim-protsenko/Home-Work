import static java.lang.Math.*;

public class Task6 {
    /*
    Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из
отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с
наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести
индекс первой встретившейся из них.
     */
    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[7][4];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                twoDimensionalArray[i][j] = (int) (Math.random() * (10 + 1)) - 5;
            }
        }
        System.out.print("Сгенерированный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]:");
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
        }
        System.out.println(" ");
        int biggestMultiplicationRezult = 0;
        int indexOfBiggestMultiplication = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            int multiplicationResult = 1;
            for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                multiplicationResult = twoDimensionalArray[i][j] * Math.abs(multiplicationResult);
                if (!(twoDimensionalArray[i][j] == 0) && multiplicationResult > biggestMultiplicationRezult) {
                    biggestMultiplicationRezult = multiplicationResult;
                    indexOfBiggestMultiplication = i;
                }
            }
        }
        if (indexOfBiggestMultiplication > 0) {
            indexOfBiggestMultiplication = indexOfBiggestMultiplication + 1;
        } else {
            indexOfBiggestMultiplication = 1;
        }
        System.out.println("Наибольшее по модулю произведение элементов находится в " + indexOfBiggestMultiplication + "й строке и равно "+ biggestMultiplicationRezult + ".");
    }
}
