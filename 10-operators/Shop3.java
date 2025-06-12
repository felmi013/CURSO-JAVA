import java.util.Scanner;

public class Shop2 {

    static final double SHIRT_PRICE = 16;
    static final double THOUSER_PRICE = 22;

    static int[] getDataByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vendemos paquetes de pantalones %s EU\n", SHIRT_PRICE);
        System.out.printf("Vendemos paquetes de pantalones a E\n", THOUSER_PRICE);
        System.out.printf("Vendemos paquetes de pantalones ");
        int packetsTrouser = scanner.nextInt();
        System.out.println("Vendemos paquetes de camisetas");
        int packetsShirt = scanner.nextInt();
        System.out.println("");
        scanner.close();
        int[] result = {packetsTrouser, packetsShirt};
        return result;
    }

    public static void main(String[] args) {
        int[] numPackets = getDataByScanner();
        int numPacketsTrousers = numPackets[0];
        int numPacketsTshirts = numPackets[1];
        int numPacketsTotal = numPacketsTrousers + numPacketsTshirts;
        System.out.println(numPackets);
        double discount;
        int shipingByPacket;
        double promotion = 0;

        if (numPacketsTotal < 5) {
            System.err.println("Número de paquetes insuficiente");
            return;
        } else if (numPacketsTotal < 10) {
            discount = 0.05;
            shipingByPacket = 10;

        } else if (numPacketsTotal < 20) {
            discount = 0.1;
            shipingByPacket = 5;

        } else {
            discount = 0.15;
            shipingByPacket = 0;
        }
        // validos para los casos 2,3 y 4
        double total = numPacketsTshirts * SHIRT_PRICE + numPacketsTrousers*THOUSER_PRICE;
        double finalDiscount = total * discount;
        double totalShipping = numPacketsTotal * shipingByPacket;
        double finales = total - finalDiscount + totalShipping;


        if (total>= 1000) {
            promotion = total * 0.10;
            finales = finales - promotion;



            String line1 = "PROMOCION";
            String line2 = "Descuento";

              System.out.println("""
                Paquetes de pantalones      %d
                Paquetes de camisetas       %d
                Numero de paquetes total    %d
                ------------------------------------
                Precio total del producto  %.2f EU
                Descuento aplicado         %.2f EU
                Gastos de envio            %.2f EU
                ------------------------------------
                %s
                Descuento                  %.2f EU
                ------------------------------------
                TOTAL                      %.2f
                """.formatted(numPacketsTrousers, numPacketsTshirts, numPacketsTotal, total, finalDiscount, totalShipping,line1, line2, promotion, finales));
    
        }else {
            double amountToPromotion = 1000 - total;
        String line1 = "PROMOCION NO APLICADA";
        String line2 = "Cantidad que falta";
        

        System.out.println("""
                Numero de paquetes          %d
                Paquetes de pantalones      %d
                Paquetes de camisetas       %d
                Numero de paquetes total    %d
                ------------------------------------
                Precio total del producto  %.2f EU
                Descuento aplicado         %.2f EU
                Gastos de envio            %.2f EU
                ------------------------------------
                %s
                %s                  %.2f EU
                ------------------------------------
                TOTAL                      %.2f
                """.formatted(numPacketsTrousers, numPacketsTshirts, numPacketsTotal, total, finalDiscount, totalShipping,line1, line2, amountToPromotion, finales));
    }
}
}
