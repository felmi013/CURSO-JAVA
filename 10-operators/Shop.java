import java.util.Scanner;

public class Shop {

    static final double PACKET_PRICE = 20;

    static int getDataByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vendemos paquetes de pantalones y camisetas a %s EU\n", PACKET_PRICE);
        System.out.println("Dime el numero de paquetes del pantalones");
        int packets = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return packets;

    }

    public static void main(String[] args) {
        int numPackets = getDataByScanner();

        System.out.println(numPackets);
        double discount;
        int shipingByPacket;
        

        if (numPackets < 5 ) {
            System.err.println("Número de paquetes insuficiente");
            return;
        }else if (numPackets < 10) {
           discount = 0.05;
            shipingByPacket = 10;

        }else if (numPackets < 20) {
            discount = 0.1;
            shipingByPacket = 5;
            
        }else {
            discount = 0.15;
            shipingByPacket = 0;
        }
            // validos para los casos 2,3 y 4
        double total = numPackets * PACKET_PRICE;
        double finalDiscount = total*discount;
        double totalShipping= numPackets* shipingByPacket;
        double finales = total - finalDiscount+totalShipping;

    }
           
    System.out.println("""
            Numero de paquetes            %d
            Precio total del producto    %.2f
            Descuento aplicado           %.2f
            Gastos de envio              %.2f
            --------------------------------
            TOTAL                          %.2f
            """.formatted(numPackets, total, finalDiscount, totalShipping, finales));
    }
    


