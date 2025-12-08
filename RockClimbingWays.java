import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int I = sc.nextInt();
        int X = sc.nextInt();
        int dist = N-I;
        int[] dp = new int[dist+1];
        dp[0] = 1;
        for(int i = 0 ; i <= dist ; i++){
            for(int j = 1 ; j <= X ; j++){
                if(i-j >= 0){
                    dp[i] += dp[i-j];
                }
            }
        }
        System.out.println(dp[dist]);
    
        
    }
}
