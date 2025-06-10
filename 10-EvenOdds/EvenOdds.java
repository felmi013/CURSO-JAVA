public class EvenOdds {
    public static void mode4(String[]args){
        if (args.length ==0 ) {
            System.out.println("Tienes que añadir un entero en la linea de comandos");
            return;


        }
        int number= Integer.valueOf(args[0]);
        //condificon ? valor : valor
        String result = (number % 2 ) == 0 ? "par" : "impar";
        System.out.printf("El numero %s es %s", number,result);
    }
    

    public static void main(String[] args) {

        //pares
        if(args.length == 0);{
        System.out.println("Dame un numero");

    }
        int even =Integer.valueOf(args[0]);
         if(even % 2 ==0){
            System.out.println("Es par");
         } else {
            System.out.print("es impar");
         }
    
    }
}



