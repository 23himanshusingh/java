import java.io.*;
import java.util.*;
//user defined generic queue class
class queue<T>{
    int front=-1,rear=-1;
    ArrayList<T> A=new ArrayList<T>();
    T front(){
        if (this.empty()){
            return null;
        }
        return A.get(front+1);
    }
    T rear(){
        if (rear==-1)
            return null;
        return A.get(rear);
    }
    void enqueue(T x){
        if (this.empty()){
            rear++;
            A.add(x);
        }
        else{
            rear++;
            if (A.size()==rear-1){
                A.set(rear,x);
            }
            else{
                A.add(x);
            }
        }
    }
    T dequeue(){
        T x;
        if (this.empty()){
            System.out.println("Queue is Empty\n");
        }
        else{
            front++;
            return A.get(front);
        }
        return null;
    }
    boolean empty(){
        if (front==rear)
            return true;
        return false;
    }
    public String toString(){
        if (this.empty()){
            return "";
        }
        String ans="";
        for (int i=front+1;i<=rear;i++){
            ans+=String.valueOf(A.get(i))+"->";
        }
        return ans;
    }
}

class queueGenerics{
    public static void main(String args[]){
        queue <Integer> q1=new queue<>();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(20);
        System.out.println(
            "q1 after enqueue of 3 elements:\n" + q1);
        System.out.println(q1.dequeue());
        System.out.println("q1 after dequeue :\n" + q1);
        queue<String> q2 = new queue<>();
 
        // Pushing elements to the String object created
        // Custom input string entries
        q2.enqueue("hello");
        q2.enqueue("world");
        q2.enqueue("GFG");
 
        // Print the queue after inserting string elements
        System.out.println(
            "\nq2 after enqueue of 3 elements:\n" + q2);
 
        // Printing front and rear of the above queue
        System.out.println("q2 front = " + q2.front()
                           + ", q2 rear = " + q2.rear());
 
        // Case 3 : Float Queue
 
        // Creating object of queue Class (user defined)
        // Declaring object of float type
        queue<Float> q3 = new queue<>();
 
        // Display message only
        System.out.println(
            "\nCreated new Float type queue q3...");
 
        // Display whether queue is empty or not
        // using the empty() method
        System.out.println(
            "Checking if queue is empty or not :\n"
            + q3.empty());
    }
}