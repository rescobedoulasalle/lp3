import java.util.*;
import java.io.*;

public class InsertionSort {

    long sort(int arr[]) {
        int n = arr.length;
	
		long startTime = System.nanoTime();
		//System.out.println(startTime);

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    	long endTime = System.nanoTime();
		//System.out.println(endTime);
		//System.out.println(endTime-startTime);
		return (endTime-startTime);
	}

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);

		ArrayList<int[]> casos = new ArrayList<int[]>();
     
     	for(int i=1; i<=N; i=i+1) {
			casos.add( bestCase(i) );
		}	

        InsertionSort ob = new InsertionSort();
        
		try (FileWriter fichero = new FileWriter("insertion.dat")) {
			PrintWriter pw = new PrintWriter(fichero);

			for(int x=0; x<casos.size(); x++) {
				pw.println(ob.sort(casos.get(x)));
			}

		} catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int[] worstCase(int n) {
		int a[] = new int[n];
    	for(int i=0; i<n; i=i+1) {
			a[i]=n-i;
		}
		return a;
    }
    
    public static int[] bestCase(int n) {
		int a[] = new int[n];
    	for(int i=0; i<n; i=i+1) {
			a[i]=i;
		}
		return a;
    }
    
    public static int[] averageCase(int n) {
		int a[] = new int[n];
    	for(int i=0; i<n/2; i=i+1) {
			a[i]=i;
		}
    	for(int i=n/2; i<n; i=i+1) {
			a[i]=n-i;
		}
		return a;
    }

}
