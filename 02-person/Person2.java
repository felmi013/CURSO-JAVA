import java.util.Scanner;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

public class Person2  {

    //Tipos de numeros enteros (datos primitivos)
    //byte  - 1byte  -128 - 127
    //short 2bytes
    //*int   4bytes*
    //long  8bytes

    //Tipos de numeros decimales primitivos
    //float - decimal 4 bytes
    //*double - decimal 8 bytes*

   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
         
        String name ;
        name = scanner.nextLine();
         System.out.println("Escribe tu edad");
         double age = scanner.nextInt();
        System.out.println("Bienvenido te llamas " + name) ;
        System.out.println("Tienes " + age);
        



     

        scanner.close();

        
            
    }
}
