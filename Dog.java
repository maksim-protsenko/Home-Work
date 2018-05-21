public class Dog {
    /*
    Создать класс Dog, который будет содержать 2 поля name и says. В main( ) создать 2
экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”). И распечатать поля
объектов.
     */
    public String name;
    public String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        Dog firstDog = new Dog("spot", "Ruff");
        Dog secondDog = new Dog("scruffy", "Wurf");
        System.out.println(firstDog.name + " says " + firstDog.says);
        System.out.println(secondDog.name + " says " + secondDog.says);
    }
}


