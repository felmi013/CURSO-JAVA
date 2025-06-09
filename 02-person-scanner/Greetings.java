import java.util.Scanner;

public class Greetings {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Escribe tu nombre");
        name = scanner.nextLine();
        System.out.println("Escribe tu edad");
        
        age = scanner.nextInt();
        System.out.println("Hola " + name);
        System.out.println("Tienes " + age + " Años");
       
        scanner.close();
        scanner.close();
    

    }
}
