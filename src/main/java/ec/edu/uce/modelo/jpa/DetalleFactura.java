package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="detalle_factura")
public class DetalleFactura {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_detalle")
	@SequenceGenerator(name ="seq_detalle",sequenceName="seq_detalle",allocationSize = 1)
	@Column(name = "deta_id")
	private Integer id;
	
	@Column(name = "deta_cantidad")
	private Integer cantidad;
	
	@Column(name = "deta_precio", columnDefinition = "TIMESTAMP")
	private BigDecimal precio;
	
	@ManyToOne
	@JoinColumn(name = "fact_id")
	private Factura factura;
//	Set y Get

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + ", factura=" + factura
				+ "]";
	}

	

	

}
