import java.io.*;
import java.util.*;

public class Solution {
    public static boolean backtrack(int n,int r,boolean[] R,boolean C[],boolean Ldiag[], boolean Rdiag[],List<List<String>> result,char[][] board){
        if(r==n){
            List<String> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for(int c=0;c<n;c++){
                    if(board[i][c]=='Q'){
                        sb.append('Q');
                    }
                    else sb.append('-');
                    sb.append(" ");
                }
                ans.add(sb.toString());
            }
            result.add(ans);
            return true;
        }
        for(int c=0;c<n;c++){
            if(R[r]==false && C[c]==false && Ldiag[r+c]==false && Rdiag[(n-1)-r+c]==false){
                R[r]=true;
                C[c]=true;
                Ldiag[r+c]=true;
                Rdiag[(n-1)-r+c]=true;
                board[r][c]='Q';
                boolean b=backtrack(n,r+1,R,C,Ldiag,Rdiag,result,board);
                R[r]=false;
                C[c]=false;
                Ldiag[r+c]=false;
                Rdiag[(n-1)-r+c]=false;
                board[r][c]='-';
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<String>> result =new ArrayList<>();
        char[][] board=new char[n][n];
        boolean[] R=new boolean[n];
        boolean C[]=new boolean[n];
        boolean Ldiag[]=new boolean[2*n-1];
        boolean Rdiag[]=new boolean[2*n-1];
        boolean b=backtrack(n,0,R,C,Ldiag,Rdiag,result,board);
        if(n==3 || n==2){
            System.out.print(-1);
            return;
        }
        for (List<String> boar : result) { 
        for (String row : boar) {   
           System.out.println(row);
        }
        System.out.println(); 
        }

        
    }
}
