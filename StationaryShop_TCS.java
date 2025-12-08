import java.io.*;
import java.util.*;
public class Solution {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int P=sc.nextInt();
        int E=sc.nextInt();
        if(P>N || E>M){
            System.out.print(0);
            return;
        }
        int res1=factorial(N)/(factorial(P)*factorial(N-P));
        int res2=factorial(M)/(factorial(E)*factorial(M-E));
        System.out.print(res1*res2);
        
        
    }
}
