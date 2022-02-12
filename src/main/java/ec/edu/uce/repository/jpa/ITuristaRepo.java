package ec.edu.uce.repository.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.Turista;

public interface ITuristaRepo {
	List<Turista> obtenerTodosTuristas();
	void insertarTurista(Turista t);
}
