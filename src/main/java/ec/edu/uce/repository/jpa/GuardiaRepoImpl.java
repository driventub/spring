package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Guardia;

@Repository
@Transactional
public class GuardiaRepoImpl implements IGuardiaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarGuardia(Guardia p) {
		this.entityManager.persist(p);
		
	}

	@Override
	public Guardia buscarGuardia(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarGuardiaPorId(Guardia p) {
		this.entityManager.merge(p);
		
	}

	@Override
	public void borrarGuardiaPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}
