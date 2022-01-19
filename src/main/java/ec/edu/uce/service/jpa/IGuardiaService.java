package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaService {
	void guardar(Guardia g);
	void actualizar(Guardia g);
	Guardia buscar(Integer i);
	void eliminar(Integer i);
	Guardia buscarApellido(String apellido);
}
