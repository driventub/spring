package ec.edu.uce.service.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.DetalleFactura;
import ec.edu.uce.repository.jpa.IDetalleFacturaRepo;

@Service
public class DetalleFacturaServiceImpl implements IDetalleFacturaService{
	
	@Autowired
	private IDetalleFacturaRepo detalleRepo;
	
	@Override
	public List<DetalleFactura> buscarProductos(BigDecimal valorMinimo,LocalDateTime fecha) {
		return this.detalleRepo.buscarProductos(valorMinimo, fecha);
	}

}
