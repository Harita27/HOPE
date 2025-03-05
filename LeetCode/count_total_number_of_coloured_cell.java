class Solution {
    public long coloredCells(int n) {
        if(n==1){
            return 1;
        }
        long k=2L*n*(n-1)+1;
        return(k);
    }
}
