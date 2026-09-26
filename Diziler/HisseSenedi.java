class Solution {
    public int maxProfit(int[] prices) {
        int enKucukFiyat=prices[0];
        int maxKar=0;

    for(int i=0; i<prices.length; i++){
        enKucukFiyat=Math.min(enKucukFiyat,prices[i]);
        maxKar = Math.max(maxKar, prices[i]-enKucukFiyat);

    }
    return maxKar;

    }
}