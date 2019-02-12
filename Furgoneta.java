package vehiculos;

public class Furgoneta extends Vehiculos {
private float alto;
private float tara;
private static float  carga=500;






public Furgoneta(float carga) {
	super();
	this.setCarga(carga);
}
public Furgoneta() {
	super();
}
public float getAlto() {
	return alto;
}
public void setAlto(float alto) {
	this.alto = alto;
}
public float getTara() {
	return tara;
}
public void setTara(float tara) {
	this.tara = tara;
}

public void setDatosFurgonetas() {
	super.setDatos();
	System.out.println("Cuanto es la altura de la furgoneta? (metros)");
	alto=Util.leerFloat();
	System.out.println("Cuanta es la tara del vehiculos? (kg)");
	tara=Util.leerFloat();
}
public void getDatosFurgonetas() {
	super.getDatos();
	System.out.println("Tu furgoneta mide "+alto+" tiene una tara de"+tara+" y su carga maxima es "+carga);
	
}
public static float getCarga() {
	return carga;
}
public static void setCarga(float carga) {
	Furgoneta.carga = carga;
}
}
