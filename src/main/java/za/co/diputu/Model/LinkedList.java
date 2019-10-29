package za.co.diputu.Model;

import javax.xml.soap.Node;
import java.util.*;
import java.io.*;

public class LinkedList {

        Node head;

        static class Node {

            String data;
            Node next;

            // Constructor
            Node(String d)
            {
                data = d;
                next = null;
            }
        }

    public static LinkedList insert(LinkedList list, String data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
    public void practice()
    {

    }

    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();
        Scanner in = new Scanner(System.in);
        String n = in.next
        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, "1");
        list = insert(list, "2");
        list = insert(list, "3");
        list = insert(list, "4");
        list = insert(list, "5");
        list = insert(list, "6");
        list = insert(list, "7");
        list = insert(list, "8");
        list = insert(list, "9");

        // Print the LinkedList
        printList(list);
    }
}
