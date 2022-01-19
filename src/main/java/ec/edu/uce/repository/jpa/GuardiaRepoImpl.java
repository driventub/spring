package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		return this.entityManager.find(Guardia.class,id);
		
	}

	@Override
	public void actualizarGuardiaPorId(Guardia p) {
		this.entityManager.merge(p);
		
	}

	@Override
	public void borrarGuardiaPorId(Integer id) {
		Guardia gBorrar = this.buscarGuardia(id);
		this.entityManager.remove(gBorrar);
		
	}

	@Override
	public Guardia buscarGuardiaPorApellido(String apellido) {
//		select g from Guardia g where g.apellido=:valor
		Query miQuery = this.entityManager.createQuery("select g from Guardia g where g.apellido=:valor");
		miQuery.setParameter("valor",apellido);
		Guardia miGuardia = (Guardia) miQuery.getSingleResult();
		return miGuardia;
	}
	
}
