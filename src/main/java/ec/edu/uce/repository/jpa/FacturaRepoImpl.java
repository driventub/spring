package ec.edu.uce.repository.jpa;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.ProyectoSpringJpaPaApplication;
import ec.edu.uce.modelo.jpa.Factura;
import ec.edu.uce.modelo.jpa.FacturaSencilla;


@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo {
	
	private static final Logger LOG = LoggerFactory.getLogger(FacturaRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertarFactura(Factura f) {
		this.e.persist(f);
		
	}

	@Override
	public List<Factura> buscarPorFechaJOIN(LocalDateTime fecha) {
		TypedQuery<Factura> myTypedQuery = (TypedQuery<Factura>) this.e
				.createQuery("SELECT f FROM Factura f JOIN f.detalle d WHERE f.fecha <=:fecha",Factura.class);
		myTypedQuery.setParameter("fecha", fecha);
		
		return myTypedQuery.getResultList();
	}
	

	@Override
	public List<Factura> buscarPorFechaLEFT(LocalDateTime fecha) {
		TypedQuery<Factura> myTypedQuery = (TypedQuery<Factura>) this.e
				.createQuery("SELECT f FROM Factura f LEFT JOIN f.detalle d WHERE f.fecha <=:fecha",Factura.class);
		myTypedQuery.setParameter("fecha", fecha);
		
		List<Factura> l1 = myTypedQuery.getResultList();
		
		LOG.info("Longitud " + l1.size());
		for(Factura f : l1) {
			LOG.info(f.toString());
		}
			
			
		return l1;

	}

	@Override
	public List<Factura> buscarPorFechaWHERE(LocalDateTime fecha) {
		TypedQuery<Factura> myTypedQuery = (TypedQuery<Factura>) this.e
//				El de la cable primaria solo con f
				.createQuery("SELECT f FROM Factura f, DetalleFactura d WHERE f = d.factura AND f.fecha <=:fecha ",Factura.class);
		myTypedQuery.setParameter("fecha", fecha);
		
		
		
		List<Factura> l1 = myTypedQuery.getResultList();
		
		LOG.info("Longitud " + l1.size());
		for(Factura f : l1) {
			LOG.info(f.toString());
		}
			
			
		return l1;
	}

	@Override
	public List<Factura> buscarPorFechaFETCH(LocalDateTime fecha) {
		TypedQuery<Factura> myTypedQuery = (TypedQuery<Factura>) this.e
				.createQuery("SELECT f FROM Factura f JOIN FETCH f.detalle d WHERE f.fecha <=:fecha",Factura.class);
		myTypedQuery.setParameter("fecha", fecha);
		
		List<Factura> l1 = myTypedQuery.getResultList();
		
		LOG.info("Longitud " + l1.size());
		for(Factura f : l1) {
			LOG.info(f.toString());
		}
			
			
		return l1;
	}

	@Override
	public List<FacturaSencilla> buscarPorFechaSencilla(LocalDateTime fecha) {
		
//		public FacturaSencilla(String numero, String cedula) {
//		super();
//		this.numero = numero;
//		this.cedula = cedula;
//	}	Poner el paquete completo
		TypedQuery<FacturaSencilla> myTypedQuery = (TypedQuery<FacturaSencilla>) this.e
				.createQuery("SELECT NEW  ec.edu.uce.modelo.jpa.FacturaSencilla(f.numero, f.cedula) FROM Factura f JOIN f.detalle d WHERE f.fecha <=:fecha",FacturaSencilla.class);
		myTypedQuery.setParameter("fecha", fecha);
		
		return myTypedQuery.getResultList();
	}

}
