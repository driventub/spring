package ec.edu.uce.service.jpa;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.jpa.Factura;
import ec.edu.uce.modelo.jpa.FacturaSencilla;

public interface IFacturaService {
	void guardarFactura(Factura f);
	List<Factura> buscarJOIN(LocalDateTime fecha);

	List<Factura> buscarLEFT(LocalDateTime fecha);
	
	List<Factura> buscarWHERE(LocalDateTime feCha);
	
	List<Factura> buscarFETCH(LocalDateTime fecha);
	
	
	List<FacturaSencilla> buscarSencilla(LocalDateTime fecha);
	
	

}
