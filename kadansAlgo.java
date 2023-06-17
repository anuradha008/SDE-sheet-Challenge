public class kadansAlgo{
    public static int maxSubarraySum(int num[]){
        int currSum =0 ;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0 ; i< num.length ; i++){
            currSum += num[i];
            maxSum = Math.max(maxSum , currSum);
            currSum = Math.max(currSum, 0);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int num[] = { -2, -3,4,-1,-2,1,5,-3};
        System.out.println("The max Subarray Sum is : "+maxSubarraySum(num));
    }
}