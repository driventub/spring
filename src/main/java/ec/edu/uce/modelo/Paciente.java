package ec.edu.uce.modelo;

public class Paciente {
	private Integer id,edad;
	private String nombre,apellido;
	
//	Set y Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
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
	
	@Override
	public String toString() {
		return "Paciente [id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
