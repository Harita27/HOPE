import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            if(!set.contains(i))
            System.out.println(i+" "+map.get(i));
            set.add(i);
        }

    }
}
