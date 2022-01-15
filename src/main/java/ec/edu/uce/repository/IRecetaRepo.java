package ec.edu.uce.repository;

import ec.edu.uce.modelo.Receta;

public interface IRecetaRepo {
	void insertarReceta(Receta p);
	Receta buscarReceta(Integer id);
	void actualizarReceta(Receta p, Integer i);
	void borrarReceta(Integer id);
}
