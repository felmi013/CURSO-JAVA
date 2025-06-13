public class Shapes {
    
    //Declaración de la función

    public static int calculateArea(int side){
     return side * side;
    
    }
public static double calculateArea(double base, double height){
     
    return base * height;

}
public static double calculateArea (double base, double height , boolean isTrigrangle){
    return (base * height) / 2 ;
}


public static void main(String[] args) {
    //Invocación(Ejecutarla)
    System.out.println(calculateArea(2));
    System.out.println(calculateArea(2, 5));
    System.out.println(calculateArea(3, 6, true));

    }

}


