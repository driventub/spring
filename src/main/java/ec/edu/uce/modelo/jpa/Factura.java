package ec.edu.uce.modelo.jpa;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_factura")
	@SequenceGenerator(name ="seq_factura",sequenceName="seq_factura",allocationSize = 1)
	@Column(name = "fact_id")
	private Integer id;
	
	@Column(name = "fact_numero")
	private String numero;
	
	@Column(name = "fact_fecha", columnDefinition = "TIMESTAMP")
	private LocalDateTime fecha;
	
	@Column(name = "fact_cedula")
	private String cedula;
	
//	Como represento que la factura puede tener muchas detalles
	
	@OneToMany(mappedBy = "factura",cascade = CascadeType.ALL )
	private List<DetalleFactura> detalle ;
	
	
//	Set y Get
	public List<DetalleFactura> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetalleFactura> detalle) {
		this.detalle = detalle;
	}

	//	Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", cedula=" + cedula + ", detalle="
				+ detalle + "]";
	}

	
	
	
	

	
	
}
