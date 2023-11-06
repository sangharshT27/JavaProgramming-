
package sorting;


public class SelectionSortEx {
    
     public  static void swap(int arr[],int i, int j) 
     {
          int temp;
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
       
        
       
    }
     public void testselection(int arr[],int size)
     {
         for(int i=0;i<size-1;i++)
         {
             for(int j=i+1;j<size;j++){
                 if(arr[i]>arr[j])
                 {
                     swap(arr,i,j);
                 }
             }
              
             System.out.println(arr[i]);
         }
     }
    public static void main(String[] args) {
         int arr[]={123,354,564,234,122,226};
        SelectionSortEx ss=new SelectionSortEx();
        ss.testselection(arr, arr.length);
        
    }

   
}
