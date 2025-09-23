import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        LinkedList<Integer>[] arr=new LinkedList[v];
        for(int i=0;i<v;i++){
            arr[i]=new LinkedList<>();
        }
        for(int i=0;i<e;i++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            arr[r].add(c);
            arr[c].add(r);
        }
        ArrayList<Integer> res=new ArrayList();
        boolean vis[]=new boolean[v];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        while(!st.isEmpty()){
            int n=st.pop();
            if(!vis[n]){
                System.out.print(n+" ");
                vis[n]=true;
            }      
            List<Integer> neig=arr[n];
            Collections.sort(neig,Collections.reverseOrder());
            for(int i:neig){
                if(!vis[i]){
                    st.push(i);
                }
            }
        }
    }
}
