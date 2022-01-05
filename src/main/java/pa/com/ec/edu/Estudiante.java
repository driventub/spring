package pa.com.ec.edu;

public class Estudiante {
	private String nombre, apellido;
	
	public void llenarDatos(String nombre, String apelllido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//Setters Y Gettters
	
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
	
	
	
	
}
