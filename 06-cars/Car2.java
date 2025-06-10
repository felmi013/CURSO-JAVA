public class Car2 {

    static int numCars = 0;
    
    private    int id;
   private     String brand;
    private    char type;
     private   int numSeats;
    private    int numDors;
    private    String color;
    private    boolean isAuto;

        Car2(
            String brand,
            char type,
            int numSeats,
            int numDors,
            String color,
            boolean isAuto
        ) {
             numCars = numCars + 1;
             this.id = numCars;
            this.brand = brand;
            this.type= type;
            this.numSeats = numSeats;
            this.numDors = numDors;
            this.color = color;
            this.isAuto = isAuto;
            numCars= numCars +1 ;
            this.id =numCars;
           

        }
        void showInfo() {
            String message ="""
                ====================
                Id: %s
                Marca %s;
                Tipo: %s;
                Numero de asientos %s;
                Numero de puertas %s;
                Color %s;
                Is automatico: %s
                Tipo %s
                =====================

                   """;
            System.out.println(message.formatted(
                id,
                brand,
                type,
                numSeats,
                numDors,
                color,
                isAuto,
                type));

        }
    }

 