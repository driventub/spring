package ec.edu.uce;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.DetalleFactura;
import ec.edu.uce.modelo.jpa.Factura;
import ec.edu.uce.repository.jpa.GuardiaRepoImpl;
import ec.edu.uce.service.jpa.IFacturaService;



@SpringBootApplication
public class ProyectoSpringJpaPaApplication implements CommandLineRunner{
//	@Autowired
//	private IPacienteService pacienteService;
//	
//	
//	@Autowired
//	private IGestorCitaService gestorCitaService;
	
//	@Autowired
//	private IGuardiaService guardia;
	
	@Autowired
	private IFacturaService factura;
	
	
	private static final Logger LOG= LoggerFactory.getLogger(GuardiaRepoImpl.class);
	
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
		
//		Guardia g = new Guardia();
//		
//		g.setNombre("Consola");
//		g.setApellido("MVN");
//		g.setEdificio("Clean Install");
//		this.guardia.guardar(g);
		
//		Guardia g1 = new Guardia();
//		g1.setId(3);
//		g1.setNombre("Otro");
//		g1.setApellido("Apellido");
//		this.guardia.actualizar(g1);
		
//		this.guardia.eliminar(2)

//		Guardia gApellido = this.guardia.buscarApellido("DeTroya11");
		
		//Lo de TypedQuery
//		Guardia gApellido = this.guardia.buscarApellidoTyped("MVN");
		
//		Lo de NamedQuery
//		Guardia gApellido = this.guardia.buscarApellidoNamed("MVN");
//		
//		
//		LOG.info(gApellido.toString());
		
		
//		Taller_20
		
//		Guardia g2 = this.guardia.buscarApellidoNative("MVN");
//		LOG.info("El guardia es (SQL native) " + g2.getApellido());
		
		
//		Taller 21
//		
//		Guardia g2 = this.guardia.buscarApellidoNative("MVN");
//		LOG.info("El guardia es (SQL native named) " + g2.getApellido());
//		
//		
//		Guardia gC = this.guardia.buscarApellidoCriteriaApi("MVN");
//		LOG.info("El guardia es (SQL Criteria)" + gC.toString());
//		
//		Guardia gAnd = this.guardia.buscarApellidoCriteriaApiAnd("MVN","Clean Install");
//		LOG.info("El guardia es (SQL Criteria And)" + gAnd.toString());
//		
//		Guardia gOr = this.guardia.buscarApellidoCriteriaApiAnd("MVN","Clean Install");
//		
//		LOG.info("El guardia es (SQL Criteria Or)" + gOr.toString());	
//		
		Factura miFactura = new Factura();
		
		miFactura.setCedula("0123456789");
		LocalDateTime miFecha = LocalDateTime.of(1989,Month.AUGUST,8,12,45);
//		LocalDateTime.now() la fecha actual
		miFactura.setFecha(miFecha);
		miFactura.setNumero("011-892-8938");
		
//		Vamos a construir la lista de detalles
		
		List<DetalleFactura> detalles = new ArrayList<>();
		
//		Primer Detalle
		DetalleFactura d1 = new DetalleFactura();
		d1.setCantidad(2);
		d1.setPrecio(new BigDecimal(2.57));
		d1.setFactura(miFactura);
		
//		Segundo Detalle
		DetalleFactura d2 = new DetalleFactura();
		d2.setCantidad(10);
		d2.setPrecio(new BigDecimal("10.22"));
		d2.setFactura(miFactura);
		
		detalles.add(d1);
		detalles.add(d2);
		
		miFactura.setDetalle(detalles);
		
		this.factura.guardarFactura(miFactura);
		
		
		
	}

}
