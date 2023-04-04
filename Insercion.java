import java.util.Scanner;
import java.io.*;

public class Insercion {
	public static void main(String args[]) {
		System.out.println("Analisis del peor caso - Insercion");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//Editando
		//int [] A = {5,2,4,6,1,3};
		//int [] A;
		//A = worstCase(10);
		//System.out.println("Arreglo de tamaño: " + A.length);
		//printA(A);
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("c:/LP3/git02/datos.txt");
			pw = new PrintWriter(fichero);

			System.out.println("----------------------");
			for(int i = 0; i <n; i++) {
				pw.println(i+""+ sort(worstCase(i)));
			/*for(int k = 1; k <= n; k++) {
				System.out.print(k);
				System.out.print("\t");
				System.out.print(sort(worstCase(k)));
				System.out.print("\n");
				//sort(A);*/
			}
		} catch (Exception e)  {
			e.printStackTrace();
			}
		finally {
			try {
				if(null != fichero) {
					fichero.close();
				}
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		System.out.println("----------------------");
		//printA(A);
		System.out.println("Hecho por: Abel Aragon (28-03-2023)");
	}
	public static long sort(int[] Aa) {
		int key, i, j;
		long start = System.nanoTime();
		for(j=1; j<Aa.length; j++) {
			key = Aa[j];
			i = j-1;
			while(i > -1 && Aa[i] > key) {
				Aa[i+1] = Aa[i];
				i--;
			}
			Aa[i + 1] = key;
			//printA(Aa);
		}
		long end = System.nanoTime();
		//System.out.println("---------------------");
		//System.out.println("Time : " + (end - start) + "ns");
		return (end - start);
	}
	public static int[] worstCase(int n) {
		int M[] = new int[n];
		int i = 0;
		for(int t = n; t >= 1; t--) {
			M[i] = t;
			i++;
		}
		return M;
	}
	public static void printA(int[] Aa) {
		for(int i = 0; i < Aa.length; i++) {
			System.out.print(Aa[i] + " ");
		}
		System.out.println(" ");
	}

}

