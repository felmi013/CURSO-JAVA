//Formas de imprimir en pantalla
// guardandolo previamente en una variable
public class OutResults {
    public static void main(String[] args) {
        
    String name = "Felipe";
    String surname = "Casado";
    int age = 23;


    //println -> expresión
    String result = "Hola " + name + " "+ surname + "\n ¿como estas a tus " + age + "años?";
        System.out.println(result);

    System.out.println("Hola " + name + " "+ surname + "\n ¿como estas a tus " + age + "años?");


    //print f -> expresion, variables...
    result = "Hola %s %s \n ¿como estás a tus %s años, en la flor de la juventud?";

    System.out.printf("Hola %s %s \n ¿como estás a tus %s años, en la flor de la juventud?", name, surname , age );

    //println -> template string
    result = """
        Hola %s %s
        Hola \n ¿como estás a tus %s años?
            """;
    System.out.println("""
        Hola %s %s
        Hola \n ¿como estás a tus %s años?
            """.formatted(name, surname, age));    

   
    }
    
}
