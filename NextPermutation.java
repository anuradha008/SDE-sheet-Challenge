import java.util.*;
public class NextPermutation {
    public static ArrayList<Integer> permutation(ArrayList<Integer> permutation){
        int idx =-1;
        int n = permutation.size();
        for(int i =n-2 ; i>=0 ; i--){
            if(permutation.get(i)<permutation.get(i+1)){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            Collections.reverse(permutation);
            return permutation;
        }
        for(int i = n-1 ;i>=idx ; i--){
            if(permutation.get(i)>permutation.get(idx)){
                int temp = permutation.get(i);
                permutation.set(i, permutation.get(idx));
                permutation.set(idx, temp);
                break;
            }
        }
        int start = idx+1;
        int end = n-1;
        while(start<end){
                int temp = permutation.get(start);
                permutation.set(start,permutation.get(end));
                permutation.set(end, temp);
                start++;
                end--;

        }
        return permutation;
    }
    public static void main(String args[]){
        ArrayList<Integer> a= new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(4);
        a.add(1);
        a.add(0);
        a.add(0);
        ArrayList<Integer> result = permutation(a);
        for(int i = 0 ; i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }

    }
}
