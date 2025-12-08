import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int c=0;
        int len=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<len;i++){
            if(arr[i]<k){
                c++;
            }
            else{
                max=Math.max(c,max);
                c=0;
            }
        }
        System.out.print(Math.max(c,max));
    }
}
