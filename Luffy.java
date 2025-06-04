public class Luffy {
    public static void main(String[]args){

    byte age = 19;
    short birthYear = 2004;
    int FirstBounty = 30_000_000;
    long ActualBounty = 3_000_000_00;
    float height = 172f;
    boolean AkumaNoMi = true;
    String name ="Luffy";
    
       
System.out.println("""
        Edad
        Altura %s mts
        Primera recompensa
        Recompensa actual
        ¿Tiene fruta del diablo? %s
        Tipo %s
        Nombre %s
        """.formatted(age,height, birthYear, FirstBounty,ActualBounty, AkumaNoMi, name));
    }
}
