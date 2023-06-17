public class buyNsell {
    public static int buySell(int price[]){
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0 ; i< price.length ; i++){
            if(buy<price[i]){
                int profit = price[i] -buy;
                maxProfit = Math.max(maxProfit , profit);
            }else{
                buy = price[i];
            }
        }
        return maxProfit;
    }
    
    public static void main(String args[]){
         int price[] ={ 7, 6, 4,  3, 1};
        System.out.println("The Maxprofit is : " +buySell(price));
        
    }
}
