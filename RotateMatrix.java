import java.util.ArrayList;

public class RotateMatrix {
    //Using ArrayList 

    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        int startRow =0;
        int endRow = n-1;
        int startCol = 0;
        int endcol = m-1;

        while(startRow<=endRow && startCol<=endcol){
            if(startRow==endRow ||startCol==endcol){
                    break;
             }
            int prev =mat.get(startRow).get(startCol);
            //top
            for(int j = startCol+1  ; j<=endcol ; j++){
                int curr = mat.get(startRow).get(j);
                mat.get(startRow).set(j,prev);
                prev = curr;
            }
            //right 
            for(int i = startRow+1 ; i<=endRow;i++){               
                int curr = mat.get(i).get(endcol);
                mat.get(i).set(endcol,prev);
                prev = curr;
            }
            //bottom
            for(int j =endcol-1 ; j>= startCol ; j--){
                
                
                int curr = mat.get(endRow).get(j);
                mat.get(endRow).set(j,prev);
                prev = curr;
                
            }
            //left
            for(int i = endRow-1 ; i >= startRow ;i--){
                
                int curr = mat.get(i).get(startCol);
                mat.get(i).set(startCol,prev);
                prev = curr;
            }
            startRow++;
            endRow--;
            startCol++;
            endcol--;
        }
        
    }





    public static void spiralMatrix(int matrix[][]){
        int startRow =0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endcol = matrix[0].length-1;
        
        while(startRow<=endRow && startCol<=endcol){
            //if there is only one row or one col then there is no need to rotate
            if(startRow==endRow ||startCol==endcol){
                    break;
             }

            int prev = matrix[startRow][startCol];
            //top
            for(int j = startCol+1  ; j<=endcol ; j++){
                int curr = matrix[startRow][j];
                matrix[startRow][j]= prev;
                prev = curr;
            }
            //right 
            for(int i = startRow+1 ; i<=endRow;i++){
                int curr = matrix[i][endcol];
                matrix[i][endcol] = prev;
                prev = curr;
            }
            //bottom
            for(int j =endcol-1 ; j>= startCol ; j--){
                
                int curr = matrix[endRow][j];
                matrix[endRow][j]= prev;
                prev = curr;
                
            }
            //left
            for(int i = endRow-1 ; i >= startRow ;i--){
                
                int curr = matrix[i][startCol];
                matrix[i][startCol] = prev;
                prev = curr;
            }
            startRow++;
            endRow--;
            startCol++;
            endcol--;
        }
    }
    public static void main(String args[]){
        int matrix[][]={{1 ,2, 3, 4},{5, 6, 7, 8},{9 ,10, 11 ,12},{13, 14 ,15 ,16}};
        int matrix1[][]={{1,2,3,4,5}};
        //spiralMatrix(matrix);
        spiralMatrix(matrix1);
        for(int i=0 ; i<matrix1.length ; i++){
            for(int j =0 ; j<matrix1[0].length ; j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
