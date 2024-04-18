/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAA;
import java.util.*;
/**
 *
 * @author Kashish
 */
public class exp4{  
  
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public Node head = null;  
    public Node tail = null;  
    public void addAtStart(int data) {  

        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            Node temp = head;  
            head = newNode;  
            head.next = temp;  
        }  
    }  
 
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the start of the list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        exp4 sList = new exp4();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the size of your linked list");
        int n = myObj.nextInt();
//        int[] arr  = new int[n];
        System.out.println("Enter the elements of your linked list");
        for(int i=0;i<n;i++){
            int j = myObj.nextInt();
            sList.addAtStart(j);
        }
        sList.display();  
    }  
}  