package Objetos;

public class Skill {

  private int idSkill;
  private String nombre;
  private int valor;
  
  
  public Skill(int idSkill, String nombre, int valor) {
	this.idSkill = idSkill;
	this.nombre = nombre;
	this.valor = valor;
  }


  public void setIdSkill (int newVar) { idSkill = newVar; }
  public int getIdSkill () { return idSkill; }


  public void setNombre (String newVar) { nombre = newVar; }
  public String getNombre () { return nombre; }

  
  public void setValor (int newVar) {valor = newVar; }
  public int getValor () { return valor; }


@Override
public String toString() {
	return "\n Skill [idSkill=" + idSkill + ", nombre=" + nombre + ", valor=" + valor + "]";
}

  
}
