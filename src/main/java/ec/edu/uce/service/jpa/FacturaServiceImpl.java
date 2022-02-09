package ec.edu.uce.service.jpa;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Factura;
import ec.edu.uce.modelo.jpa.FacturaSencilla;
import ec.edu.uce.repository.jpa.IFacturaRepo;

@Service
public class FacturaServiceImpl implements IFacturaService {
	
	@Autowired
	private IFacturaRepo facturaRepo;
	
	@Override
	public void guardarFactura(Factura f) {
		this.facturaRepo.insertarFactura(f);
		
	}

	@Override
	public List<Factura> buscarJOIN(LocalDateTime fecha) {
		
		return this.facturaRepo.buscarPorFechaJOIN(fecha);
	}

	@Override
	public List<Factura> buscarLEFT(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.facturaRepo.buscarPorFechaJOIN(fecha);
	}

	@Override
	public List<Factura> buscarWHERE(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.facturaRepo.buscarPorFechaWHERE(fecha);
	}

	@Override
	public List<Factura> buscarFETCH(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.facturaRepo.buscarPorFechaFETCH(fecha);
	}

	@Override
	public List<FacturaSencilla> buscarSencilla(LocalDateTime fecha) {
		return this.facturaRepo.buscarPorFechaSencilla(fecha);
	}
	
}
