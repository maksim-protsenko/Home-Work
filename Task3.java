public class Task3 {
    /*
    В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую
неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от
000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или
567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета
и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте
сколько счастливых билетов в одном рулоне?
     */
    public static void main(String[] args) {
        int leftSideSum = 0;
        int rightSideSum = 0;
        int countOfGifts = 0;
        for (int i = 1000; i < 1000000; i++) { //до 1000го билета не будет "счастливых", убираем некоторую избыточность
            rightSideSum += i % 10;
            rightSideSum += (i / 10) % 10;
            rightSideSum += (i / 100) % 10;
            leftSideSum += (i / 1000) % 10;
            leftSideSum += (i / 10000) % 10;
            leftSideSum += (i / 100000) % 10;
            if (leftSideSum == rightSideSum) {
                countOfGifts++;
            }
            rightSideSum = 0;
            leftSideSum = 0;
        }
        System.out.println("Трамвайное депо должно подарить " + countOfGifts + " подарков.");
    }
}

