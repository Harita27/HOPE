import java.io.*;
import java.util.*;

public class Solution {
    static int[] dx = {2,1,-1,-2,-2,-1,1,2 };
    static int[] dy = {1,2,2,1,-1,-2,-2,-1 };
    public static boolean backtrack(int n,int row,int col,int moves,int[][] board){
        if(moves==n*n){
            return true;
        }
        for(int k=0;k<8;k++){
            int nr=row+dx[k];
            int nc=col+dy[k];
            if(nr>=0 && nc>=0 && nr<n && nc<n && board[nr][nc]==-1){
                board[nr][nc]=moves;
                if(backtrack(n,nr,nc,moves+1,board)){
                    return true;
                }
                board[nr][nc]=-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] board=new int[n][n];
        for (int i = 0; i < n; i++) {
          Arrays.fill(board[i], -1);
        }
        board[0][0]=0;
        boolean b=backtrack(n,0,0,1,board);

        if (!b) {
            System.out.println("No solution exists");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
