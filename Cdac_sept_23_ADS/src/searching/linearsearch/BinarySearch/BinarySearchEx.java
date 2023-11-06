
package searching.linearsearch.BinarySearch;


public class BinarySearchEx 
{
    public int binarySearch(int arr[],int start,int end,int key)
    {
        int mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            
            if(arr[mid]==key)
            {
          
               return 1;
            }
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
            
        }
        return 0;
    }
    public static void main(String[] args) {
        int page_Number[]={10,23,45,70,90,100,111,123};
        int key=123;
   
        BinarySearchEx bs=new BinarySearchEx();
        if(bs.binarySearch(page_Number, 0, page_Number.length-1,key)==2){
            System.out.println("Search Found");
        }
        else
        {
            System.out.println("search not found");
        }
    }
}
