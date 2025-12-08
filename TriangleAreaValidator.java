import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long m=sc.nextInt();
        long k=sc.nextInt();
        if(n==0||m==0||k==0){
            System.out.print("NO");
            return;
        }
        long ans=n*m;
        if(ans%k==0){
            System.out.print("YES");
        }
        else System.out.print("NO");
        return;
    }
}
