import java.util.ArrayList;

public class MissingRepeating {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int count[] = new int[n+1];
        int ans[]= new int[2];
        for(int i =0 ; i<arr.size(); i++){
            count[arr.get(i)] +=1;
        }
        for(int i =1; i<count.length ; i++){
            if(count[i] ==0){
                ans[0] = i;
            }
            if(count[i]==2){
                ans[1] = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(5);
        arr.add(1);
        int ans[] = missingAndRepeating(arr, 6);
        System.out.println("The Missing Number is "+ans[0]);
        System.out.println("The Repeating Number is "+ans[1]);
            
    }
    
}
