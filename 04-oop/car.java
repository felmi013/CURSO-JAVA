public class Car {
    
        String brand;
        char type;
        int numSeats;
        int numDors;
        String color;
        boolean isAuto;

        Car(
            String brand,
            char type,
            int numSeats,
            int numDors,
            String color,
            boolean isAuto
        ) {
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
                Marca %s;
                Tipo: %s;
                Numero de asientos %s;
                Numero de puertas %s;
                Color %s;
                Is automatico: %s
                =====================

                   """;
            System.out.println(message.formatted(
                brand,
                type,
                numSeats,
                numDors,
                color,
                isAuto));

        }
    }

 