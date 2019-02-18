package fechas;

import java.time.LocalDate;
import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

public class Main {

	public static void main(String[] args) {
		ArrayList <Empleado> Emp=new ArrayList <Empleado>();
		int opc;
		do {
			System.out.println("1-Introducir empleado"
					+ "\n2-Listado"
					+ "\n3-Lista por apellido"
					+ "\n4-Modificar/Consultar datos por DNI"
					+ "\n5-Borrar por DNI"
					+ "\n6-Listado de edad"
					+ "\n7-Listado de edad en el añlo de entrada a la empresa"
					+ "\n8-Lista de antigüedad (descendente)"
					+ "\n9-¡Sorteo!"
					+ "\n10-Estadisticas"
					+ "\n11-Salir");
			opc=Util.leerInt(1, 11);
			
			switch(opc) {
			case 1:
				Introducir(Emp);
				break;
			case 2:
				Listado(Emp);
				break;
			case 3:
				ListadoXapellido(Emp);
				break;
			case 4:
				ConsuModi(Emp);
				break;
			case 5:
				Borrar(Emp);
				break;
			case 6:
				ListaEdad(Emp);
				break;
			case 7:
				ListaEdad2(Emp);
				break;
			case 8:
				ListaAntiguedad(Emp);
				break;
			case 9:
				Sorteo(Emp);
				break;
			case 10:
				Estadisticas(Emp);
				break;
			case 11:
				break;
				
				
				
			}
		
		
		
		}while(opc!=11);

	}

	private static void Estadisticas(ArrayList<Empleado> emp) {
		//Estadistica 1 
		int mes;
		System.out.println("Introduce mes: (num) ");
		mes=Util.leerInt(1, 12);
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).fechaNac.getMonthValue()==mes) {
				System.out.println("Nombre: "+emp.get(i).getNombre()+" Apellido: "+emp.get(i).getApellido()+" dia de mes: "+emp.get(i).fechaNac.getDayOfMonth());
			}
		}
		
		//Estadistica 2
		
		
	}

	private static void ListaAntiguedad(ArrayList<Empleado> emp) {
		Empleado aux;
		for(int i=0;i<emp.size();i++) {
			for(int j=i+1;j<emp.size();j++) {
				if(emp.get(i).getAntigu()<emp.get(j).getAntigu()) {
					aux= emp.get(i);
					emp.set(i, emp.get(j));
					emp.set(j, aux);
				}
			}
		}
		for(int i=0;i<emp.size();i++) {
			System.out.println("Nombre: "+emp.get(i).getNombre()+ "Antiguedad: "+emp.get(i).getAntigu());
		}
		
	}

	private static void Sorteo(ArrayList<Empleado> emp) {
		int numGanador=(int) (Math.random()*100)+1;
		boolean ganador=false;
		do {
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getNumSorteo()==numGanador) {
				System.out.println("El numero ganador es: "+numGanador+" y el ganadxr/xs es: "+emp.get(i).getNombre()+" "+emp.get(i).getApellido());
				ganador=true;
			}
		}
		}while(ganador!=true);
		
		
	}

	private static void ListaEdad2(ArrayList<Empleado> emp) {
		for(int i=0;i<emp.size();i++) {
			emp.get(i).getDatosFechaEntrada();
		}
		
	}

	private static void ListaEdad(ArrayList<Empleado> emp) {
		int max=0,min=100;
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getEdad()>max) {
				max=emp.get(i).getEdad();
			}if(emp.get(i).getEdad()<min) {
				min=emp.get(i).getEdad();
			}
			System.out.println("Nombre: "+emp.get(i).getApellido()+" Edad: "+emp.get(i).getEdad());
		}
		System.out.println("El mas viejo es: "+max);
		System.out.println("El mas joven es: "+min);
	}

	private static void Borrar(ArrayList<Empleado> emp) {
		String wDNI;
		int opc;
		System.out.println("Introduce DNI:");
		wDNI=Util.introducirCadena();
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).equals(wDNI)) {
				emp.get(i).getDatos();
				System.out.println("Seguro que quieres borrar? 1- Si 2-No ");
				opc=Util.leerInt(1, 2);
				if(opc==1) {
					emp.remove(i);
				}
			}
		}
	}

	private static void ConsuModi(ArrayList<Empleado> emp) {
		String wDNI,wnombre,wapellido;
		LocalDate wFechaNac,wFechaAlta;
		int wNumSorteo;
		int opc,opc2;
		System.out.println("Introduce DNI:");
		wDNI=Util.introducirCadena();
		
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).equals(wDNI)) {
				emp.get(i).getDatos();
				System.out.println("Quieres modificar? 1-Si 2-No");
				opc=Util.leerInt(1, 2);
				if(opc==1) {
					do {
					System.out.println("¿Qué quieres modificar?"
							+ "\n1-Nombre"
							+ "\n2-Apellido"
							+ "\n3-Fecha nacimiento"
							+ "\n4-Fecha de alta"
							+ "\n5-Numero de Sorteo"
							+ "\n6-Nada");
					opc2=Util.leerInt(1, 6);
					switch(opc2) {
					case 1:
						System.out.println("Nuevo nombre: ");
						wnombre=Util.introducirCadena();
						emp.get(i).setNombre(wnombre);
						System.out.println("Nombre actualizado");
						break;
					case 2:
						System.out.println("Nuevo Apellido: ");
						wapellido=Util.introducirCadena();
						emp.get(i).setApellido(wapellido);
						System.out.println("Apellido actualizado");
						break;
					case 3:
						System.out.println("Nueva fecha de nacimiento: ");
						wFechaNac=Util.leerFecha();
						emp.get(i).setFechaNac(wFechaNac);
						System.out.println("Fecha de nacimiento actualizada");
						break;
					case 4:
						System.out.println("Nueva fecha de alta: ");
						wFechaAlta=Util.leerFecha();
						emp.get(i).setFechaNac(wFechaAlta);
						System.out.println("Fecha de alta actualizada");
						break;
					case 5:
						System.out.println("Nuevo numero de sorteo?");
						wNumSorteo= (int) ((Math.random()*100)+1);
						System.out.println("Generando nuevo numero...");
						emp.get(i).setNumSorteo(wNumSorteo);
						System.out.println("Numero de sorteo actualizando");
						break;
					case 6:
						break;
					
				}
					}while(opc2!=6);
				}
			}
		}
		
	}

	private static void ListadoXapellido(ArrayList<Empleado> emp) {
		Empleado aux;

		for(int i=0;i<emp.size();i++) {
			for(int j=i+1;j<emp.size();j++) {
				if(emp.get(i).getApellido().compareToIgnoreCase(emp.get(j).getApellido())>0) {
					aux= emp.get(i);
					emp.set(i, emp.get(j));
					emp.set(j, aux);
				}
			}
		}
		Listado(emp);
		
	}

	private static void Listado(ArrayList<Empleado> emp) {
		for(int i=0;i<emp.size();i++) {
			emp.get(i).getDatos();
		}
		
	}

	private static void Introducir(ArrayList<Empleado> emp) {
		Empleado aux=new Empleado();
		int opc;
		
		System.out.println("Añadir empleado? 1-Si 2-No");
		opc=Util.leerInt(1, 2);
		if(opc==1) {
			aux.setDatos();
			emp.add(aux);
			System.out.println("Empleado introducido");
		}
	}

}
