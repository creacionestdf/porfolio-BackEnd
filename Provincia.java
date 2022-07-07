package Objetos;

public class Provincia {

  private int idProvincia;
  private String nombre;
   
  
  public Provincia(int idProvincia, String nombre) {
	this.idProvincia = idProvincia;
	this.nombre = nombre;
}
  
  
  public void setIdProvincia (int newVar) { idProvincia = newVar; }
  public int getIdProvincia () {  return idProvincia; }

  public void setNombre (String newVar) {  nombre = newVar; }
  public String getNombre () { return nombre; }


@Override
public String toString() {
	return "Provincia: " + nombre;
}

  
}
