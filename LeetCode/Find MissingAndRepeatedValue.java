class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int sum=0;
        Set<Integer> set=new HashSet<>();
        int[] arr=new int[2];
        int R=grid.length;
        int C=R;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
              if(!set.contains(grid[row][col])){
               set.add(grid[row][col]);
               sum+=grid[row][col];
              }
              else arr[0]=grid[row][col];
            }
        }
        int total=R*R*(R*R+1)/2;
        arr[1]=total-sum;
        return(arr);


    }
