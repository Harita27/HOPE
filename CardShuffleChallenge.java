import java.io.*;
import java.util.*;

public class Solution {
    public static void Swap(ArrayList<Integer> arr,int k){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==k){
                int temp=arr.get(i);
                arr.set(i,0); 
                arr.set(0,temp);
                break;
            }
        }
        return;
    }

    public static void print(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            arr.add(d);
            if (d != 0)
                heap.add(d);
        }

        Collections.sort(arr);
        if (arr.get(0) == 0) {
            if (heap.isEmpty()) {
                print(arr);
                return;
            }
            int k = heap.poll(); 
            Swap(arr, k);         
            print(arr);
            return;
        } else {
            print(arr);
        }
    }
}
