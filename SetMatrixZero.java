public class SetMatrixZero{
    public static void setZeros1(int matrix[][]) {
        //Brute force approach
        int N = matrix.length;
        int M = matrix[0].length;
    
        for(int i =0;i<N ; i++){
            for(int j=0;j<M ; j++){
                if(matrix[i][j]==0){
                 for(int k =0 ; k<M ; k++){
                    if(matrix[i][k] !=0)
                      matrix[i][k]= -1;
                 }
                 for(int l =0 ; l<N ; l++){
                    if(matrix[l][j]!=0)
                      matrix[l][j]= -1;
                 }
                }
            }
        }
        for(int i =0 ; i<N; i++){
            for(int j =0 ; j<M ; j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void setZeros2(int matrix[][]){
         int N = matrix.length;
        int M = matrix[0].length;
        int row[] = new int[N];
        int col[] = new int[M];
        for(int i =0 ; i<N ; i++){
            for(int j =0 ; j<M; j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i = 0 ; i< N ; i++){
            for(int j = 0 ;j<M ; j++){
                if(row[i]==1|| col[j]==1){
                    matrix[i][j] =0 ;
                }
            }
        }

    }
    public static void setZeros3(int matrix[][]){
        int col0 = 1;
        int n= matrix.length;
        int m = matrix[0].length;
        for(int i =0 ; i<n; i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j] ==0 ){
                    matrix[i][0] =0;
                    if(j != 0){
                        matrix[0][j] =0;
                    }else{
                        col0 =0;
                    }
                }
            }
        }
        for(int i =1 ; i<n ; i++){
            for(int j =1 ; j<m ; j++){
                if(matrix[i][j] != 0){
                    if(matrix[0][j] == 0 || matrix[ i][0] ==0){
                        matrix[i][j] = 0;
                    }
                }     
            }
        }
        if(matrix[0][0] ==0){
                    for(int j =0 ; j<m ; j++){
                        matrix[0][j] =0;
                    }
       }
       if(col0 == 0){
        for(int i =0 ; i<n ; i++){
            matrix[i][0] =0;
        }
       }
    }
    public static void printArray(int m[][]){
        for(int i =0 ; i<m.length ;i++){
            for(int j =0;j<m[0].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
       
    public static void main(String[] args) {
        int m[][]={{1,2,3},{4 ,0, 6},{7,8,9}};
          setZeros3(m);
          printArray(m);
    }
}