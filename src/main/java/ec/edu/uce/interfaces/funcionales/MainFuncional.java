package ec.edu.uce.interfaces.funcionales;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainFuncional {

	public static void main(String[] args) {
//		Se implementa ya no la interfaz, sino directo la clase requerida
//		Mucha de las  interfaces de JAVA, reciben interfaces funcionales
		System.out.println("SUPPLIER");
		
		IPersonaSupplier<String> supplier = new PersonaSupplier();
		System.out.println(supplier.get());
		
		IPersonaSupplier<String> supplier1 =  () -> {return "HOla Mundo adicional con las llaves";};
		System.out.println(supplier1.get());
		
		IPersonaSupplier<String> supplier2 = new PersonaSupplierChino();
		System.out.println(supplier2.get());
		
		IPersonaSupplier<String> supplierChino =  () -> "AlooL" ;
		System.out.println(supplierChino.get());
		
		ConsumoInterfacesFuncionales consumo = new ConsumoInterfacesFuncionales();
		consumo.consumirSupplier(() -> "Hey World");
		String resultado = consumo.consumirSupplier(()->"HOLA MM");
		System.out.println(resultado);
		
		Stream<String> test = Stream.generate(()->"Yep").limit(10);
		test.forEach(c -> System.out.println(c + "PRUEBA"));
		
//		Consumer
		IPersonaConsumer<Integer> consumer =  number -> System.out.println(number);
		consumer.accept(7);
		IPersonaConsumer<Integer> consumer1 =  number -> System.out.println(number.intValue()+1);
		consumer1.accept(7);
		
		consumo.consumirConsumer(number -> System.out.println(number+ 5), 2);
		
//		Consumer JAVA
		System.out.println("CONSUMER");
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6);
		listaNumeros.forEach(number -> System.out.println(number));
		
//		Predicate
		boolean resultado2 = consumo.consumirPredicate(cadena -> cadena.contains("e"), "PP");
		System.out.println(resultado2);
		
//		Predicate JAVA
		System.out.println("PREDICATE");
		
		Stream<Integer> numeroFiltrados =  listaNumeros.stream().filter(numero1 -> numero1>4);
		numeroFiltrados.forEach(num -> System.out.println(num));
		
//		Function
		System.out.println("FUNCTION");
		
		Integer i = consumo.consumirFunction(cadena -> Integer.parseInt(cadena) + 7, "2");
		System.out.println(i);
		
//		Function JAVA
		listaNumeros.stream().reduce(null);
		
		Stream<String > listaCambiada  = listaNumeros.stream().map(numeroLista -> numeroLista.toString()+ "n");
		listaCambiada.forEach(num -> System.out.println(num));
		
		
	}

}
