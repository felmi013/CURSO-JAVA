import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("adivina el numero");
        int number= scanner.nextInt();
        
    Random random = new Random();
        int RuleteRandom = random.nextInt(3);
        if (number == RuleteRandom ) {
            System.out.println("Lo has adivinado ");
            
            
        }else{
            System.out.println("No lo adivinaste, el numero es " + RuleteRandom);
        }
            
        }
    }

    
