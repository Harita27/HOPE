import java.io.*;
import java.util.*;

public class Solution {
    public static boolean backtrack(int n,int r,boolean[] R,boolean C[],boolean Ldiag[], boolean Rdiag[],int[] result,char[][] board){
        if(r==n){
            for(int i=0;i<n;i++){
                for(int c=0;c<n;c++){
                    if(board[i][c]=='Q'){
                        result[i]=c;
                    }
                }
            }
            return true;
        }
        for(int c=0;c<n;c++){
            if(R[r]==false && C[c]==false && Ldiag[r+c]==false && Rdiag[(n-1)-r+c]==false){
                R[r]=true;
                C[c]=true;
                Ldiag[r+c]=true;
                Rdiag[(n-1)-r+c]=true;
                board[r][c]='Q';
                if(backtrack(n,r+1,R,C,Ldiag,Rdiag,result,board)) return true;
                R[r]=false;
                C[c]=false;
                Ldiag[r+c]=false;
                Rdiag[(n-1)-r+c]=false;
                board[r][c]='.';
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean fl=true;
        int[] result =new int[n];
        char[][] board=new char[n][n];
        boolean[] R=new boolean[n];
        boolean C[]=new boolean[n];
        boolean Ldiag[]=new boolean[2*n-1];
        boolean Rdiag[]=new boolean[2*n-1];
        boolean b=backtrack(n,0,R,C,Ldiag,Rdiag,result,board);
        if(b){
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        return;
        }
        else System.out.print("No valid arrangement");

        
    }
