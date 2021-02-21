package examen.model;

public class Ejercicio4 {

	static int count = 0;
	static String[] respuesta;

	public static int contadorRepeticiones(String sTexto, String sTextoBuscado) {
		int contador = 0;
		while (sTexto.indexOf(sTextoBuscado) > -1) {
			sTexto = sTexto.substring(sTexto.indexOf(sTextoBuscado) + sTextoBuscado.length(), sTexto.length());
			contador++;
		}
		return contador;
	}

	public static void combinaciones(String primero, String cadena) {

		if (cadena.length() == 2) {

			respuesta[count] = primero + cadena.charAt(1) + "" + cadena.charAt(0);
			respuesta[count + 1] = primero + cadena.charAt(0) + "" + cadena.charAt(1);
			count = count + 2;
		} else {
			for (int i = 0; i < cadena.length(); i++) {
				combinaciones(primero + cadena.charAt(i), quitarLetra(cadena, i));
			}
		}
	}

	public static String quitarLetra(String cadena, int i) {
		if (i == 0) {
			return cadena.substring(i + 1, cadena.length());
		} else {
			if (i == cadena.length()) {
				return cadena.substring(0, cadena.length() - 1);
			} else {
				return cadena.substring(0, i) + cadena.substring(i + 1, cadena.length());
			}
		}
	}

	public static int factorial(double numero) {
		if (numero == 0)
			return 1;
		else
			return (int) (numero * factorial(numero - 1));
	}

	public static void main(String[] args) {

		//
		String sTexto = "hola, QUE BUENA Ola LAOMIR";
		// Texto que vamos a buscar
		String sTextoBuscado = "OAL";
		// Contador de ocurrencias
		int contador = 0;

		respuesta = new String[factorial(sTextoBuscado.length())];
		combinaciones("", sTextoBuscado);
		
		for (int i = 0; i < respuesta.length; i++) {
			contador += contadorRepeticiones(sTexto.toUpperCase(), respuesta[i].toUpperCase());
		}

		System.out.println(contador);

	}

}
