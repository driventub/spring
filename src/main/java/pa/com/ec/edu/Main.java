package pa.com.ec.edu;

public class Main {

	public static void main(String[] args) {
		Estudiante estu1 = new Estudiante();
		System.out.println(estu1.getNombre());
		
		estu1.llenarDatos("Paulo","Aldaz");
		System.out.println(estu1.getNombre());
		
//		Estudiante estu2 = estu1;
//		System.out.println(estu2.getNombre()); // solo seran referencias
		
		Estudiante estu2 = new Estudiante();
		estu2.setNombre("Penaltinho");
		
		System.out.println("Desde aqui");
		System.out.println(estu2.getNombre());
		
		System.out.println("El nombre de mi estudiante 1");
		
		System.out.println(estu1.getNombre());
	}

}
