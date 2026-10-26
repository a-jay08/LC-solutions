class Solution {
    public int passThePillow(int n, int time) {
        int i=1;
        int num=1;
        while(time!=0){
            i+=num;
            time--;
            if(i==n || i==1){
                num=-num;
            }
        }
        return i;
    }
}