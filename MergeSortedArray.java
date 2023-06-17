public class MergeSortedArray {
    public static int[] SortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int temp[] = new int[m+n];
        int i= 0;
        int j= 0;
        int k = 0;
        while(i<m&&j<n){
            if(arr1[i]<=arr2[j]){
                temp[k]=arr1[i];
                i++;
            }else{
                temp[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            temp[k++] =arr1[i++];
        }
        while(j<n){
            temp[k++]=arr2[j++];
        }
        for(int l =0 ;l<arr1.length ;l++){
            arr1[l]=temp[l];
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr1[] = { 1 ,2 ,3 ,0 ,0 };
        int m =3;
        int arr2[] = {4,5};
        int n =2;
        int result[] = SortedArrays(arr1, arr2, m, n);
        for(int i =0 ; i<result.length ; i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
