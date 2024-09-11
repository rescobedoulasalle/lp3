import java.util.*;
import java.io.*;

public class QuickSort {

	static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

     static int partition(int[] arr, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    long sort(int arr[])
    {
        int N = arr.length;
	
	long startTime = System.nanoTime();
	//System.out.println(startTime);

	quickSort(arr, 0, N - 1);

	long endTime = System.nanoTime();
	//System.out.println(endTime);
	//System.out.println(endTime-startTime);
	return (endTime-startTime);
}
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
	int N = Integer.parseInt(args[0]);

	ArrayList<int[]> casos = new ArrayList<int[]>();
     
     	for(int i=1; i<=N; i=i+1) {
		casos.add( bestCase(i) );
	}	

        InsertionSort ob = new InsertionSort();
        
	try (FileWriter fichero = new FileWriter("quick.dat"))
        {
		PrintWriter pw = new PrintWriter(fichero);

		for(int x=0; x<casos.size(); x++) {
			pw.println(ob.sort(casos.get(x)));
		}

	} catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int[] worstCase(int n){
	int a[] = new int[n];
    	for(int i=0; i<n; i=i+1){
		a[i]=n-i;
	}
	return a;
    }
    
    public static int[] bestCase(int n){
	int a[] = new int[n];
    	for(int i=0; i<n; i=i+1){
		a[i]=i;
	}
	return a;
    }
    public static int[] averageCase(int n){
	int a[] = new int[n];
    	for(int i=0; i<n/2; i=i+1){
		a[i]=i;
	}
    	for(int i=n/2; i<n; i=i+1){
		a[i]=n-i;
	}
	return a;
    }
}


