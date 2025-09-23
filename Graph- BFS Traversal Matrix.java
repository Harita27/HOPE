import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int[][] arr=new int[v][v];
        for(int i=0;i<e;i++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            arr[r][c]=1;
            arr[c][r]=1;
        }
        List<Integer> result = new ArrayList<>();
        boolean[] visited=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            result.add(node);
            for(int j=0;j<v;j++){
                if(arr[node][j]==1 && !visited[j]){
                    q.add(j);
                    visited[j]=true;
                }
            }
        }
         for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) 
                System.out.print(" ");
        }
    }
}
