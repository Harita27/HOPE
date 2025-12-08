import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        long e[]=new long[len];
        for(int i=0;i<len;i++)
        {
            e[i]=sc.nextLong();
        }
        if(len==0){
            System.out.print(0);
            return;
        }
        long dp[][]=new long[len+1][2];
        dp[0][0]=0;
        dp[0][1]=e[0];
        for(int i=1;i<len;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1]=Math.max(dp[i-1][0]+e[i],dp[i-1][1]+(e[i]/2));
        }
        System.out.print(Math.max(dp[len-1][0],dp[len-1][1]));
        
        
    }
}
