import java.util.*;

public class InsertionSort {
    void sort(int arr[])
    {
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
	System.out.println(endTime-startTime);
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
		casos.add( worstCase(i) );
	}	

        InsertionSort ob = new InsertionSort();
        
	for(int x=0; x<casos.size(); x++) {
		ob.sort(casos.get(x));
	}

    }

    public static int[] worstCase(int n){
	int a[] = new int[n];
    	for(int i=0; i<n; i=i+1){
		a[i]=n-i;
	}
	return a;
    }
}


