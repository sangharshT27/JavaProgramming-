
package sorting;


public class BubbleSortEx {
    
    
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
     public int[] testbubble(int arr[],int size)
     {
         for(int i=0;i<size-1;i++)
         {
             for(int j=i+1;j<size;j++){
                 if(arr[i]>arr[j])
                 {
                     swap(arr,i,j);
                 }
             }
              
//             System.out.println(arr[i]);
            
         }
        return arr;
     }
    public static void main(String[] args) {
        
        int arr[]={123,354,564,122,226};
        BubbleSortEx bs=new BubbleSortEx();
        int a[]=bs.testbubble(arr, arr.length);
       
        for(Integer i:arr)
        {
            System.out.println(i);
        }
    }
}
