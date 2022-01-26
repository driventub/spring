package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "guardia") // Es absolutamente necesario cuando la tabla tiene un nombre diferente
@NamedQuery(name="Guardia.buscarPorApellido", query="select g from Guardia g where g.apellido=:valor")
//@NamedQueries({
//	@NamedQuery(name="Guardia.buscarPorApellido", query="select g from Guardia g where g.apellido=:valor"),
//	@NamedQuery(name="Guardia.buscarPorApellido1", query="select g from Guardia g where g.apellido=:valor")
//})
@NamedNativeQuery(name="Guardia.buscarPorApellidoNative", query="SELECT * FROM guardia g WHERE g.apellido=:valor")
public class Guardia {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_guardia")
	@SequenceGenerator(name ="seq_guardia",sequenceName="seq_guardia",allocationSize = 1)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "edificio")
	private String edificio;

	
//	Set y Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	@Override
	public String toString() {
		return "Guardia [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edificio=" + edificio + "]";
	}
	
	
}
