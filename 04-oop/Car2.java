public class Car2 {

    static int numCars = 0;

        int id;
        String brand;
        char type;
        int numSeats;
        int numDors;
        String color;
        boolean isAuto;

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
                =====================

                   """;
            System.out.println(message.formatted(
                id,
                brand,
                type,
                numSeats,
                numDors,
                color,
                isAuto));

        }
    }

 