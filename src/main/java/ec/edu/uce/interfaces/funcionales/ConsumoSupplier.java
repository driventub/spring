package ec.edu.uce.interfaces.funcionales;

public class ConsumoSupplier {
	public String consumirInterfaz(IPersonaSupplier<String> funcion) {
		return funcion.get();
	}
}
