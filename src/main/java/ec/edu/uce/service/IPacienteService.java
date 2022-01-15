package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {
	void insertarPacienteNuevo(Paciente p);
	void borrarPacientePorId(Integer i);
	void actualizarPacientePorId(Paciente p,Integer i);
	Paciente buscarPacientePorId(Integer i);
}
