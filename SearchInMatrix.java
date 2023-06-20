import java.util.ArrayList;

public class SearchInMatrix{
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
         // Write your code here.
        int row = 0;
        int col = mat.get(0).size()-1;
        while(row< mat.size() && col>=0){
            if(mat.get(row).get(col) == target){
                return true;
            }else if(target<mat.get(row).get(col)){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        ArrayList<Integer>list1 =new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        ArrayList<Integer>list2 =new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        ArrayList<Integer>list3 =new ArrayList<>();
        list3.add(9);
        list3.add(10);
        list3.add(11);
        list3.add(12);


        mat.add(list1 );
        mat.add(list2);
        mat.add(list3);
        

        System.out.println(searchMatrix(mat, 15));
    }
}
