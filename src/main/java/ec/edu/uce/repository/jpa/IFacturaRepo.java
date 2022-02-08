package ec.edu.uce.repository.jpa;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.jpa.Factura;

public interface IFacturaRepo {
	void insertarFactura(Factura f);

	List<Factura> buscarPorFechaJOIN(LocalDateTime fecha);

	List<Factura> buscarPorFechaLEFT(LocalDateTime fecha);
	List<Factura> buscarPorFechaWHERE(LocalDateTime fecha);
}
