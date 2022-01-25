package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaRepo {

	void insertarGuardia(Guardia p);

	Guardia buscarGuardia(Integer id);

	void actualizarGuardiaPorId(Guardia p);

	void borrarGuardiaPorId(Integer id);

	Guardia buscarGuardiaPorApellido(String apellido);

	Guardia buscarGuardiaPorApellidoLista(String apellido);

	Guardia buscarGuardiaPorApellidoType(String apellido);

	Guardia buscarGuardiaPorApellidoNamed(String apellido);

	Guardia buscarGuardiaPorApellidoNative(String apellido);
	
	

}
