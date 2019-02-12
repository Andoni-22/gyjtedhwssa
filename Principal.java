package vehiculos;

import java.util.ArrayList;

public class Principal {

	private static Vehiculos aux;

	public static void main(String[] args) {
		int opc=0;
		
		ArrayList <Vehiculos> vehi= new ArrayList <Vehiculos>();
		do {
			System.out.println("Elige una de las siguientes opciones: ");
			System.out.println("");
			System.out.println("1- Introducir un nuevo vehículo");
			System.out.println("2- Listar solo descapotables");
			System.out.println("3- Comprobar tara");
			System.out.println("4- Modificar carga");
			System.out.println("5- Mostrar los datos de la furgoneta más antigua y más nueva");
			System.out.println("6- Mostrar la antigüedad media de los coches, de las furgonetas y de los vehículos.");
			System.out.println("7- Listado furgonetas por tara");
			System.out.println("8- Listar todos los vehículos ordenados por matrícula");
			System.out.println("9- Dar un vehiculo de baja");
			System.out.println("10.- Salir");
			opc=Util.leerInt();
			switch(opc) {
				case 1:
					introducir(vehi);
					break;
				case 2:
					listar(vehi);
					break;
				case 3:
					comprobarTara(vehi);
					break;
				case 4:
					modificarCarga(vehi);
					break;
				case 5:
					antiguaNueva(vehi);
					break;
				case 6:
					mediaAntiguedad(vehi);
					break;
				case 7:
					ordenarTara(vehi);
					break;
				case 8:
					listadoMatricula(vehi);
					break;
				case 9:
					baja(vehi);
					break;
				case 10:
					break;
			}
		}while(opc!=10);
	}

	private static void introducir(ArrayList<Vehiculos> vehi) {
		System.out.println("desea introducir un coche o una furgoneta?  c-Coche  f-Furgoneta");
		char tipo;
		tipo=Util.leerChar('c', 'f');
		
		if(tipo=='c') {
			aux=new Coches();
			aux.setDatos();
			vehi.add(aux);
		}else {
			aux.setDatos();
			aux=new Furgoneta();
			vehi.add(aux);
		}
	}

	private static void listar(ArrayList<Vehiculos> vehi) {
		for(int i=0;i<vehi.size();i++) {
			if(vehi.get(i) instanceof Coches) {
				if(((Coches)vehi.get(i)).isDescapotable()) {
					vehi.get(i).getDatos();
				}
				
			}
			
		}
		
	}

	private static void comprobarTara(ArrayList<Vehiculos> vehi) {
		
		float tara;
		tara=alumnos_arraylist.Util.leerFloat("Introduce la tara a comprobar");
		for(int i=0;i<vehi.size();i++) {
			if(((Furgoneta)vehi.get(i)).getTara()<tara){
				vehi.get(i).getDatos();
			}
		}
		
	}

	private static void modificarCarga(ArrayList<Vehiculos> vehi) {
		int nueva =Integer.MAX_VALUE;
		int vieja=Integer.MIN_VALUE;
		int indiceNueva=0,indiceVieja=0;
		for(int i=0;i<vehi.size();i++) {
			if(vehi.get(i) instanceof Furgoneta) {
				if (vehi.get(i).getAñosAntiguedad()>vieja) {
					vieja=vehi.get(i).getAñosAntiguedad();
					indiceVieja=i;
				}
			}if (vehi.get(i).getAñosAntiguedad()<nueva) {
				nueva=vehi.get(i).getAñosAntiguedad();
				indiceNueva=i;
		}
			

		}System.out.println("la furgoneta mas vieha es: ");
		vehi.get(indiceVieja).getDatos();
		
		System.out.println("la furgoneta mas nueva es: ");
		vehi.get(indiceNueva).getDatos();
	}

	private static void antiguaNueva(ArrayList<Vehiculos> vehi) {
		// TODO Auto-generated method stub
		
	}

	private static void mediaAntiguedad(ArrayList<Vehiculos> vehi) {
		// TODO Auto-generated method stub
		
	}

	private static void ordenarTara(ArrayList<Vehiculos> vehi) {
		// TODO Auto-generated method stub
		
	}

	private static void listadoMatricula(ArrayList<Vehiculos> vehi) {
		// TODO Auto-generated method stub
		
	}

	private static void baja(ArrayList<Vehiculos> vehi) {
		// TODO Auto-generated method stub
		
	}

}
