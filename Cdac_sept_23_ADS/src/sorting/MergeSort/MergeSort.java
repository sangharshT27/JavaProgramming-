package sorting.MergeSort;

public class MergeSort {
    
    void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        
        int i, j, k;
        i = start;
        j = mid + 1;
        k = 0;
        
        // Compare and insert the smaller element into temp
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        
        // Copy remaining elements of the first array
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        // Copy remaining elements of the second array
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        
        // Copy temp to the original array
        k = 0;
        for (i = start; i <= end; i++) {
            arr[i] = temp[k++];
        }
    }
    
    void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid); 
            mergeSort(arr, mid+1, end); 
            merge(arr, start, mid, end);
        }
    }
    
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int arr[] = {50, 10, 30, 60, 80, 20, 100};
        ms.mergeSort(arr, 0, arr.length - 1);
        
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
