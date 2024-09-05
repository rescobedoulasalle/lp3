import java.util.*;

// Java program for implementation of Insertion Sort
public class InsertionSort {
    /* Function to sort array using insertion sort */
    void sort(int arr[])
    {
        int n = arr.length;
	
	long startTime = System.nanoTime();
	System.out.println(startTime);

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    

	long endTime = System.nanoTime();
	System.out.println(endTime);
	System.out.println(endTime-startTime);
}
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        //int arr[] = { 12, 11, 13, 5, 6 };
        int arr[] = worstCase(Integer.parseInt(args[0]));

        printArray(arr);

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }

    public static int[] worstCase(int n){
	int a[] = new int[n];
    	for(int i=0; i<n; i=i+1){
		a[i]=n-i;
	}
	return a;
    }
}

/* This code is contributed by Hritik Shah. */

