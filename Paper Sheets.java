// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h1=sc.nextInt();
        int w1=sc.nextInt();
        int h2=sc.nextInt();
        int w2=sc.nextInt();
        System.out.print(steps(h1,h2) + steps(w1,w2));
    }
    private static int steps(int h1, int h2){
        int cur=0;
        while(h1>h2){
            h1=(h1+1)/2;
            cur++;
            
        }
        return cur;
    }
}
