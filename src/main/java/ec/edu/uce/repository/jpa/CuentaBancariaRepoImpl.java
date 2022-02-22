package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {
	
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

}
