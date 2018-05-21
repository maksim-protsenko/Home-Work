public class BySPD {
    /*
    Создать класс, который содержит int и char (не проинициализированные) и распечатать их
    значения.
     */
    private int value;
    private char character;

    public static void main(String[] args) {
        BySPD first = new BySPD();
        System.out.println("Значение по умолчанию для переменной типа INT:" + first.value + ".");
        System.out.println("Значение по умолчанию для переменной типа CHAR:" + first.character + ".");
    }
}

