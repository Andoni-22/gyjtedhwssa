public class principal {

	public static void main(String[] args) {
		alumnos alum[]=new alumnos[100];
		int cont=0,opc = 0;
		
		do {
			System.out.println("1.\r\n" +
					"Introducir alumno \r\n" + 
					"2.\r\n" + 
					"Listar alumnos \r\n" + 
					"3.\r\n" + 
					"Ordenarlos por apellido \r\n" + 
					"4.\r\n" + 
					"Borrar todos los alumnos \r\n" + 
					"5.\r\n" + 
					"Borrar un alumno por su nif \r\n" + 
					"6.\r\n" + 
					"Modificar los datos de un alumno (menos su nif) \r\n" + 
					"7.\r\n" + 
					"Listado de los que su apellido contenga un grupo de caracteres \r\n" + 
					"8.\r\n" + 
					"Listado ordenado por nota \r\n" + 
					"9.\r\n" + 
					"Salir");
			
			opc=Util.leerInt(1,9);
			switch(opc) {
			case 1:
				cont=alta(alum,cont);
				break;
				
			case 2:
				listado(alum,cont);
				break;
				
			case 3:
				ordenarApellido(alum,cont);
				break;
			
			case 4:
				cont=0;
				break;
				
			case 5:
				cont=borrado(alum,cont);
				break;
				
			case 6:
				modificar(alum,cont);
				
			case 7:
				listadoApellido(alum,cont);
				break;
				
			case 8: 
				listadoNota(alum,cont);
				break;
			}
			
			
			
		}while(opc!=9);
		System.out.println("Adios");
	}
	
	private static int alta(alumnos[] alum, int cont) {
		if (cont<=99) {
		
			alum[cont]=new alumnos();
			alum[cont].setDatos();
			cont++;
		}else {
			System.out.println("no queda espacio");
		}
		
		return cont;
	}

	private static void listado(alumnos[] alum, int cont) {
		
		for(int i=0;i<cont;i++) {
			alum[i].getDatos();
		}
	}

	private static void ordenarApellido(alumnos[] alum, int cont) {
	
		for(int i=0;i<cont;i++) {
			for (int j=i+1; j<cont; j++) {
				if(alum[i].getApellido().compareToIgnoreCase(alum[j].getApellido())>0){
					alumnos aux=alum[i];
					alum[i]=alum[j];
					alum[j]=aux;
			}
			}
		}
	}

	private static int borrado(alumnos[] alum, int cont) {
		
		char respuesta;
		String nif;
		int indice;
		
		System.out.println("Introduce el nif del alumno a borrar: ");
		nif=Util.introducirCadena();
		indice=buscarAlumno(alum,nif,cont);
		if (indice!=-1) {
			
			System.out.println("Esta seguro de que desea borrar este alumno? s=si n=no ");
			respuesta=Util.leerChar('s', 'n');
				if(respuesta=='n') {
					System.out.println("El alumno no ha sido borrado");
					
				}else {
					for(int j=indice; j<(cont-1);j++) {
						alum[j]=alum[j+1];
						
					}
					cont--;
					System.out.println("Alumno borrado correctamente");
				}
		}
		
		return cont;
	}

	private static int buscarAlumno(alumnos[] alum, String nif,int cont) {
		int i=-1;
		for (int j=0;j<cont;j++) {
			if (alum[j].getNif().equalsIgnoreCase(nif)) {
				System.out.println("Alumno encontrado");
				alum[j].getDatos();
				i=j;
				break;
				
			}
		}
		if (i==-1) {
			System.out.println("error el alumno no esta en la lista");
		}
		
		return i;}

	private static void modificar(alumnos[] alum, int cont) {
		int opc;
		char respuesta;
		System.out.println("Introduce el nif del alumno a borrar: ");
		String nif=Util.introducirCadena();
		int indice = buscarAlumno(alum,nif,cont);
		if(indice!=-1) {
			
			
			do {
				System.out.println("que desea modificar? 1-Nombre \n 2-Apellido \n 3-Nota \n 4-año\n 5-volver \n Introduzca opcion");
				opc=Util.leerInt(1, 5);
				
				switch(opc) {
				case 1:
					alum[indice].setNombre(Util.introducirCadena("introduce nuevo nombre"));
					break;
					
				case 2:
					alum[indice].setApellido(Util.introducirCadena("introduce nuevo apellido"));
					break;
				
				case 3:
					alum[indice].setNota(Util.leerFloat("introduce nueva nota"));
					break;
					
				case 4:
					alum[indice].setAnio(Util.leerInt("Introduce nuevo año"));
					break;
					
				case 5:
					break;
				}
				System.out.println("Desea seguir modificando s-Si n-No");
				respuesta=Util.leerChar('s','n');
				
			}while(respuesta=='s');
		}else {
			
		}
		
	}

	private static void listadoApellido(alumnos[] alum, int cont) {
		System.out.println("Introduce un fragmento de apellido");
		String grupo;
		grupo=Util.introducirCadena();
		
		for(int i=0;i<cont;i++) {
			for (int j=i+1; j<cont; j++) {
		if(alum[i].getApellido().compareToIgnoreCase(alum[j].getApellido())>0 ){
			alumnos aux=alum[i];
			alum[i]=alum[j];
			alum[j]=aux;
	}
			}
			
			for(i=0;i<cont;i++) {
				if(alum[i].getApellido().contains(grupo)) {
					System.out.println(alum[i].getApellido());
				}else 
					System.out.println("no se ha encontrado ningun apellido con ese grupo de caracteres");
			}
		
		}
	}

	private static void listadoNota(alumnos[] alum, int cont) {
		
		
	}

	


}

