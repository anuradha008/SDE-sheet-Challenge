// pair(arr[i],arr[j]) is call inversion pair when : 
// it satisfy 2 condition : 
// arr[i]>arr[j];
// j<i

import java.util.ArrayList;

public class countInversion {
     public static long getInversions(long arr[]) {
        // Write your code here.
        long count=0; 
        for(int i =0 ; i<arr.length-1; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;     
        int right = mid + 1;  
        int count = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                count += (mid - left + 1);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }
    public static int mergeSortApprorch(int arr[],int low,int high){
        int count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2 ;
        count += mergeSortApprorch(arr, low, mid);  
        count += mergeSortApprorch(arr, mid + 1, high); 
        count += merge(arr, low, mid, high);
        return count;
    }
    public static void main(String[] args) {
        // long arr1[] ={ 10,52244275, 123047899 ,493394237, 922363607, 378906890 ,188674257 ,222477309 ,902683641 ,860884025 ,339100162,};
        // long arr2[]={3,2,1 };
        // long arr3[]= { 2,5,1,3,4};
        // System.out.println("The Number of pairs are : "+getInversions(arr1));
        // System.out.println("The Number of pairs are : "+getInversions(arr2));
        // System.out.println("The Number of pairs are : "+getInversions(arr3));

        int[] a = {5, 4, 3, 2, 1};
        int n = 5;
        int count = mergeSortApprorch(a, 0, n-1);
        System.out.println("The number of inversions are: " + count);
    }
}
