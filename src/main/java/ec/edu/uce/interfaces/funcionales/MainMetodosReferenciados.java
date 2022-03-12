package ec.edu.uce.interfaces.funcionales;


public class MainMetodosReferenciados {
	public static void main(String[] args) {
//		Implementar por clases
		IPersonaSupplier<String> persona = new PersonaSupplierImpl();
		String mensaje = persona.get();
		System.out.println(mensaje);
		
		
//		Implementar lambdas
		IPersonaSupplier<String> persona1 = () -> "Mensaje Lambda";
		String mensaje1 = persona1.get();
		System.out.println(mensaje1);
		
		
		
//		3.
		PersonaSupplierImpl personaImpl = new PersonaSupplierImpl();
		IPersonaSupplier<String> persona2 = personaImpl::get;
		String mensaje2 = persona2.get();
		System.out.println(mensaje2);
		
//		3.1
		PersonaSupplierSinImpl personaSin = new PersonaSupplierSinImpl();
		IPersonaSupplier<String> persona3 = personaSin::get;
		IPersonaSupplier<String> persona4 = personaSin::get2;
		IPersonaSupplier<Integer> persona5 = personaSin::get3;
		
		String mensaje3 = persona3.get();
		String mensaje4 = persona4.get();
		Integer mensaje5 = persona5.get();
		System.out.println(mensaje3);
		System.out.println(mensaje4);
		System.out.println(mensaje5);
		
//		3.2
		PersonaPredicateImpl personaPredicateImpl = new PersonaPredicateImpl();
		IPersonaPredicate<String> personaBol = personaPredicateImpl::evaluar;
		
		prueba(personaBol::evaluar);
		
		Boolean men = personaBol.evaluar("mensaje");
		System.out.println(men);
		
		IPersonaPredicate<String> personaBol1 = valor1 -> valor1.contains("Z");
		Boolean respuesta = personaBol1.evaluar("ARROZ");
		System.out.println(respuesta);
		
		
	}
	
	public static boolean prueba(IPersonaPredicate<String> arg1) {
		return arg1.evaluar("Mensaje");
	}
}
