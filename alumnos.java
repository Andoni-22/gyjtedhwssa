public class alumnos {
	private String nombre;
	private String apellido;
	private String nif;
	private int anio;
	private Float nota;
	
	
	public void setDatos() {
		nombre=Util.introducirCadena("Introduce nombre: ");
		apellido=Util.introducirCadena("Introduce apellido: ");
		nif=Util.introducirCadena("Introduce nif: ");
		System.out.println("introduce nota: ");
		nota=Util.leerFloat();
		System.out.println("Introduce año: ");
		anio=Util.leerInt();
	}
	
	public void getDatos() {
		System.out.println(nombre+" "+apellido+" con nif: "+nif+" tiene una nota de: "+nota+" en el año: "+anio);
	}
	
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
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Float getNota() {
		return nota;
	}
	public void setNota(Float nota) {
		this.nota = nota;
	}
}
