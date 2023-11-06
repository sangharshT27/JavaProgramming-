
package thread.LabTask;






import java.util.Arrays;


class SortArray extends Thread {
    @Override
    public void run() {
        int arr[] = {2, 6, 7, 66, 25, 1, 10, 20, 15, 12, 50, 100, 70};
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            
        }
        for (int element : arr) {
            
            System.out.println(element + " ");
            
        }
        
    }

    
}

public class LabTask_02 {
    public static void main(String[] args) {
        SortArray s = new SortArray();
        s.start();
    }
}






