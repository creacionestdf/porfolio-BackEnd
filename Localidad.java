package Objetos;


public class Localidad {
  
  private int idLocalidad;
  private String nombre;
  private Provincia provincia;
 
  
  
  public Localidad(int idLocalidad, String nombre, Provincia provincia) {
	this.idLocalidad = idLocalidad;
	this.nombre = nombre;
	this.provincia = provincia;
}
  
  
  public void setIdLocalidad (int newVar) {  idLocalidad = newVar; }
  public int getIdLocalidad () {  return idLocalidad; }

  public void setNombre (String newVar) {  nombre = newVar; }
  public String getNombre () { return nombre; }

  public void setProvincia (Provincia newVar) {  provincia = newVar;  }
  public Provincia getProvincia () {  return provincia; }


@Override
public String toString() {
	return "Localidad: "+nombre +", "+ provincia;
}

  

}
