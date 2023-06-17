import java.util.ArrayList;


public class PascalsTriangle {

    public static int getElement(int row , int col){
        row--;
        col--;
        long result = 1;
        for(int i = 0 ; i<col; i++){
            result = result*(row-i);
            result = result/(i+1);
        }
        return (int)result;
    }
    public static void printNrow(int row){
        long ans = 1;
        System.out.print(ans+" ");
        for(int i =1 ; i<row ; i++){
            ans *= (row-i);
            ans /= i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    public static ArrayList<Long> genarateRow(int row){
        ArrayList<Long> ans = new ArrayList<>();
        long temp = 1;
        ans.add(temp);
        for(int i =1; i<row ; i++){
            temp = temp*(row-i);
            temp = temp/(i);
            ans.add(temp);
        }
        return ans;
    }
       
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> result = new ArrayList<>();
        for(int row = 1; row<= n ;row++){
            result.add(genarateRow(row));
        }
        return result;
	}
     
    public static void main(String agrs[]){
        //System.out.println("The element in Pascal's Triangle is "+getElement(2, 2));
        // printNrow(4);
         int row = 5;
        // for(int i =0 ; i<=row ; i++){
        //     printNrow(i);
        // }

        //To print Pascal Triangle 
        ArrayList<ArrayList<Long>> result = printPascal(row);
        for(int i =0 ; i<result.size() ;i++){
            ArrayList<Long> currList = result.get(i);
            for(int j =0 ; j<currList.size() ; j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();

        }
        

    }
}
