package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteRepo pacienteRepo;
	
	@Override
	public void insertarPacienteNuevo(Paciente p) {
		this.pacienteRepo.insertarPaciente(p);
		
	}

	@Override
	public void borrarPacientePorId(Integer i) {
		// TODO Auto-generated method stub
		this.pacienteRepo.borrarPaciente(i);
	}

	@Override
	public void actualizarPacientePorId(Paciente p, Integer i) {
		this.pacienteRepo.actualizarPaciente(p, i);
		
	}

	@Override
	public Paciente buscarPacientePorId(Integer i) {
		return this.pacienteRepo.buscarPaciente(i);
		
	}
	
}
