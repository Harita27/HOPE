import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<Integer> vowels=new ArrayList<>();
        String vowel="aeiouAEIOU";
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(vowel.indexOf(s.charAt(i))!=-1){
                vowels.add(i);
            }
        }
        int cur=0;
        for(int i=0;i<vowels.size()-1;i++){
            int start=vowels.get(i);
            int end=vowels.get(i+1);
            st.append(s.substring(cur,start+1));
            String between=s.substring(start+1,end);
            st.append(new StringBuilder(between).reverse());
            cur=end;
        }
        st.append(s.substring(cur));
        System.out.print(st.toString());
    }
}