package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaService {
	void guardar(Guardia g);

	void actualizar(Guardia g);

	Guardia buscar(Integer i);

	void eliminar(Integer i);

	Guardia buscarApellido(String apellido);

	Guardia buscarApellidoTyped(String apellido);

	Guardia buscarApellidoNamed(String apellido);

	Guardia buscarApellidoNative(String apellido);

	Guardia buscarApellidoNamedNative(String apellido);

	Guardia buscarApellidoCriteriaApi(String apellido);

	Guardia buscarApellidoCriteriaApiAnd(String apellido, String edificio);

	Guardia buscarApellidoCriteriaApiOr(String apellido, String edificio);

	Guardia buscarPorLista(String apellido);
}
