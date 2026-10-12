class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int div=empty/numExchange;
            int remainder=empty%numExchange;

            total+=div;
            empty=div+remainder;
        }
        return total;
    }
}