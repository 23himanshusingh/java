// struct Node {
//     int data;
//     struct Node* next;
// };
// class Node {
//     public:
//         int data;
//         Node* next;
// };
class LinkedList{
    Node head; // head of the list

    static class Node <T>{//this inner class is made static so that main can access it
        T data;
        Node next;
        Node(T x){
            data=x;
            next=null;
        }
    }
    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
    }
    public static void main(String args[]){
        LinkedList llist=new LinkedList();
        llist.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        llist.head.next=second;
        second.next=third;
        llist.printList();

        System.out.println();
        
        LinkedList llist1=new LinkedList();
        llist1.head=new Node("ABC");
        second=new Node("def");
        third=new Node("gh");
        llist1.head.next=second;
        second.next=third;
        llist1.printList();

    }
}
