

public class Main {
    public static void main(String[] args) {

        Character character1;
        character1 = new Character("Garp", 'M');
        Character character2 =new Character("Luffy", 'P');
        character2.enemy    = true;

        System.out.println(character1.name);
        System.out.println("¿Is enemy?" + character1.enemy);
        System.out.println(character2.name);
        System.out.println("Is enemy?" + character2.enemy);


        Car car1 = new Car("Toyota", 'S' , 5 ,5, "Verde", true);
        Car car2 = new Car("Lexus", 'D', 4, 5, "Negro", true);
        car1.showInfo();
        car2.showInfo();


    }
    
}
