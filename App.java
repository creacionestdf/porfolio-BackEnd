package Objetos;
import java.util.*;

public class App {

  private int idApp;
  private String nombre;
  private String apellido;
  private String dni;
  private String telefono;
  private String email;
  private Direccion direccion;  

 
  private List<Experiencia> vecExp = new ArrayList<Experiencia>();
  private List<Skill> vecSkl = new ArrayList<Skill>();
  private List<Proyecto> vecPro = new ArrayList<Proyecto>();
  private List<Certificacion> vecCer = new ArrayList<Certificacion>();
  
   
   
  public App(int idApp, String nombre, String apellido, String dni, String telefono, String email, Direccion direccion) {
	super();
	this.idApp = idApp;
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.telefono = telefono;
	this.email = email;
	this.direccion = direccion;
}
  
  
  public void setIdApp (int newVar) { idApp = newVar; }
  public int getIdApp () { return idApp; }

  public void setNombre (String newVar) { nombre = newVar; }
  public String getNombre () { return nombre; }

  public void setApellido (String newVar) { apellido = newVar; }
  public String getApellido () { return apellido; }

  public void setDni (String newVar) { dni = newVar; }
  public String getDni () { return dni; }

  public void setTelefono (String newVar) { telefono = newVar; }
  public String getTelefono () { return telefono; }

  public void setEmail (String newVar) { email = newVar; }
  public String getEmail () { return email; }

  public void setDireccion(Direccion direccion) { this.direccion = direccion; }
  public Direccion getDireccion() {	return direccion; }
  
  public void setExperiencia( Experiencia ex) { vecExp.add(ex); }
  public List<Experiencia> getExperiencia() { return vecExp; }

  public void setSkill( Skill sk) { vecSkl.add(sk); }
  public List<Skill> getSkill() { return vecSkl; }
  
  public void setCertificacion( Certificacion ce) { vecCer.add(ce); }
  public List<Certificacion> getCertificacion() { return vecCer; }

  public void setProyecto( Proyecto pr) { vecPro.add(pr); }
  public List<Proyecto> getProyecto() { return vecPro; }
  
  

@Override
public String toString() {
	return " idApp:" + idApp + "\n Nombre:" + nombre + "\n apellido: " + apellido + "\n dni: " + dni + "\n telefono="
			+ telefono + "\n email=" + email + "\n" + direccion + "\n, vecExp=" + vecExp
			+ ",\n vecSkl=" + vecSkl + ", vecPro=" + vecPro + ", vecCer=" + vecCer
			+ "]";
}
  




  

}
