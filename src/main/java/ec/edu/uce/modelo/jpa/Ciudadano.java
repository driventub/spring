package ec.edu.uce.modelo.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadano")
public class Ciudadano {
	

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_ciudadano")
	@SequenceGenerator(name ="seq_ciudadano",sequenceName="seq_ciudadano",allocationSize = 1)
	@Column(name = "cida_id")
	private Integer id;
	
	@Column(name = "cida_nombre")
	private String nombre;
	
	@Column(name = "cida_apellido")
	private String apellido;
	
	
	@OneToOne(mappedBy = "ciudadano",cascade = CascadeType.ALL)
	private Empleado empleado;

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

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
	
}
