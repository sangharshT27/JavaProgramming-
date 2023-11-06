
package searching.linearsearch;


public class LinearcSearchEx 
{
    public int linearSearch(int arr[],int size,int key)
    {
        int i;
        for(i=0;i<size;i++)
        {
            if(arr[i]==key)
                return 1;
        }
        return 0;
        
    }
    public static void main(String[] args) {
        int page_number[]={86,91,34,50,0};
        int key=50;
       LinearcSearchEx  lobj=new LinearcSearchEx ();
       if(lobj.linearSearch(page_number,page_number.length, key)==1)
         System.out.println("search found");
      else
          System.out.println("search not found");
    }
    
}
