package ec.edu.uce.service.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.Turista;

public interface ITuristaService {
	List<Turista> obtenerTodosTuristas();
	void guardar(Turista t);
}
