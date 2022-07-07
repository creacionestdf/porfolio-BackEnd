package Objetos;


public class Experiencia {

  private int idExperiencia;
  private String imagen;
  private String titulo;
  private String cargo;
  private String jornada;
  private String tiempo;
  private String descripcion;
  private Direccion direccion;
  
  
  
  public Experiencia(
		  int idExperiencia, String imagen, String titulo, String cargo, String jornada, 
		  String tiempo, String descripcion, Direccion direccion) {
	
	this.idExperiencia = idExperiencia;
	this.imagen = imagen;
	this.titulo = titulo;
	this.cargo = cargo;
	this.jornada = jornada;
	this.tiempo = tiempo;
	this.descripcion = descripcion;
	this.direccion = direccion;
}
  
  
  public void setIdExperiencia (int newVar) {  idExperiencia = newVar;}
  public int getIdExperiencia () {  return idExperiencia;  }

  public void setImagen (String newVar) { imagen = newVar;  }
  public String getImagen () {  return imagen; }

  public void setTitulo (String newVar) { titulo = newVar; }
  public String getTitulo () {  return titulo; }

  public void setCargo (String newVar) {   cargo = newVar; }
  public String getCargo () {  return cargo; }

  public void setJornada (String newVar) { jornada = newVar; }
  public String getJornada () {  return jornada; }

  
  public void setTiempo (String newVar) { tiempo = newVar; }
  public String getTiempo () {  return tiempo;  }

  public void setDescripcion (String newVar) {   descripcion = newVar; }
  public String getDescripcion () {   return descripcion; }

  public void setDireccion (Direccion newVar) {  direccion = newVar; }
  public Direccion getDireccion () { return direccion; }


}
