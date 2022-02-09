package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.DetalleFactura;
import ec.edu.uce.modelo.jpa.Factura;

@Repository
@Transactional
public class DetalleFacturaRepoImpl implements IDetalleFacturaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(DetalleFacturaRepoImpl.class);

	@PersistenceContext
	private EntityManager e;

	@Override
	public List<DetalleFactura> buscarProductos(BigDecimal valorMinimo , LocalDateTime fecha) {
		TypedQuery<DetalleFactura> myTypedQuery = (TypedQuery<DetalleFactura>) this.e
				.createQuery("SELECT f FROM DetalleFactura d LEFT JOIN f.factura f WHERE d.precio <=:valorMinimo AND WHERE f.fecha <=:fecha", DetalleFactura.class);
		myTypedQuery.setParameter("valorMinimo", valorMinimo);
		myTypedQuery.setParameter("fecha", fecha);
		
		List<DetalleFactura> l1 = myTypedQuery.getResultList();

		LOG.info("Longitud " + l1.size());
		for (DetalleFactura f : l1) {
			LOG.info(f.toString());
		}

		return l1;
	}

}
