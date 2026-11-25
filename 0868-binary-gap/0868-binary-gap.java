class Solution {
    public int binaryGap(int n) {
        int lastpos = -1;
        int maxgap = 0;
        int pos = 0;

        while(n > 0){
            if((n & 1) == 1){
                if(lastpos != -1){
                    maxgap = Math.max(maxgap, pos - lastpos);
                }
                lastpos = pos;
            }
            n >>= 1;
            pos++;
        }
        return maxgap;
    }
}