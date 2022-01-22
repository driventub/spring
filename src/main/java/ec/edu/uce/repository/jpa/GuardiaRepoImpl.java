package ec.edu.uce.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Guardia;


@Repository
@Transactional
public class GuardiaRepoImpl implements IGuardiaRepo{
	
	private static final Logger LOG= LogManager.getLogger(GuardiaRepoImpl.class);
	
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
		Guardia g  = null;
		try{
		Query miQuery = this.entityManager.createQuery("select g from Guardia g where g.apellido=:valor");
		miQuery.setParameter("valor",apellido);
		
		 g= (Guardia) miQuery.getSingleResult();
			
		}catch(NoResultException e) {
			LOG.error("No existe resultado para : " + apellido, e);
		}
		
		
		return g;
	}
	
	@Override
	public Guardia buscarGuardiaPorApellidoLista(String apellido) {
//		select g from Guardia g where g.apellido=:valor
		Guardia g  = null;
		
		Query miQuery = this.entityManager.createQuery("select g from Guardia g where g.apellido=:valor");
		miQuery.setParameter("valor",apellido);
		
		 List<Guardia> lista= (List<Guardia>) miQuery.getSingleResult();
		if(!lista.isEmpty()) {
			LOG.info("Tiene  mas de un registro" + lista.size());
			return lista.get(0);
		}
		
		
		return null;
	}
	
	/**
	 * Este metodo es igual que el buscarGuardiaPorApellido nada mas con TypeQuery
	 */
	@Override
	public Guardia buscarGuardiaPorApellidoType(String apellido) {
		TypedQuery<Guardia> myTypedQuery = (TypedQuery<Guardia>) this.entityManager.createQuery("select g from Guardia g where g.apellido=:valor");
		myTypedQuery.setParameter("valor",apellido);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Guardia buscarGuardiaPorApellidoNamed(String apellido) {
		Query miQuery = this.entityManager.createNamedQuery("Guardia.buscarPorApellido");
		miQuery.setParameter("valor",apellido);
		
		return (Guardia) miQuery.getSingleResult();
	}
}
