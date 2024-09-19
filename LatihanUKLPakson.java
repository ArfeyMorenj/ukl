
package latihanuklpakson;


public class LatihanUKLPakson {

    
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 2;
        int d = 3;  
        int[][] matrix = new int[a][b];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = c + (i * b + j) * d;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
    
    

