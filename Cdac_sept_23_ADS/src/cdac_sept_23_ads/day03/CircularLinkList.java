
package cdac_sept_23_ads.day03;
class Node
{
    int data;
    Node next;
}

public class CircularLinkList {
   
    Node head;
    void addFirst(int val)
    {
        Node newNode=new Node();
        newNode.data=val;
        
        if(head==null)
        {
            newNode.next=newNode;
            head=newNode;
            
        }
        else
        {
            Node last=head;
            while(last.next!=head)
            {
                last=last.next;
                
            }
            last.next=newNode;
            newNode.next=newNode;
            head=newNode;
        }
        
    }
    void addLast(int val)
    {
        Node newNode=new Node();
        newNode.data=val;
        
        if(head==null)
        {
            newNode.next=newNode;
            head=newNode;
            
        }
        else
        {
            Node last=head;
            while(last.next!=head)
            {
                last=last.next;
                
            }
            last.next=newNode;
            newNode.next=newNode;
          
        }// head=newNode;
    }
    
    void delete(int val)
    {
        if(head==null)
            return;
        if(head.data==val && head.next==head)
        {
            head=null;
        }
        else if(head.data==val)
        {
            Node temp=head;
            
            
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            
        
            temp.next=head.next;
            head=head.next;
         
        }
        else
        {
            Node temp=head;
            while(temp.next!=head)
       
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
    boolean search(int val)
    {
        
                    
        
        return false;
        
    }
    void printList()
    {
        if(head==null)
        {
           return;
        }  
 
         Node temp=head;
        do{
            System.err.println(temp.data);
            temp=temp.next;
         }
       
        while(temp!=head);
         
    }
    public static void main(String[] args) {
        CircularLinkList cls=new CircularLinkList();
        cls.addFirst(100);
        cls.addFirst(200);
        cls.addFirst(300);
        cls.addFirst(400);
        
        cls.delete(400);
        //cls.addLast(500);
        cls.printList();
        
    }
}
