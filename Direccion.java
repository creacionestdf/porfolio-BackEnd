package Objetos;

public class Direccion {

  private int idDireccion;
  private String calle;
  private int piso;
  private int numero;
  private String depto;
  private Localidad localidad;
  
   
  public Direccion(int idDireccion, String calle, int piso, int numero, String depto, Localidad localidad) {
	this.idDireccion = idDireccion;
	this.calle = calle;
	this.piso = piso;
	this.numero = numero;
	this.depto = depto;
	this.localidad = localidad;
}
  
  public void setIdDireccion (int newVar) {  idDireccion = newVar;  }
  public int getIdDireccion () {  return idDireccion;  }

  public void setCalle (String newVar) {  calle = newVar; }
  public String getCalle () {  return calle; }
  
  public void setPiso (int newVar) { piso = newVar;}
  public int getPiso () { return piso; }

  public void setNumero (int newVar) {  numero = newVar;  }
  public int getNumero () {  return numero;  }

  public void setDepto (String newVar) {  depto = newVar; }
  public String getDepto () {  return depto; }

  public void setLocalidad (Localidad newVar) {  localidad = newVar;  }
  public Localidad getLocalidad () {  return localidad; }

@Override
public String toString() {
	return "Direccion[ Calle: " + calle + ", Piso:" + piso + ", Numero:" + numero
			+ ", Depto.:" + depto +", "+ localidad + "]";
}


}
