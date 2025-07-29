import java.io.*;
import java.util.*;
public class Solution {
    private static int change(char[][] arr,int i,int j,int c){
        
        if(i<0||i==arr.length||j<0||j==arr[0].length||arr[i][j]!='T'){
            return c;
        }
        arr[i][j]='s';
        c+=1;
        c=change(arr,i-1,j,c);
        c=change(arr,i+1,j,c);
        c=change(arr,i,j-1,c);
        c=change(arr,i,j+1,c);
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]=='T'){
                    int c=0;
                    int res=change(arr,i,j,c);
                    max=Math.max(max,res);
                }
            }
        }
        System.out.print(max);
    }
}