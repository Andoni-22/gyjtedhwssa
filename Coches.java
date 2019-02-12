package vehiculos;

public class Coches extends Vehiculos {
private boolean descapotable;

public boolean isDescapotable() {
	return descapotable;
}

public void setDescapotable(boolean descapotable) {
	this.descapotable = descapotable;
}
public void setDatosCoches() {
	char resp;
	super.setDatos();
	System.out.println("El coche es descapotable?(s-si//n-no)");
	resp=Util.leerChar();
	if(resp=='s') {
		descapotable=true;
	}else {
		descapotable=false;
	}
}
public void getDatosCoches() {
	super.getDatos();
	System.out.println("Descapotable "+descapotable);
}

}
