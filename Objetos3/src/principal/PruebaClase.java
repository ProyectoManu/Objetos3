package principal;

import Clases.Cuenta;
import Clases.Persona;

public class PruebaClase {

	public static void main(String[] args) {
		
		Persona p = new Persona("Juan", 35, "30000000F");
		
		System.out.println("La persona es ");
		
		p.mostrar();
		
		Cuenta cuenta = new Cuenta(p);
		System.out.println("La cuenta es: ");
		cuenta.mostrar(); 
		
		Persona p2 = new Persona("Ana", 28, "44555666P");
		Cuenta cuenta2 = new Cuenta(p2, 2000);
		System.out.println("La cuenta 2 es: ");
		cuenta2.mostrar(); 
		
		 
		
		
		
		
		
	

	}

}
