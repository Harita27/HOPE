import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] cost=new int[n][3];
        for(int i=0;i<n;i++){
            cost[i][0]=sc.nextInt();
            cost[i][1]=sc.nextInt();
            cost[i][2]=sc.nextInt();
        }
        int dp[]=new int[3];
        dp[0]=cost[0][0];
        dp[1]=cost[0][1];
        dp[2]=cost[0][2];
        for(int i=1;i<n;i++){
            int red=cost[i][0]+Math.min(dp[1],dp[2]);
            int blue=cost[i][1]+Math.min(dp[0],dp[2]);
            int green=cost[i][2]+Math.min(dp[1],dp[0]);
            dp[0]=red;
            dp[1]=blue;
            dp[2]=green;
        }
        System.out.print(Math.min(dp[0],Math.min(dp[1],dp[2])));
    }
}
