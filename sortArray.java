/*
 * Sort an array containg all 0,1,2 only
 * Here we have 2 Approch
 * 1.count0,count1,count2 variable : time complexity O(2n)
 * 2.DNF algorithm 
 */

public class sortArray {
    public static void betterSolution(int arr[]){
        int count0 =0;
        int count1= 0;
        int count2 = 0;
        for(int i =0 ; i<arr.length ;i++){
            if(arr[i]==0){
                 count0++;          
            }else if(arr[i]==1){
                 count1++;
            }else{
                count2++;
             }
       }  
       System.out.println(count0);
       System.out.println(count1);
       System.out.println(count2); 
                 
                
                
        for(int i =0 ; i<count0 ; i++){
            arr[i] = 0;
        }
        for(int i = count0 ; i<count0+count1 ; i++){
            arr[i]=1;
        }
        for(int i = count0+count1 ; i<arr.length ; i++){
            arr[i]=2;
        }
    }
    public static void DNFAlgo(int arr[]){
        int low = 0;
        int mid =0 ;
        int high =arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }
            else if(arr[mid] ==1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={0,1,2,0,1,2,1,2,0,0,0,1};
        //betterSolution(arr);
        DNFAlgo(arr);
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
    }
    
}
