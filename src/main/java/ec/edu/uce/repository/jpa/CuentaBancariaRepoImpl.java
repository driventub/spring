package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.ProyectoSpringJpaPaApplication;
import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.modelo.jpa.CuentaBancaria;

@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {
	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancariaRepoImpl.class);
	
	@PersistenceContext
	private EntityManager e;
	@Override
	public void insertarCuentaBancaria(CuentaBancaria p) {
		this.e.persist(p);
		
	}

	@Override
	public void actualizarCuentaBancariaPorId(CuentaBancaria p) {
		this.e.merge(p);
		
	}
	
	@Override
	public void actualizar2(CuentaBancaria p) {
		this.e.merge(p);
		try {
			throw new ArrayIndexOutOfBoundsException();
			}catch (ArrayIndexOutOfBoundsException e) {
				LOG.error("Aqui Capture el ERROR");
			}
		
	}

	@Override
	public CuentaBancaria buscarPorNumero(String numero) {
		TypedQuery<CuentaBancaria> myTypedQuery = (TypedQuery<CuentaBancaria>) this.e
				.createQuery("select g from CuentaBancaria g where g.numeroCuenta=:valor");
		myTypedQuery.setParameter("valor", numero);

		return myTypedQuery.getSingleResult();
		
	}
	
	

}
