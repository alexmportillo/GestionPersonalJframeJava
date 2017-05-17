package models;

public class Usuarios {
	protected String nombre;
	protected String apellido;
	protected float sueldo;
	protected String vacaciones;
	protected String sexo;
	protected String comentario;
	protected int antiguedad;
	public Usuarios(String nombre, String apellido, float sueldo, String vacaciones, String sexo, String comentario,
			int antiguedad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.vacaciones = vacaciones;
		this.sexo = sexo;
		this.comentario = comentario;
		this.antiguedad = antiguedad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public String isVacaciones() {
		return vacaciones;
	}
	public void setVacaciones(String vacaciones) {
		this.vacaciones = vacaciones;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", vacaciones="
				+ vacaciones + ", sexo=" + sexo + ", comentario=" + comentario + ", antiguedad=" + antiguedad + "]";
	}
	public String getVacaciones() {
		return vacaciones;
	}
	
}
