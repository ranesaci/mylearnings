package interviews;

import java.util.Arrays;

/**
* @author sachin
* @date 15-Oct-2021
*/

public class QuickSortArray {

	public static void main (String[] args) 
    {
        int arr[] = {1, 60, -10, 70, -80, 85};
        System.out.println("given Array:" +Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
      
    /* Functions for QuickSort */
      
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    static int partition(int arr[], int low, int high)
    
    {
    	System.out.println("called partition:"+Arrays.toString(arr)+ "low:high="+low+":"+high );
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
                System.out.println("j= " + j + " and pivot="+pivot);
                System.out.println("moving "+ arr[i] + " and "+arr[j]);
                System.out.println("**********8");
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
  
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
  
        return i+1;
    }
  
  
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
        	System.out.println("called sort:"+Arrays.toString(arr)+ "low:high="+low+":"+high );
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
            System.out.println("pi:"+pi);
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}




