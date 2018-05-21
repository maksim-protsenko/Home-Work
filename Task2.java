public class Task2 {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
первый и второй члены последовательности равны единицам, а каждый следующий — сумме
двух предыдущих.
    */
    public static void main(String[] args) {
        int[] fibonachi = new int[11];
        fibonachi[0] = 1;
        fibonachi[1] = 1;
        for (int i = 0; i < 9; i++) {
            fibonachi[i + 2] = fibonachi[i] + fibonachi[i + 1];
        }
        System.out.print("Первые 11 членов последовательности Фибоначчи: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(fibonachi[i] + " ");
        }
    }
}
