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
        int fact1=factorial(N);
        int factd1=factorial(P);
        int factd2=factorial(N-P);
        int fact2=factorial(M);
        int factd21=factorial(E);
        int factd22=factorial(M-E);
        int k=fact1/(factd1*factd2);
        int l=fact2/(factd21*factd22);
        System.out.print(k*l);
        
        
    }
}
