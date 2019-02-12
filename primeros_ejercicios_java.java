import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primeros_ejercicios_java {
/*
	public static void ejer1(){
		
		for(int i=0; i<11; i++) {
			if(i%2==0) {
				System.out.println(i+" par" );
				
			}else{if(i==5) {
				System.out.println("MITAD");
			}
			else {
				System.out.println(i);
			}
			
		}
		}
	
	*/
	/*
	public static void ejer2() {
		for(int i=0;i<10;i++) {
		
			if(i%2!=0) {
				System.out.println(i);
			}
		
		}

}*/
	/*	public static void ejer3a(int min,int max){
		
			
			
			for(int x=min;x<=max;x++) {
				
				System.out.println(x);
			}
			
			}
		*/
	/*
	public static void ejer3b(int min,int max){
		
		int x=min;
		while(x<=max) {
		
		System.out.println(x);
		x++;
		}
		
		
		}
		*/
	/*
public static void ejer3c(int min,int max){
		
		int x=min;
		
		do {
			System.out.println(x);
			x++;
		}
		while(x<=max) ;
	
		}
		*/
		
		/*
		public static void ejer4(int dia) {
			
			switch(dia) {
			
			case 1:
				System.out.println("HOY ES LUNES");
				break;
				
			case 2:
				System.out.println("HOY ES MARTES");
				break;	
				
			case 3:
				System.out.println("HOY ES MIERCOLES");
				break;
				
			case 4:
				System.out.println("HOY ES JUEVES");
				break;	
				
			case 5:
				System.out.println("HOY ES VIERNES");
				break;
				
			case 6:
				System.out.println("HOY ES SABADO");
				break;	
				
			case 7:
				System.out.println("HOY ES DOMINGO");
				break;	
				
			default:
				System.out.println("No es un dia de la semana");
				break;
			}
			
			
		}
		*/
	/*
	public static void ejer5() {
		int j=0,y,max,min,suma=0,multiplicacion=1,x;
		String nombre;
		
	
		
		while(j<3) {
			System.out.println("introduce opcion 1-3");
			x=leerInt();
			j++;
		switch (x) {
		case 1:
			System.out.println("Introduce un numero");
			y=leerInt();
			
			if(y%2==0) {
				System.out.println("El numero es par");
				
			}
		
		else {
			
			System.out.println("El numero es impar");
			}
			break;
			
		case 2:
			System.out.println("introduce tu nombre");
			nombre=introducirCadena();
			if(nombre.contains(" ")) {
				System.out.println("C");
			}else {
				System.out.println("NC "+ nombre.toUpperCase());
			}
			break;	
		
		case 3:
				System.out.println("Introduce limite inferior y superior");
				max=leerInt();
				min=leerInt();
				for(int i=min; i<=max;i++ ) {
					System.out.println(i);
					if(i%2==0) {
						suma=i+suma;
					}else
						multiplicacion=multiplicacion*i;
				}
				System.out.println("la suma es "+suma);
				System.out.println("la multiplicacion es "+multiplicacion);
				break;
		}
		}
	}
	



*/
	/*
	public static void ejer6() {
		
		int x;
		System.out.println("introduce un numero");
		x=leerInt();
		if(x%2==0) {
			System.out.println("ES PAR");
			
		}else System.out.println("NO ES PAR");
		
	}
	*/
	/*
	public static void ejer7() {
		int cantidad=0;
		float precio=0, precioU=0;
		String producto;
		System.out.println("introduce la cantidad");
		cantidad=leerInt();
		System.out.println("introduce el producto");
		producto=introducirCadena();
		System.out.println("Introduce el precio unitario");
		precioU=leerFloat();
		
		if(cantidad>100) {
			precio=cantidad*precioU;
			System.out.println("El cantidad es: "+cantidad);
			System.out.println("El producto es: "+producto);
			System.out.println("el precio unitario es: "+precioU);
			System.out.println("el descuento es: 40%");
			precio=precio-(precio*(40/100));
			System.out.println("el precio final es: "+precio);
			
		}else if(cantidad<100 && cantidad>25) {
			
			precio=cantidad*precioU;
			System.out.println("El cantidad es: "+cantidad);
			System.out.println("El producto es: "+producto);
			System.out.println("el precio unitario es: "+precioU);
			System.out.println("el descuento es: 20%");
			precio=precio-(precio*(20/100));
			System.out.println("el precio final es: "+precio);
			
		}else if(cantidad<25 && cantidad>10) {
			
			precio=cantidad*precioU;
			System.out.println("El cantidad es: "+cantidad);
			System.out.println("El producto es: "+producto);
			System.out.println("el precio unitario es: "+precioU);
			System.out.println("el descuento es: 10%");
			precio=precio-(precio*(10/100));
			System.out.println("el precio final es: "+precio);
			System.out.println(cantidad);
			
		}else if(cantidad<10){
			precio=cantidad*precioU;
			System.out.println("El cantidad es: "+cantidad);
			System.out.println("El producto es: "+producto);
			System.out.println("el precio unitario es: "+precioU);
			System.out.println("no hay descuento");
			System.out.println("el precio final es: "+precio);
		}
		
			
			
		}
	*/
	/*
	public static boolean ejer2_1() {
		int num;
		boolean x=false;
		System.out.println("Introduce un numero: ");
		num=leerInt();
		if(num%5==0) {
			x=true;
		}
	return x;}
*/
	/*
	public static boolean ejer2_2(int num,boolean par) {
	
		if(num%2==0) {
			par=true;
		}
		
	return par;}
	
	public static void ejer2_3() {
		int min,max;
		boolean par=false;
		System.out.println("Introduce limite inferior");
		min=leerInt();
		System.out.println("Introducir limite superior");
		max=leerInt();
		if(min<max) {
			for(int i=min;i<=max;i++ ) {
				par=ejer2_2(i,par);
				if(par==true && i%2==0) {
					System.out.println(i);
				}
					
				
			}
		}else 
			for(int i=max;i<=min;i++) {
				par=ejer2_2(i,par);
				if(par==true && i%2==0) {
					System.out.println(i);
			}
	}
	}
	*/
	/*
	public static int ejer2_4() {
		
		int max,min,mitad;
		
		System.out.println("introduce limite inferior");
		min=leerInt();
		System.out.println("introduce limite superior");
		max=leerInt();
		
		mitad=(min+max)/2;
		
		System.out.println(mitad);
		return mitad;
		
	}
	*/
	/*
	
	public static float ejer2_5(int cantidad, float precio, int descuento, int iva) {
		float total=0;
		float precioT=0;
		
		precioT=cantidad*precio*(descuento/100);
		total=precioT-(precioT*(iva/100));
		
		
		
		return total;
		
}
	*/
	/*
	public static void ejer2_6(int cant,String letra) {
		System.out.println(cant/1000+"k"+letra);
		cant=cant-(cant/1000)*1000;
		System.out.println(cant+letra);
	}
	*/
	/*
	public static void ejer2_7() {
		int suma = 0, num=1;
		do {
			System.out.println("introduce numero");
			num=leerInt();
			if(num>0){
			suma=suma+num;
			}if(num<0) {
				System.out.println(num +" es un numero negativo");
			}
		}while(num!=0);
		System.out.println(suma);
	}
	*/
	
	/*
	public static void ejer2_8(int num1,int num2, char opc) {
		int suma,resta,multiplicacion,eleva;
		Boolean par=false;
		switch (opc) {
		case 'A':
			suma=num1+num2;
			System.out.println(suma);
			break;
			
		case 'B':	
			resta=num1-num2;
			System.out.println(resta);
			break;
			
		case 'C':
			multiplicacion=num1*num2;
			System.out.println(multiplicacion);
			break;
			
		case 'D':
			eleva= (int) Math.pow(num1, num2);
			System.out.println(eleva);
			break;
		case 'E':
			if(num1%2==0 || num2%2==0) {
				par=true;
				System.out.println(par);
			}else System.out.println("no hay pares");
			
			break;
			
		case 'F':	
			if((num1%2 !=0 && num1%3 !=0 && num1%5 !=0 && num1%7 !=0 && num1%11 !=0)  ) { 
				System.out.println(num1+" Es primo");
			}if(num2%2 !=0 && num2%3 !=0 && num2%5 !=0 && num2%7 !=0 && num2%11 !=0){
				System.out.println(num2+" Es primo");
			}
			
			else System.out.println("No hay primos");
			break;
			
		case 'G':
			if(num1%num2==0) {
				System.out.println(num1+" Es multiplo de "+num2);
			}else if(num2%num1==0) {
				System.out.println(num2 +" Es multiplo de "+num1);
			}
			
			break;
		}
	}
	*/
	/*
	public static void ejer2_9(int num,int max) {
		long result;
		
		for(int i=0; i<=max;i++) {
			result= (int) Math.pow(num, i);
			System.out.println(num+ "elevado a "+i+"  "+result);
		}
		
	}
	*/
	/*
	public static void ejer2_10(int num1, int num2, int resp) {
		int result;
		result=num1+num2;
		if(resp==result) {
			System.out.println("Que bien ¡Sabes sumar!");
		}else if(result!=resp) {
			System.out.println("Aun no sabes sumar????");
		}
		
	}
	*/
	/*
	public static int ejer2_11() {
    char respuesta = 0;
		int nota,media = 0,i=0;
		do {
			i++;
			System.out.println("Introduce notas");
			nota=leerInt(1,10);
			media=media+nota;
			System.out.println("Desea seguir introduciendo notas?");
			respuesta=leerChar();
		}while(respuesta=='s');
		
		media=media/i;
	return media;}
	*/
	/*
	public static int ejer2_12(int num) {
		int nota=0,media=0,i;
		for(i=0; i<num;i++) {
			
		
			System.out.println("Introduce notas");
			nota=leerInt(1,10);
			media=media+nota;
			
		}
		
		media=media/i;
		return media;
	}
	*/
	/*
	public static void ejer3_1(String abc) {
		
		String abecedario;
		
	
		abecedario="a b c d e f g h i j k l m n ñ o p q r s t u v w x y z";
	
			if(abc.equals("min")) {
				System.out.println(abecedario);
			}else if(abc.equals("may")) {
				System.out.println(abecedario.toUpperCase());
			}
	
	}
	*/
	/*
	public static void ejer3_2() {
		System.out.println("El valor maximo de byte es : "+ Byte.MAX_VALUE);
		System.out.println("el valor minimo de byte es : "+Byte.MIN_VALUE);
		System.out.println("El valor maximo de short es : "+ Short.MAX_VALUE);
		System.out.println("el valor minimo de short es : "+Short.MIN_VALUE);
		System.out.println("El valor maximo de int es : "+ Integer.MAX_VALUE);
		System.out.println("el valor minimo de int es : "+Integer.MIN_VALUE);
		System.out.println("El valor maximo de long es : "+ Long.MAX_VALUE);
		System.out.println("el valor minimo de long es : "+Long.MIN_VALUE);
		System.out.println("El valor maximo de float es : "+ Float.MAX_VALUE);
		System.out.println("el valor minimo de float es : "+Float.MIN_VALUE);
		System.out.println("El valor maximo de double es : "+ Double.MAX_VALUE);
		System.out.println("el valor minimo de double es : "+Double.MIN_VALUE);
	}
	*/
	
/*

	public static int ejer3_3(String clave){
		String num;
		int media = 0;
		int	i = 0;
		int azul = 0;
		do {
			System.out.println("Introduce nº ("+clave+") para finalizacr): ");
			num=Util.introducirCadena();
		if(clave.compareTo(num)!=0) {
			i++;
			azul=Integer.valueOf(num);
			media=azul+media;
		}
		
		}while(clave.compareTo(num)!=0);
		
		media=media/i;
		
		return media;		
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ejer1();
		
		//ejer2();
		
	//	ejer3a(5,15);
	//	ejer3b(5,15);
    //  ejer3c(5,15);
		
	/*ejer4 	
		int x;
		System.out.println("introduce un dia de la semana 1 - 7");
		x=leerInt();
		ejer4(x);
		
		*/
						
		//ejer5();
		//ejer6();
		//ejer7();
		//ejer2_1();
		//ejer2_2();
		//ejer2_3();
		//ejer2_4();
		//ejer2_5();
	/*	
		int cant;
		String letra;
		System.out.println("introduce una letra: g-Gramos m-Metros l-Litros");
		letra=introducirCadena();
		System.out.println("introduce una cantidad");
		cant=leerInt();
		ejer2_6(cant,letra);
		*/
		//ejer2_7();
	/*	
		int num1,num2;
		char letra;
		System.out.println("introduce dos numeros");
		num1=leerInt();
		num2=leerInt();
		System.out.println("Introduce una letra");
		letra=leerChar();
		
		ejer2_8(num1,num2,letra);
		*/
		/*
		int num, max;
		
		System.out.println("introduce un numero a elevar");
		num=leerInt();
		
		System.out.println("introduce hasta que numero lo quieres elevar");
		max=leerInt();
		
		ejer2_9(num,max);
		*/
		
		/*
		int num1,num2,resp;
		System.out.println("introduce un numero");
		num1=leerInt();
		System.out.println("Introduce otro numero");
		num2=leerInt();
		System.out.println("introduce la suma de los dos numeros");
		resp=leerInt();
		ejer2_10(num1,num2,resp);
		*/
		/*
		int media ;
		media=ejer2_11();
		
		System.out.println("La media es: "+media);
		*/
		/*
		int num, media;
		System.out.println("introduce el numero de alumnos");
		num=leerInt();
		media=ejer2_12(num);
		System.out.println(media);
	*/
		
		/*
		String abc = "0";
		
		do {
			System.out.println("Introduce min para minusculas o may para mayusculas");
			abc=introducirCadena();
			ejer3_1(abc);
		}while(abc.compareTo("min")!=0 && abc.compareTo("may")!=0);
	*/
		
		
		//ejer3_2();
		/*
		String miau;
		int media =0;
		System.out.println("Introduce la palabrade finalizacion");
		miau=introducirCadena();
		media=ejer3_3(miau);
		System.out.println(media);
		*/
	}




