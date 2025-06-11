import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        scanner.close();

        switch (day.toLowerCase()) {
            case "Lunes":
                System.out.println("Monday");
                break;
            case "Martes":
                System.out.println("Tuesday");
                break;
            case "Miercoles":
                System.out.println("Wednesday");
                break;
            case "Jueves":
                System.out.println("Jueves");
                break;
            case "Viernes":
                System.out.println("Viernes");
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("Fin de semana");
                break;

            default:
                System.out.println("Numero no valido mortaja");
                break;
        }
    }
}
