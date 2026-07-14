// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        ArrayList<Integer> smallfactors=new ArrayList<>();
        ArrayList<Integer> largefactors=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){smallfactors.add(i);
            if(i!=n/i){
                largefactors.add(n/i);
            }
            }
        }
        result.addAll(smallfactors);
        for(int i=largefactors.size()-1;i>=0;i--){
            result.add(largefactors.get(i));
        }
        if(p>result.size()){
            System.out.print(-1);
        }
        else System.out.print(result.get(p-1));
        
        
    }
   
}
