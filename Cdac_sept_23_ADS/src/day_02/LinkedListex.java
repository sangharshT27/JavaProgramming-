
package day_02;

class Node
{
    int data;
    Node next;
}
public class LinkedListex {
    
    Node head,middle,last;
    public void createList()
    {
    head=new Node();
    middle=new Node();
    last=new Node();
    
    head.data=10;
    middle.data=20;
    last.data=30;
    
    head.next=middle;
    middle.next=last;
    last.next=null;
            }

public void showList()
{
  Node temp=head;
  while(temp!=null)
  {
      System.out.println(temp.data);
      temp=temp.next;
  }
}
    public static void main(String[] args) {
         
        LinkedListex ld=new LinkedListex();
        ld.createList();
        ld.showList();
    }

}