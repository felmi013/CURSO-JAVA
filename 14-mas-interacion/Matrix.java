

public class Matrix {
    
    
    static void vector(){
        int[]vectorNumber = {3,4,5,23,54};
        String[] vectorNames =new String [4];
    
        vectorNames[0] = "Felipe";
        vectorNames[1] ="Luisa";  
        vectorNames[3] ="Ramon";
    
        for (int i = 0; i < vectorNames.length; i++) {
            System.err.println(vectorNumber[i]);
            
        }
        for (String name : vectorNames) {
        System.out.println(name);
    
        }
        
    }

    matrix(){
        int[][] matrixNumber =  new int [3][3];

        matrixNumber [0][0] = 22;
        matrixNumber [0] [1] = 44;
        matrixNumber [0] [2] = 50;
         matrixNumber [1][0] = 25;
        matrixNumber [1] [1] = 46;
        matrixNumber [1] [2] = 57;
         matrixNumber [2][0] = 13;
        matrixNumber [2] [1] = 5;
        matrixNumber [2] [2] = 0;


        for (int i = 0; i < matrixNumber.length; i++) {
            for (int j = 0; j < matrixNumber[0].length; j++) {
                         System.out.println(matrixNumber[i][j]); 
               //     System.out.println(matrixNumber[i][0]);
           // System.out.println(matrixNumber[i][1]);
           // System.out.println(matrixNumber[i][2]);
            }
          
            
        }
    }



    
    public static void main(String[] args) {
       vector(); 
       matrix();

    }
}
