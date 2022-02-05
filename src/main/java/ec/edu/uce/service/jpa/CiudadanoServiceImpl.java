package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Ciudadano;
import ec.edu.uce.repository.jpa.ICiudadanoRepo;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{
	
	@Autowired
	private ICiudadanoRepo ciudadanoRepo;
	
	@Override
	public void guardar(Ciudadano c) {
		this.ciudadanoRepo.insertarCiudadano(c);
		
	}
	
}
