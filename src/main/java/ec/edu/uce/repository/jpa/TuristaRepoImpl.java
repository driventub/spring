package ec.edu.uce.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Turista;

@Repository
@Transactional
public class TuristaRepoImpl implements ITuristaRepo{

	private static final Logger LOG = LoggerFactory.getLogger(TuristaRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;

	@Override
	public List<Turista> obtenerTodosTuristas() {
		TypedQuery<Turista> myTypedQuery = (TypedQuery<Turista>) this.e
				.createQuery("SELECT t FROM Turista t",Turista.class);
		
		
		return myTypedQuery.getResultList();
	}

	@Override
	public void insertarTurista(Turista t) {
		this.e.persist(t);
		
	}
	
	
	
}
