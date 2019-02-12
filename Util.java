



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Util 
{
	public static void main(String[] args) {

	}

	public static String introducirCadena() 
	{
		String cadena = "";
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		try {
			cadena = teclado.readLine();
		} catch (IOException er) {
			System.out.println("error al introducir datos");
			System.exit(0);
		}
		return cadena;
	}
	
	public static String introducirCadena(String mensaje) 
	{
		String cadena = "";
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		System.out.println(mensaje);
		try {
			cadena = teclado.readLine();
		} catch (IOException er) {
			System.out.println("error al introducir datos");
			System.exit(0);
		}
		return cadena;
	}
	
	
	public static char leerChar()
	{
		char letra;
		String frase;
		do {
			frase=introducirCadena();
			if (frase.length()!=1) {
				System.out.println("Error, introduce un unico caracter: ");
			}
		}while (frase.length()!=1);
		letra=frase.charAt(0);
		
		return letra;
	}
	
	public static char leerChar(String mensaje)
	{
		char letra;
		String frase;
		do {
			System.out.println(mensaje);
			frase=introducirCadena();
			if (frase.length()!=1) {
				System.out.println("Error, introduce un unico caracter: ");
			}
		}while (frase.length()!=1);
		letra=frase.charAt(0);
		
		return letra;
	}
	
	public static char leerChar (char x, char y)
	{

		char letra;
		String frase;
		do{
			do {
				frase=introducirCadena();
				if (frase.length()!=1) {
					System.out.println("Error, introduce un unico caracter: ");
				}
			}while (frase.length()!=1);
			letra=frase.charAt(0);
			if(!(letra == x || letra==y))
			{
				System.out.println("Error Caracter no Valido");
			}
		}while (!(letra == x || letra==y));
		return letra;		
	}
	
	
	
	
	public static int leerInt(){
		int num=0;
		boolean ok=true;
		
		do{
			ok=true;
			try{
				num=Integer.parseInt(introducirCadena());
			}
			catch(NumberFormatException e){
				ok=false;	
				System.out.println("Error al introducir un número");
			}
		}while (!ok);
		return num;
	}
	
	public static int leerInt(String mensaje){
		int num=0;
		boolean ok=true;
		
		do{
			ok=true;
			System.out.println(mensaje);
			try{
				num=Integer.parseInt(introducirCadena());
			}
			catch(NumberFormatException e){
				ok=false;	
				System.out.println("Error al introducir un número");
			}
		}while (!ok);
		return num;
	}

	public static int leerInt(int x, int y){
		boolean ok;
		int num = 0;
		
		do{
		     ok=true;
		     try{
		    	 num=Integer.parseInt(introducirCadena());
		     }
		     catch(NumberFormatException e){
		         ok=false;
		         System.out.println("Error al introducir un número");
		     }
		     if(num<x||num>y){
		         ok=false;
		         System.out.println("Error numero fuera de rango");
		     }
		 }while (!ok);
		return num;
	}
	
	public static float leerFloat(){
		float num=0;
		boolean ok=true;
		
		do{
			ok=true;
			try{
				num=Float.parseFloat(introducirCadena());
			}
			catch(NumberFormatException e){
				ok=false;	
				System.out.println("Error al introducir un número");
			}
		}while (!ok);
		return num;
	}
	
	public static float leerFloat(String mensaje){
		float num=0;
		boolean ok=true;
		
		do{
			ok=true;
			System.out.println(mensaje);
			try{
				num=Float.parseFloat(introducirCadena());
			}
			catch(NumberFormatException e){
				ok=false;	
				System.out.println("Error al introducir un número");
			}
		}while (!ok);
		return num;
	}
	
	public static float leerFloat(float x, float y){
		boolean ok;
		float num = 0;
		
		do{
		     ok=true;
		     try{
		    	 num=Float.parseFloat(introducirCadena());
		     }
		     catch(NumberFormatException e){
		         ok=false;
		         System.out.println("Error al introducir un número");
		     }
		     if(num<x||num>y){
		         ok=false;
		         System.out.println("Error numero fuera de rango");
		     }
		 }while (!ok);
		return num;
	}
	public static double leerDouble(){
		double num=0;
		boolean ok=true;
		
		do{
			ok=true;
			try{
				num=Double.parseDouble(introducirCadena());
			}
			catch(NumberFormatException e){
				ok=false;	
				System.out.println("Error al introducir un número");
			}
		}while (!ok);
		return num;
	}
	
	public static double leerDouble(double x, double y){
		boolean ok;
		double num = 0;
		
		do{
		     ok=true;
		     try{
		    	 num=Double.parseDouble(introducirCadena());
		     }
		     catch(NumberFormatException e){
		         ok=false;
		         System.out.println("Error al introducir un número");
		     }
		     if(num<x||num>y){
		         ok=false;
		         System.out.println("Error numero fuera de rango");
		     }
		 }while (!ok);
		return num;
	}
	
	public static boolean leerBoolean(String arg0){
		boolean ok=true,vuelta = false;
		
		do{
			ok=true;
			try{
				vuelta=Boolean.parseBoolean(arg0);
			}
			catch(Exception e){
				ok=false;	
				System.out.println("Error al introducir boolean");
			}
		}while (!ok);
		return vuelta;
	}
	
    public static LocalDate leerFecha() {
	String fechaAux;
	LocalDate fechaNac = LocalDate.now();
	boolean error;
	DateTimeFormatter formateador=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	do{
	  error=false;
	  fechaAux=Util.introducirCadena();
	  try{		
	   	fechaNac=LocalDate.parse(fechaAux, formateador);
	  } catch(DateTimeParseException e){
	   	error=true;
		System.out.println("Error,Introduce fecha con formato dd/mm/aaaa: ");
	  }
	}while (error);
	return fechaNac;
	}
    
    
	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  for (contador=2;contador<numero;contador++){
			  if (numero%contador==0){
				  primo=false;
				  break;
			  }
		  }
		  return primo;
	}
	
	
	public static char leerCharArray(char caracteres[]) {
		int i=0;
		boolean error = false;
		String letra;
		char aux = 0;
		do {
			error = false;
			letra = introducirCadena();
			if (letra.length() != 1) {
				System.out.println("Error, introduce un caracter: ");
				error = true;
			} else {
				aux = letra.charAt(0);
				for (i=0; i<caracteres.length; i++) {
					if (Character.toUpperCase(caracteres[i]) == Character.toUpperCase(aux)) {
						break;
					}
				}
				if (i == caracteres.length) {
					error = true;
					System.out.println("Error, el caracter introducido no es valido/ Introduce de nuevo: ");
				}
			}
		} while (error);
		return aux;
	}
	
	
	public static String fechatostring(LocalDate fecha) {
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String wfecha;
		
		wfecha = fecha.format(formateador);
		
		return wfecha;
	}
	
	public static int numAleatorio(int x, int y) {
		int z, aux;
		
		if(x > y) {
			aux = x;
			x = y;
			y = aux;
		}
		
		z = (int)(x + Math.random() * (y - x + 1));
		
		return z;
	}

}

