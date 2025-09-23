import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ind=0;ind<t;ind++){
        int v=sc.nextInt();
        int e=sc.nextInt();
        LinkedList<Integer>[] arr = new LinkedList[v];
        for (int i = 0; i <v; i++) {
            arr[i]=new LinkedList<>();
        }
        for(int i=0;i<e;i++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            arr[r].add(c);
            arr[c].add(r);
        }
        for(int i=0;i<v;i++){
            System.out.print(i+"-> ");
            for(int j=0;j<arr[i].size();j++){
                System.out.print(arr[i].get(j));
                if(j<arr[i].size()-1){
                    System.out.print("-> ");
                }
            }
            System.out.println();
        }
    }
    }
}
