public class Condition {
   public static void main(String[] args) {
    
    if(args.length  == 0){
        System.out.println("Tienes que añadir tu edad en la linea de comandos");


    } else{
        int age =Integer.valueOf(args[0]);
        System.out.println("tu edad es" + age);

    }
    }  
   } 
