public class AgeGreeting {

    public static void main(String[] args) {
 if (args.length == 0) {
    System.out.print("Dime tu edad");
 }       
int age = Integer.valueOf(args[0]);
if(age <18 ){
    System.out.println("Estas en la flor de la juventud");

    }else if(age>=0&&age<33){
        System.out.println("Que pasa muchacho");
    
    }else if(age>=34&&age<65){
       System.out.print("Eres un viejoven");
    }else if(age>65){
        System.out.println("Estas en los huesos");
    }
    }

}

