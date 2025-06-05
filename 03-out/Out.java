//Formas de imprimir en pantalla
public class Out {

    public static void main(String[] args) {
        
    String name = "Felipe";
    String surname = "Casado";
    int age = 23;


    //println -> expresión
    System.out.println("Hola " + name + " "+ surname + "\n ¿como estas a tus " + age + "años?");


    //print f -> expresion, variables...

    System.out.printf("Hola %s %s \n ¿como estás a tus %s años, en la flor de la juventud?", name, surname , age );

    //println -> template string
    System.out.println("""
        Hola %s %s
        Hola \n ¿como estás a tus %s años?
            """.formatted(name, surname, age));    

    }
    
}
