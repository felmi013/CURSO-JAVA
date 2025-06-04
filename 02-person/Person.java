import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

public class Person {

    //Tipos de numeros enteros (datos primitivos)
    //byte  - 1byte  -128 - 127
    //short 2bytes
    //*int   4bytes*
    //long  8bytes

    //Tipos de numeros decimales primitivos
    //float - decimal 4 bytes
    //*double - decimal 8 bytes*

   
    
    public static void main(String[] args) {

        byte age; //Declaración
        age = 22; //Asignación
        short birthYear = 2001;// Inicialización = Declaración + Asignación
        int countryPopulation =33_333_333;
        long countryDistance = 40_000_000;
        float height = 1.84f;
        double weight = 65.74;
        boolean hasPet = true;
        char type = 'A';
        String name = "Felipe";
        System.out.println("Edad " + age);
        System.out.println("Fecha " + birthYear);
        System.out.println("Poblacion de mi ciudad\n " + countryPopulation);
        System.out.println("Distancia ciudad " + countryDistance);
        System.out.println("Altura " + height);
        System.out.println("Weight " + weight); 
        System.out.println("""
        Altura %s mts
        Peso %s kgs
        ¿Tiene mascotas? %s
        Tipo %s
        Nombre %s
        """.formatted(height, weight,hasPet, type, name));
        
            
    }
}
