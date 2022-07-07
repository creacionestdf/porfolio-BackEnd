
package Objetos;

public class Proyecto {

  private int idProyecto;
  private String titulo;
  private String fecha;
  private String descripcion;
  private String link;
  private String logo;
  
  
  public Proyecto(int idProyecto, String titulo, String fecha, String descripcion, String link, String logo) {
	super();
	this.idProyecto = idProyecto;
	this.titulo = titulo;
	this.fecha = fecha;
	this.descripcion = descripcion;
	this.link = link;
	this.logo = logo;
}
  
  
  public void setIdProyecto (int newVar) { idProyecto = newVar; }
  public int getIdProyecto () { return idProyecto; }

  public void setTitulo (String newVar) { titulo = newVar; }
  public String getTitulo () { return titulo; }

  public void setFecha (String newVar) {    fecha = newVar; }
  public String getFecha () {   return fecha;  }

  public void setDescripcion (String newVar) {   descripcion = newVar;  }
  public String getDescripcion () {  return descripcion; }

  public void setLink (String newVar) {  link = newVar; }
  public String getLink () { return link; }

  public void setLogo (String newVar) {   logo = newVar; }
  public String getLogo () { return logo;  }



}
