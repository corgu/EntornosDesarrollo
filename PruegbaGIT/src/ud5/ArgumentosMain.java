package ud5;

public class ArgumentosMain {

	public static void main(String[] args) {//String[]es un array de tipo cadena y args es su nombre
		// TODO Apéndice de método generado automáticamente
		if(args.length>0) {
			int suma=0;
			System.out.println("Hago la suma");
			suma=Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2])+Integer.parseInt(args[3])+Integer.parseInt(args[4]);
		}else {
			System.out.println("No tengo argumentos");
		}
	}

}
