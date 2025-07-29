import java.io.*;
import java.util.*;

public class Solution {
    private static void change(char[][] a, int i,int j){
        
        if (i < 0 || i >= a.length || j < 0 || j >= a[0].length || a[i][j] != '1') {
            return;
        }
        a[i][j]='5';
        change(a,i-1,j);
        change(a,i+1,j);
        change(a,i,j-1);
        change(a,i,j+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        char[][] a=new char[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                a[i][j]=sc.next().charAt(0);
            }
        }
        int c=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(a[i][j]=='1'){
                    c++;
                    change(a,i,j);
                }
            }
        }
        System.out.print(c);
    }
}