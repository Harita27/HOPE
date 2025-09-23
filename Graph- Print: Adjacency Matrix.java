import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        String s=sc.next();
        int[][] adj=new int[v][v];
        for(int i=0;i<e;i++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            int w=sc.nextInt();
            adj[r][c]=w;
            if(s.equals("no")){
                adj[c][r]=w;
            }
            
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
