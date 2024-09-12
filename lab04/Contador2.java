public class Contador2 extends Thread{

		String nombre;

		public Contador2(String x) {		
			this.nombre = x;
		}

		public void run(){
		
				for(int i=1;i<=10;i++){
					System.out.println(this.nombre + " : " + i);
				}
		
		
		}

}
