package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
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

	@Override
	public CuentaBancaria buscarPorNumero(String numero) {
		TypedQuery<CuentaBancaria> myTypedQuery = (TypedQuery<CuentaBancaria>) this.e
				.createQuery("select g from CuentaBancaria g where g.numeroCuenta=:valor");
		myTypedQuery.setParameter("valor", numero);

		return myTypedQuery.getSingleResult();
		
	}
	
	

}
