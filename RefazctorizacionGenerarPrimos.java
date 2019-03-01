package Ejemplos;

public class RefazctorizacionGenerarPrimos {
/**
 * @param max
 * @return vector
 */
	private static boolean esPrimo[];
	private static int primos[];
	
	public static int[] generarPrimos(int max) {//static:la variable es unica en todos los objetos
		
		if (max < 2) {
			return new int [0];
		} else { 
			inicializarCandidatos (max);
			eliminarMultiplos(max);
			obtenerCandidatosNoEliminados(max);
			return primos;
		}
	}
			private static void inicializarCandidatos (int max) {
				
			
			int i;
			esPrimo = new boolean[max+1];
			esPrimo[0] = esPrimo[1] = false;
			for (i=2;i<esPrimo.length; i++)
				esPrimo[i] = true;
			}
			
			private static void eliminarMultiplos (int max) {
				int i;
				
				for (i=2;i<maxFactor();i++) {//MATH.SQRT HAYA LA RAIZ CUADRADA
					if (esPrimo[i]) {
						eliminarMultiplosDe(i);
					}
				}
			}
			//el de arriba es el codigo del antiguo metodo cribar ()
			private static int maxFactor() {
				return (int) Math.sqrt(esPrimo.length)+1;//MATH.SQRT TE SACA LA RAIZ CUADRADA
			}
			private static void eliminarMultiplosDe (int i) {
				int multiplo;
				for (multiplo=2*i;multiplo<esPrimo.length;multiplo+=i)
					esPrimo[multiplo] = false;
			}
			
			private static void obtenerCandidatosNoEliminados (int max) {
				int i,j, cuenta;
				//contar primos
				cuenta = 0;
				
				for (i=0,j=0;i<max+1; i++)
					if (esPrimo[i])
						cuenta++;
				
				//Rellenar el vector de numeros primos
				primos = new int[cuenta];
				
				for (i=0,j=0;i<max+1; i++)
					if (esPrimo[i])
						primos[j++] =i;	
			}
			//el de arriba es el codigo del antiguo metodo rellenarPrimos()
		
}
