// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        int sum=0, buy=0,sell=0;
        boolean fBuy=false, fSell = false;
        
        for(int i=0; i<prices.length; i++)
        {
            if((i==0 || prices[i]<=prices[i-1]) && (i==prices.length-1 || prices[i]<=prices[i+1]) && (fBuy!= true || prices[i]<buy) )
            {
                buy = prices[i];
                fBuy = true;
            }
            if((i==0 || prices[i]>=prices[i-1]) && (i==prices.length-1 || prices[i]>=prices[i+1])&& fBuy ==true && prices[i]>buy)
            {
                sell = prices[i];
                fSell = true;
            }
            
            if(fBuy == true && fSell == true)
            {
                sum+= sell-buy;
                fBuy = fSell = false;
            }
        }
        return sum;
    }
}
