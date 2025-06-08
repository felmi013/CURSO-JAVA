//Formas de imprimir en pantalla
public class Out {

    public static void main(String[] args) {
       
        
    String name = "John";
    String surname = "Wik";
    int age = 23;


    //println -> expresión
    System.err.println("--------------------------");
    System.out.println("Hola " + name + " "+ surname + "\n ¿como estas a tus " + age + "años?");


    //print f -> expresion, variables...
    System.err.println("--------------------------");

    System.out.printf("Hola %s %s \n ", name, surname , age );

    //println -> template string
    System.err.println("--------------------------");
    System.out.println("""
        Hola %s %s
        Hola \n ¿como estás a tus %s años?
            """.formatted(name, surname, age));    

    }
    
}
