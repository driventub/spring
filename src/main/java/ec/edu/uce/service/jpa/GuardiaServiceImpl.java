package ec.edu.uce.service.jpa;

import java.util.List;

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

	@Override
	public Guardia buscar(Integer i) {
		
		return this.guardiaRepo.buscarGuardia(i);
	}

	@Override
	public void eliminar(Integer i) {
		this.guardiaRepo.borrarGuardiaPorId(i);
		
	}

	@Override
	public Guardia buscarApellido(String apellido) {

		return this.guardiaRepo.buscarGuardiaPorApellido(apellido);
	}

	@Override
	public Guardia buscarPorLista(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoLista(apellido);
	}

	@Override
	public Guardia buscarApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoType(apellido);
	}

	@Override
	public Guardia buscarApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoNamed(apellido);
	}

	@Override
	public Guardia buscarApellidoNative(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoNative(apellido);
	}

	@Override
	public Guardia buscarApellidoNamedNative(String apellido) {
		return this.guardiaRepo.buscarGuardiaPorApellidoNamedNative(apellido);
	}

	@Override
	public Guardia buscarApellidoCriteriaApi(String apellido) {
		return this.guardiaRepo.buscarGuardiaPorApellidoCriteriaApi(apellido);
	}

	@Override
	public Guardia buscarApellidoCriteriaApiAnd(String apellido, String edificio) {
		return this.guardiaRepo.buscarGuardiaPorApellidoCriteriaApiAnd(apellido,edificio);
	}

	@Override
	public Guardia buscarApellidoCriteriaApiOr(String apellido, String edificio) {
		return this.guardiaRepo.buscarGuardiaPorApellidoCriteriaApiOr(apellido,edificio);
	}
	
}
