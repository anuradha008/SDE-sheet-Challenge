import java.util.ArrayList;

public class Duplicate {
     public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int count[] = new int[arr.size()+1];
        for(int i =0 ; i<arr.size(); i++){
            if(count[arr.get(i)]==0){
                count[arr.get(i)] += 1;
            }else{
                return arr.get(i);
            }         
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        System.out.println("The Duplicate Number is " + findDuplicate(arr, 4));
    }
}
