// pair(arr[i],arr[j]) is call inversion pair when : 
// it satisfy 2 condition : 
// arr[i]>arr[j];
// j<i


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
    public static void main(String[] args) {
        long arr1[] ={ 10,52244275, 123047899 ,493394237, 922363607, 378906890 ,188674257 ,222477309 ,902683641 ,860884025 ,339100162,};
        long arr2[]={3,2,1 };
        long arr3[]= { 2,5,1,3,4};
        System.out.println("The Number of pairs are : "+getInversions(arr1));
        System.out.println("The Number of pairs are : "+getInversions(arr2));
        System.out.println("The Number of pairs are : "+getInversions(arr3));
    }
}
