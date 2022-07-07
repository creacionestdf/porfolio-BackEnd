package Objetos;

public class Certificacion {
 

  private int idCertificacion;
  private String logo;
  private String titulo;
  private String entidad;
  private String fecha;
  private String descripcion;
  
  
  
  public Certificacion(int idCertificacion, String logo, String titulo, String entidad, String fecha, String descripcion) {
	this.idCertificacion = idCertificacion;
	this.logo = logo;
	this.titulo = titulo;
	this.entidad = entidad;
	this.fecha = fecha;
	this.descripcion = descripcion;
  }	
	
  public void setIdCertificacion (int newVar) { idCertificacion = newVar; }
  public int getIdCertificacion () { return idCertificacion; }

  public void setLogo (String newVar) { logo = newVar; }
  public String getLogo () { return logo; }

  public void setTitulo (String newVar) {  titulo = newVar; }
  public String getTitulo () { return titulo; }

  public void setEntidad (String newVar) { entidad = newVar;}
  public String getEntidad () { return entidad; }
 
  public void setFecha (String newVar) { fecha = newVar; }
  public String getFecha () {  return fecha; }

  public void setDescripcion (String newVar) { descripcion = newVar; }
  public String getDescripcion () { return descripcion; }


}
