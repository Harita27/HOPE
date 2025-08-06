import java.io.*;
import java.util.*;
class node{
    int data;
    node next;
    node prev;
    node(int d){
        data=d;
    }
}
class ll{
    node temp=null;
    node head=null;
    void ins(int n){
        node nn=new node(n); 
        if(head==null){
            head=nn;
            temp=nn;
        }
        else {
            temp.next=nn;
            nn.prev=temp;
            temp=nn;
        }
        
    }
    void disForward() {
        if (head.next == null) {
            System.out.println("List is empty");
            return;
        }
        node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
    void disBackward(){
         node current = head;
         if (current == null) {
            System.out.println("List is empty");
            return;
         }
         if (current == null) return; /
         while (current.next != null) {
               current = current.next;
          }
         while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
          }
    }

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll l=new ll();
        while(sc.hasNext()){
            int n=sc.nextInt();
            l.ins(n);
        }
        l.disForward();
        l.disBackward();
    }        
}