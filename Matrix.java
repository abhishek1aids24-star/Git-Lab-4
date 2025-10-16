public class MatrixAddition {

    public static void main(String[] args) {
      
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

      
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return; 
        }

        int rows = matrixA.length;
        int columns = matrixA[0].length;

        
        int[][] sumMatrix = new int[rows][columns];

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Resultant Matrix (Matrix A + Matrix B):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
