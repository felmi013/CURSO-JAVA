
import java.util.Scanner;
public class Calculator {


    static int add(int num1, int num2){
        int result = num1 + num2;
        return result;

    }

    static int subtraction(int num1, int num2){
        int result = num1 - num2;
        return result;

    }
    static int multiplicate(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    static int division(int num1, int num2){
        int result = num1 / num2;
        return result;

    }
    static int restDivision (int num1, int num2){
        int result = num1 % num2;
        return result;
    }
    static void showResult(String operation,int result){
        System.out.println("El resultado es de la %s es %s," + operation, result);
        System.out.println("");
    }
static int getInteger(String message){
    Scanner scanner = new Scanner(System.in);
    System.out.println(message);
    int num = scanner.nextInt();
   //  scanner.close();
    return num;
}

        public static void main(String[] args) {
            int num1 = getInteger("Dime un numero entero");
            int num2 = getInteger("Dime otro numero entero");
           Scanner scanner = new Scanner(System.in);
           int num1 = scanner.nextInt();
           System.out.println("Dime otro numero entero");
           int num2 = scanner.nextInt();
           scanner.close();

        
           // Los argumentos son los valores que llegaran a los paramaetros
        System.out.printf("Operaciones con %s y %s\n", num1, num2);
        showResult("suma", add(num1,num2));
        showResult("resta", subtraction(num1, num2));
        showResult("multiplicación", multiplicate(num1, num2));
        showResult("División", division(num1, num2));
        showResult("resto", restDivision(num1, num2));
        }
}
