package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Cliente;
import ec.edu.uce.repository.jpa.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	public void guardar(Cliente c) {
		this.clienteRepo.insertarCliente(c);
		
	}
	
	
}
