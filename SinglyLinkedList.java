
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Main {
    static Node head = null;

    // Insert at end
    public static void inserAtEnd(Node newNode){
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at beginning
    public static void insertAtbegin(Node newNode){
        newNode.next = head;
        head = newNode;
    }

    // Insert at position (1-based index)
    public static void insertAtPos(Node newNode, int pos){
        if (pos == 1){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        // stop at node just before position
        for (int i = 1; i < pos - 1 && temp != null; i++){
            temp = temp.next;
        }

        if (temp == null){
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at end
    public static void deletAtEnd(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at position (1-based index)
    public static void deletAtPos(int pos){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }

        if (pos == 1){
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++){
            temp = temp.next;
        }

        if (temp == null || temp.next == null){
            System.out.println("Position out of range");
            return;
        }

        temp.next = temp.next.next;
    }

    // Search key in list
    public static boolean search(int key){
        Node temp = head;
        while (temp != null){
            if (temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Print list
    public static void printList(){
        Node temp = head;
        if (temp == null){
            System.out.println("List is Empty");
            return;
        }
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at End");
            System.out.println("5. Delete at Position");
            System.out.println("6. Search");
            System.out.println("7. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    Node newNode = new Node(data);
                    insertAtbegin(newNode);
                    break;
                }
                case 2: {
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    Node newNode = new Node(data);
                    inserAtEnd(newNode);
                    break;
                }
                case 3: {
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    Node newNode = new Node(data);
                    insertAtPos(newNode, pos);
                    break;
                }
                case 4: {
                    deletAtEnd();
                    break;
                }
                case 5: {
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    deletAtPos(pos);
                    break;
                }
                case 6: {
                    System.out.print("Enter key to search: ");
                    int key = sc.nextInt();
                    if (search(key)) {
                        System.out.println("Key found");
                    } else {
                        System.out.println("Key not found");
                    }
                    break;
                }
                case 7: {
                    printList();
                    break;
                }
                case 0: {
                    System.out.println("Exiting...");
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);
    }
}