static String introducirCadena(){String cadena="";
InputStreamReader entrada =new InputStreamReader(System.in);
BufferedReader teclado= new BufferedReader(entrada);
try{
cadena=teclado.readLine(); 
}
catch(IOException er){System.out.println("error al introducir datos");
System.exit(0);
}
return cadena;}

public static char leerChar() {
	char letra;
	String frase;
	do {
		frase =introducirCadena();
		if (frase.length()!=1) {
			System.out.println("Error introduce un unico caracter");
			
		}
				
	}while(frase.length()!=1);
	letra=frase.charAt(0);
	return letra;
}


public static int leerInt() {
	int num=0;
	short correcto=0;
	
	do {
		correcto=1;
		try {
			num=Integer.parseInt(introducirCadena());
		}catch(Exception e) {
			System.out.println("ERROR INTRODUCE OTRA VEZ");
			correcto=0;
		}
		
		
	}while(correcto==0);
	
	return num;
}
	
	
public static float leerFloat() {
	float num=0;
	short correcto=0;
	
	do {
		correcto=1;
		try {
			num=Float.parseFloat(introducirCadena());
		}catch(Exception e) {
			System.out.println("ERROR INTRODUCE OTRA VEZ");
			correcto=0;
		}
		
		
	}while(correcto==0);
	
	return num;
}

public static int leerInt(int x, int y) {
	boolean ok;
	int num=0;
	
	do {
		ok=true;
		try {
			num=Integer.parseInt(introducirCadena());
		}catch(NumberFormatException e) {
			ok=false;
			System.out.println("ERROR INTRODUCE OTRA VEZ");
		
		}
		if(num<x||num>y) {
			ok=false;
			System.out.println("Error numero fuera de rango");
		}
		
	}while(!ok);
	
	return num;
}
	

}