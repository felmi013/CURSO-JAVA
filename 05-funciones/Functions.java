public class Functions {
    
    // Función: código ejecutable
    // Puede devolver un valor
    // Puedo invocarlo por su nombre
    // Puede recibir valores -> los recoge como parametros
    // Puede devolver valores

   // void add(){
   // }

   static int add(int num1, int num2){
        int result = num1 + num2;
        System.out.println("El resultado es " +  result);
        return result;
   }
   
   static int subtraction(int num1, int num2){
        int result = num1 - num2;
        return result;
       // return num1 - num2;
   }
   static void showResult(int result){
    System.out.println("El resultado es " + result);
   }

    public static void main(String[] args) {
        // Los argumentos son los valores que llegarán a los parámetros
       int firstResult = add(24,4);
       showResult(firstResult);
        int secondResult =add(345, firstResult);
        showResult(secondResult);
       add(345, firstResult);
        // int resultsSubtraction = subtraction(23, 56);
        // System.out.println("El resultado es" + resultsSubtraction);
       showResult (subtraction(23,56));
    }
}
