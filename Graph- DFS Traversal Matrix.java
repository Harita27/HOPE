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
        boolean vis[]=new boolean[v];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        while(!st.isEmpty()){
            int n=st.pop();
            if(!vis[n]){
                System.out.print(n+" ");
                vis[n]=true;
            }
            for(int i=v-1;i>=0;i--){
                if(arr[n][i]==1 && !vis[i]){
                    st.push(i);
                }
            }
        }
    }
}
