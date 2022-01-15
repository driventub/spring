package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.Receta;

@Service
public class GestorCitaServiceImpl implements IGestorCitaService {
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IRecetaService recetaService;
	
	@Override
	public void registrarNuevaConsulta(Paciente p, Receta r) {
		// TODO Auto-generated method stub
		this.pacienteService.insertarPacienteNuevo(p);
		this.recetaService.guardarReceta(r);
	}

}
