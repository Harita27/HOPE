import java.io.*;
import java.util.*;

public class Solution {
    private static void prims(int[][] arr,int v,int e){
        boolean vis[]=new boolean[v];
        vis[0]=true;
        for(int i=0;i<v-1;i++){
            int x=0,y=0,min=Integer.MAX_VALUE;
            for(int st=0;st<v;st++){
                if(vis[st]==true){
                    for(int en=0;en<v;en++){
                        if(!vis[en] && arr[st][en]!=0){
                            if(arr[st][en]<min){
                            x=st;
                            y=en;
                            min=arr[st][en];
                            }
                        }
                    }
                }
            }
            System.out.println(x+" "+y+" "+ min);
            vis[y]=true;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int[][] arr=new int[v][v];
        for(int i=0;i<e;i++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            int w=sc.nextInt();
            arr[r][c]=w;
            arr[c][r]=w;
        }
        prims(arr,v,e);
    }
}
