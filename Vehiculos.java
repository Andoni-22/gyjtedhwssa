package vehiculos;

public class Vehiculos {
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected final static String color="negro";
	protected int añosAntiguedad;
	protected float alquilerPrecio;
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAñosAntiguedad() {
		return añosAntiguedad;
	}
	public void setAñosAntiguedad(int añosAntiguedad) {
		this.añosAntiguedad = añosAntiguedad;
	}
	public float getAlquilerPrecio() {
		return alquilerPrecio;
	}
	public void setAlquilerPrecio(float alquilerPrecio) {
		this.alquilerPrecio = alquilerPrecio;
	}
	public static String getColor() {
		return color;
	}
	public void setDatos() {
		System.out.println("Introduce la matricula de tu vehiculo: ");
		matricula=Util.introducirCadena();
		System.out.println("De que marca es?");
		marca=Util.introducirCadena();
		System.out.println("Cual es el modelo? ");
		modelo=Util.introducirCadena();
		System.out.println("Cuantos años tiene el vehiculo?");
		añosAntiguedad=Util.leerInt();
		System.out.println("Cuanto es el alquiler por dia? ");
		alquilerPrecio=Util.leerFloat();
	}
	public void getDatos() {
		System.out.println("El coche con matricula "+matricula+" de "+marca+" es el modelo "+modelo+" de color "+color+" con "+añosAntiguedad+" años de antiguedad tiene un precio de "+alquilerPrecio+" por dia" );
		}
}
