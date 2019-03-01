package Ejemplos;

	public class Main {

		public final void main(String[] args) {
			// TODO Auto-generated method stub
			int primos[];
			int limite = 125;
			primos = GenerarPrimos.generarPrimos(limite);
			
			System.out.println("Lista de números primos entre 0 y "+limite);
			for (int i=0; i<primos.length; i++) {
				System.out.println(primos[i]);
			}
		}

	}
