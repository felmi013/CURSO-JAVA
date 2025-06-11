import java.util.Scanner;

public class Shop {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int packages = scanner.nextInt();
    scanner.close();

    if (packages <5){
        System.out.println("No se puede realizar el pedido");
    }else if (packages <10 ){
        System.out.println("Se aokuca un descuento del 5%");
    }else if (packages >= 10 &&packages<= 20 ) {
        System.out.println("Se aplica un descuento de 10%");
    }else if (packages >20) {
        System.out.println("Se aplica un descuento de 15%");
    }    
        
    }


        }
         
        



  

  
