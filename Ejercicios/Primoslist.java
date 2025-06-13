package Ejercicios;

import java.util.Scanner;

public class Primoslist {

    private static int getDataByScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero para obtener todos los primos menores que el");
        int number = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return number;

    }
    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    private static int[] calculatePrimes(int number){
        for (int i = 1; i < number; i++) {
            Primes.isPrime(i))
            System.out.println(i);
        }

return [1]
    }
    public static void main(String[]args){
        int number = getDataByScanner();
        []int numbers = calculatePrimes(number);
}
