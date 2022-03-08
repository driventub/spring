package ec.edu.uce;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.interfaces.funcionales.IPersonaFunction;
import ec.edu.uce.interfaces.funcionales.IPersonaUnaryOperator;
import ec.edu.uce.modelo.jpa.Factura;

@SpringBootApplication
public class ProyectoSpringJpaPaApplication implements CommandLineRunner {
//	@Autowired
//	private IPacienteService pacienteService;
//	
//	
//	@Autowired
//	private IGestorCitaService gestorCitaService;

//	@Autowired
//	private IGuardiaService guardia;

//	@Autowired
//	private IFacturaService factura;
//	@Autowired
//	private IDetalleFacturaService detalle;
//	
//	@Autowired 
//	private IClienteService cliente;
	

//	@Autowired
//	private ICiudadanoService ciudadano;
	
//	Unidad 3
//	@Autowired
//	private ITuristaService turista;
	
//	@Autowired
//	private ICuentaBancariaService cuenta;
	
//	@Autowired
//	private IPersonaUnaryOperator<String> unary;
	
	@Autowired 
	private IPersonaFunction<String,Factura> personaFunction;

	@Autowired 
	private IPersonaFunction<String,String> personaFunction1;
	
	@Autowired
	private IPersonaUnaryOperator<String> unaryOperator;

	private static final Logger LOG = LoggerFactory.getLogger(ProyectoSpringJpaPaApplication.class);

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
		 * Paciente p1 = new Paciente(); p1.setId(10); p1.setNombre("Canino");
		 * p1.setApellido("Loyola"); p1.setEdad(44);
		 * 
		 * Receta r1 = new Receta(); r1.setId(2); r1.setIndicaciones("guardar reposo ");
		 * r1.setMedicamentos("Paracetamol");
		 * 
		 * this.gestorCitaService.registrarNuevaConsulta(p1,r1);
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

		// Lo de TypedQuery
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
//		Factura miFactura = new Factura();
//		
//		miFactura.setCedula("0123456789");
//		LocalDateTime miFecha = LocalDateTime.of(1989,Month.AUGUST,8,12,45);
////		LocalDateTime.now() la fecha actual
//		miFactura.setFecha(miFecha);
//		miFactura.setNumero("011-892-8938");
//		
////		Vamos a construir la lista de detalles
//		
//		List<DetalleFactura> detalles = new ArrayList<>();
//		
////		Primer Detalle
//		DetalleFactura d1 = new DetalleFactura();
//		d1.setCantidad(2);
//		d1.setPrecio(new BigDecimal(2.57));
//		d1.setFactura(miFactura);
//		
////		Segundo Detalle
//		DetalleFactura d2 = new DetalleFactura();
//		d2.setCantidad(10);
//		d2.setPrecio(new BigDecimal("10.22"));
//		d2.setFactura(miFactura);
//		
//		detalles.add(d1);
//		detalles.add(d2);
//		
//		miFactura.setDetalle(detalles);
//		
//		this.factura.guardarFactura(miFactura);

//	Taller

//		Ciudadano c1 = new Ciudadano();
//		Empleado e1 = new Empleado();
//		
//		c1.setNombre("Nombre");
//		c1.setApellido("Apellido");
//		
//		e1.setIess("Nose que va aqui");
//		e1.setSalario(new BigDecimal("2.00"));
//		
//		c1.setEmpleado(e1);
//		
//		this.ciudadano.guardar(c1);

//		Taller 

//		Factura miFactura = new Factura();
//
//		miFactura.setCedula("0987654312");
//		
////		LocalDateTime.now() la fecha actual
//		LocalDateTime miFecha = LocalDateTime.now();
//		miFactura.setFecha(miFecha);
//		miFactura.setNumero("011-891-8938");
//		
//		List<DetalleFactura> detalles = new ArrayList<>();
////		
////		Primer Detalle
//		DetalleFactura d1 = new DetalleFactura();
//		d1.setCantidad(2);
//		d1.setPrecio(new BigDecimal(2.57));
//		d1.setFactura(miFactura);
//		
//		detalles.add(d1);
//		
//		miFactura.setDetalle(detalles);
//		
//		this.factura.guardarFactura(miFactura);
		
		LocalDateTime miFecha = LocalDateTime.now();
		
//		List<Factura> l= this.factura.buscarJOIN(miFecha);
		
//		LOG.info(Arrays.toString(l.toArray()));
		
//		List<Factura> l2 = this.factura.buscarLEFT(miFecha);
		
//		LOG.info(Arrays.toString(l2.toArray()));
		
//		this.factura.buscarLEFT(miFecha);
//		
//		this.factura.buscarWHERE(miFecha);
		
//		Taller 26
		
//		this.factura.buscarFETCH(miFecha);
//		
//		this.detalle.buscarProductos(new BigDecimal("0.001"), miFecha);
		
//		Cliente c = new Cliente();
//		c.setNombre("Nombre");
//		
//
//		List<String> lista = new ArrayList<>();
//		lista.add("numero1");
//		lista.add("numero 2");
//		
//		c.setTelefonos(lista);
//				
//		this.cliente.guardar(c);
//		
//		
//		List<FacturaSencilla> l1 = this.factura.buscarSencilla(miFecha);
//		
//		LOG.info("Longitud " + l1.size());
//		for(FacturaSencilla f : l1) {
//			LOG.info(f.toString());
//		}
//		
//		Unidad 3
//		
			
//		Turista t1 = new Turista();
//		t1.setNombre("Pepito");
//		t1.setValor(new BigDecimal("33.22"));
//		t1.setAbono(new BigDecimal("33.00"));
//		
//		this.turista.guardar(t1);
//		
//		Turista t2 = new Turista();
//		t2.setNombre("Pepito");
//		t2.setValor(new BigDecimal("33.22"));
//		t2.setAbono(new BigDecimal("33.00"));
//		
//		this.turista.guardar(t2);
//		
//		this.turista.obtenerTodosTuristas();
//		
		
//		Taller 32
//		CuentaBancaria c1 = new CuentaBancaria();
//		CuentaBancaria c2 = new CuentaBancaria();
//		
//		c1.setNumeroCuenta("762348");
//		c1.setClienteCedula("Pedro");
//		c1.setSaldo(new BigDecimal("2000.00"));
//		c1.setTipo("Ahorros");
//		
//		c2.setNumeroCuenta("722348");
//		c2.setClienteCedula("Juana");
//		c2.setSaldo(new BigDecimal("3000.00"));
//		c2.setTipo("Poliza");
//		
//		this.cuenta.insertar(c1);
//		this.cuenta.insertar(c2);
//		
//			
//		this.cuenta.realizarTransferencia(c1.getNumeroCuenta(),c2.getNumeroCuenta(), new BigDecimal("50.00"));
//		this.cuenta.realizarTransferenciaExpressInicial(c1.getNumeroCuenta(),c2.getNumeroCuenta(), new BigDecimal("09.33"));
//		this.cuenta.realizarTransferenciaExpressInicialNoT(c1.getNumeroCuenta(),c2.getNumeroCuenta(), new BigDecimal("2.69"));
		
//		this.cuenta.enviarMail();
//		this.cuenta.enviarMailNoT();
		
//		this.cuenta.propagacionMandatory();
//		this.cuenta.propagacionSupport();
		
//		String test = this.unaryOperator.apply("A");
		
		Factura prueba = this.personaFunction.apply("2");
		String prueba2 = this.personaFunction1.apply("2");
		
	}

}
