
package day_04_douballyLinkList;

class Node
{
    Node prev;
    int data;
    Node Next;
}
public class DouballyLinkedList {
    
    Node head;
    
     void addFirst(int val)
    {
        Node newNode=new Node();
        newNode.data=val;
        
        if(head==null)
        {
            newNode.prev=null;
            newNode.Next=null;
            
            
            head=newNode;
                    
        }
        else
        {
            newNode.prev=null;
            newNode.Next=head;
            newNode.prev=newNode;
            
            head=newNode;
        }
    }
     
     
    public static void main(String[] args) {
        DouballyLinkedList dl=new DouballyLinkedList();
        dl.addFirst(100);
//        dl.addFirst(200);
//        dl.addFirst(300);
//        dl.addFirst(400);
//        dl.addFirst(500);
    }
}
