package Ejercicios;

import java.util.Scanner;

public class Primos {

    private static int getDataByScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero para ver sies primo");
        int number = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return number;

    }
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
    public static void main(String[]args){
        int number = getDataByScanner();
        String message = isPrime(number)
        ? "%s SI es primo" 
        : "%s NO es primo";
        System.out.printf(message, number);
    }

}
