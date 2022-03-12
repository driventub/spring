package ec.edu.uce.interfaces.funcionales;

public class PersonaPredicateImpl implements IPersonaPredicate<String>{

	@Override
	public boolean evaluar(String arg1) {
		System.out.println("Aqui PersonaPredicateImpl");
		return false;
	}
	
}
