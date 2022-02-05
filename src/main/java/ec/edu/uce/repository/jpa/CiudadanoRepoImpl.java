package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Ciudadano;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo {
	
	
	@PersistenceContext
	private EntityManager e;
	
	
	@Override
	public void insertarCiudadano(Ciudadano c) {
		this.e.persist(c);
		
	}
	
	

}
