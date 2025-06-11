import java.util.Scanner;

public class School {
    static int getAgeByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la edad del alumno");
        int age = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return age;

    }


public static void main(String[] args) {
    String[] messages = {

  "Kinder, Lunes y Miércoles de 16 a 17 1stYear",

   
     "Martes y Jueves de 16:30 a 17:30 2ndYear",
    
    "Martes y Jueves de 17:30 a 19 3rdYear",
"Lunes y Miércoles de 17 a 18:30",
 
    
};
int studentAge = getAgeByScanner();
int index =4 ;

if(studentAge <=6){
    index= 0 ;
}   else if (studentAge <= 8){
    index= 1;
   }else if (studentAge <=10 ) {
   index= 2;
   }else if (studentAge<= 13){
index =3;
  
   }
   System.out.println(messages[index]);
}
}




// Una escuela de inglés desea informar a sus alumnos los días y horarios de sus
// clases.
// Para ello, decidió la creación de una aplicación que, a partir del ingreso de
// la edad del alumno, le informe en qué días y horarios los alumnos tienen
// clases.
// Como información, la academia proporciona los siguientes datos respecto a los
// grupos y los diferentes horarios:
// Kinder (de 6 años inclusive): Lunes y Miércoles de 16 a 17 1stYear (de 7 a 8
// años inclusive): Martes y Jueves de 16:30 a 17:30 2ndYear (de 9 a IO años
// inclusive):
// Martes y Jueves de 17:30 a 19 3rdYear (de ll a 13 años inclusive): Lunes y
// Miércoles de 17 a 18:30
// Realizar el programa solicitado por el instituto, donde a partir del ingreso
// de la EDAD del alumno, el sistema informe por pantalla los días y horarios
// del curso
// correspondiente
