package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Guardia;
import ec.edu.uce.repository.jpa.IGuardiaRepo;

@Service
public class GuardiaServiceImpl implements IGuardiaService{
	
	@Autowired
	private IGuardiaRepo guardiaRepo;
	
	@Override
	public void guardar(Guardia g) {
		this.guardiaRepo.insertarGuardia(g);
		
	}

	@Override
	public void actualizar(Guardia g) {
		this.guardiaRepo.actualizarGuardiaPorId(g);
		
	}
	
}
