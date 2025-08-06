import java.io.*;
import java.util.*;
class node{
    int data;
    node next;
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
            temp=nn;
        }
        
    }void remove() {
        node t = head;
        while (t.next != temp) {
           t = t.next;
        }
        t.next = null;
        temp= t;
        }

    void dis() {
        if (head.next == null) {
            System.out.println("List is empty");
            return;
        }
        node t = head;
        while (t.next != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
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
        l.dis();
    }        
}