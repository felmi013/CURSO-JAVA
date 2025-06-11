import java.util.Scanner;


public class AgeGreeting {
    static int getAgeByScanner(){
        Scanner scanner = new Scanner(System.in);
System.out.println("Dime tu edad");
int age = scanner.nextInt();
System.out.println("");
scanner.close();
return age;


    }
    static int getAgeByArgs(String[] args) {
if (args.length == 0) {
     System.out.print("Dime tu edad");
     return -1;
 }       

 int age = Integer.valueOf(args[0]);
 return age;
    }

    public static void main(String[] args) {
        int age =getAgeByArgs(args);

// int age = getAgeByScanner();


if (age < 0 ){
    return;
}
else if(age >=0 && age <18 ){
    System.out.println("Estas en la flor de la juventud");

    }else if(age>=18&&age<33){
        System.out.println("Que pasa muchacho");
    
    }else if(age>=33&&age<65){
       System.out.print("Eres un viejoven");
    }else if(age > 65){
        System.out.println("Estas en los huesos");
    }else {
        System.out.println("Estas jubilado");
    }
    }

}

