public class Contador{

		String nombre;

		public Contador(String x) {		
			this.nombre = x;
		}

		public void run(){
		
				for(int i=1;i<=10;i++){
					System.out.println(this.nombre + " : " + i);
				}
		
		
		}

}
