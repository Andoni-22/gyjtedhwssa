package fechas;

import java.time.LocalDate;


public class Empleado {
	String nombre;
	String apellido;
	String DNI;
	LocalDate fechaNac;
	LocalDate fechaAlta;
	int numSorteo;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public LocalDate LocalDategetFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public LocalDate LocalDategetFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public int getNumSorteo() {
		return numSorteo;
	}
	public void setNumSorteo(int numSorteo) {
		this.numSorteo = numSorteo;
	}
	
	public void setDatos(){
		System.out.println("Introduce nombre: ");
		nombre=Util.introducirCadena();
		System.out.println("Introduce apellido: ");
		apellido=Util.introducirCadena();
		System.out.println("Introduce DNI: ");
		DNI=Util.introducirCadena();
		System.out.println("Introduce fecha de alta: ");
		fechaAlta=Util.leerFecha();
		System.out.println("Introduce fecha de nacimiento");
		fechaNac=Util.leerFecha();
		System.out.println("Generando numero del sorteo...");
		numSorteo= (int) ((Math.random()*100)+1);
		System.out.println("¡Numero generado! Tu numero es: "+numSorteo+" ¡Suerte!");
	}
	
	public void getDatos() {
		System.out.println("Nombre: "+nombre+" Apellido: "+apellido+" Dni: "+DNI+" fecha de alta: "+fechaAlta+" fecha de nacimiento: "+fechaNac+" numSorteo: "+numSorteo);
	}
	public void getDatosFechaEntrada() {
		System.out.println("Nombre: "+nombre+" Apellido: "+apellido+" Dni: "+DNI+" fecha de alta: "+fechaAlta+" Edad en año de ingreso: "+(fechaAlta.getYear()-fechaNac.getYear())+" numSorteo: "+numSorteo);
	}
	
	public int getEdad() {
		int edad;
		edad=(LocalDate.now().getYear()-fechaNac.getYear());
		if(LocalDate.now().getMonthValue()<fechaNac.getMonthValue() || LocalDate.now().getMonthValue()==fechaNac.getMonthValue() && LocalDate.now().getDayOfMonth()<fechaNac.getDayOfMonth()){
			edad--;
		}
		return edad;
	}
	
	public int getAntigu() {
		int anti;
		anti=(LocalDate.now().getYear()-fechaAlta.getYear());
		if(LocalDate.now().getMonthValue()<fechaAlta.getMonthValue() || LocalDate.now().getMonthValue()==fechaAlta.getMonthValue() && LocalDate.now().getDayOfMonth()<fechaAlta.getDayOfMonth()){
		anti--;
		}
		return anti;
	}
}
