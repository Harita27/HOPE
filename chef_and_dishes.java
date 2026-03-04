import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0){
		    int last=-1;
		    HashMap<Integer,Integer> map=new HashMap<>();
		    boolean take=true;
		    int n=sc.nextInt();
		    for(int i=0;i<n;i++){
		        int val=sc.nextInt();
		        if(val== last){
		          take=!take;
		        }
		        else take =true;
		        if(take==true){
		            map.put(val,map.getOrDefault(val,0)+1);
		        }
		        last=val;
		    }
		   int ans=Integer.MAX_VALUE;
                   int max=0;

                for(int key:map.keySet()){   

                    int keys_value=map.get(key);

                 if (keys_value > max ){
                    max = keys_value;
                 }
                 if(keys_value == max && key < ans){
                    ans = key;
                    max = keys_value;
                 }
            }

            System.out.println(ans);
		    
		}
		
	}
}
