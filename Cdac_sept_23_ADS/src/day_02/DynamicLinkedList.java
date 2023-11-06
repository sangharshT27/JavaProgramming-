
package day_02;

//SignlyList
class Node
{
    int data;
    Node next;
}

public class DynamicLinkedList 
              
{
    Node head;
    void addFirst(int val)
    {
        Node newNode=new Node();
        newNode.data=val;
        newNode.next=head;
        
         head=newNode;//Shifting of new node
    }
    void addLast(int val)
    {
        Node newNode=new Node();
        newNode.data=val;
        
        if(head==null)
            head=newNode;
        else
        {
            Node lastNode=head;
            while(lastNode.next!=null)
            {
                lastNode=lastNode.next;
                
            }
            lastNode.next=newNode;
            
        }
    }
    void deleteNode(int val)
    {
        if(head.data==val)
        {
            head=head.next;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                if(temp.next.data==val)
                {
                    temp.next=temp.next.next;
                    break;
                    
                }
                temp=temp.next;
            }
        }
        
       
    }
    boolean serachNode(int val)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==val)
            {
                return true;
                
            }
            else
            {
                 temp=temp.next;
            }
                    
        }
        return false;
    }
    void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
    
    public static void main(String[] args) {
        
        DynamicLinkedList dl=new DynamicLinkedList();
        dl.addFirst(10);
        dl.addFirst(20);
        dl.addFirst(30);
        dl.addFirst(40);
        dl.addFirst(50);
        
        dl.addLast(100);
        
        dl.printList();
        
        
        
        dl.deleteNode(100);
        
        dl.printList();
        System.out.println(".........................");
        System.out.println(dl.serachNode(50));
        System.out.println(dl.serachNode(25));
       
    }
}
