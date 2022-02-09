package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Cliente;

@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo{

private static final Logger LOG = LoggerFactory.getLogger(FacturaRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertarCliente(Cliente c) {
		this.e.persist(c);
		
	}

}
