package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.Guardia;
import ec.edu.uce.service.IGestorCitaService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.jpa.IGuardiaService;

@SpringBootApplication
public class ProyectoSpringJpaPaApplication implements CommandLineRunner{
	@Autowired
	private IPacienteService pacienteService;
	
	
	@Autowired
	private IGestorCitaService gestorCitaService;
	
	@Autowired
	private IGuardiaService guardia;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaPaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Paciente paciente1 = new Paciente();
//		paciente1.setId(3);
//		paciente1.setNombre("Tres");
//		paciente1.setApellido("Ali");
//		paciente1.setEdad(33);
		
		
		
//		this.pacienteService.insertarPacienteNuevo(paciente1);
		
//		this.pacienteService.borrarPacientePorId(3);
		
//		paciente1.setNombre("Oto");
//		this.pacienteService.actualizarPacientePorId(paciente1, 3);
//		
//		Paciente p = this.pacienteService.buscarPacientePorId(1);
//		
//		System.out.println(p);
		
		/*
		Paciente p1 = new Paciente();
		p1.setId(10);
		p1.setNombre("Canino");
		p1.setApellido("Loyola");
		p1.setEdad(44);
		
		Receta r1 = new Receta();
		r1.setId(2);
		r1.setIndicaciones("guardar reposo ");
		r1.setMedicamentos("Paracetamol");
		
		this.gestorCitaService.registrarNuevaConsulta(p1,r1);
		*/
		
		Guardia g = new Guardia();
		
		g.setNombre("Fulano");
		g.setApellido("DeTroya");
		g.setEdificio("Naciones Unidas");
		this.guardia.guardar(g);
		
		Guardia g1 = new Guardia();
		g1.setId(3);
		g1.setNombre("Otro");
		g1.setApellido("Apellido");
		this.guardia.actualizar(g1);
	}

}
