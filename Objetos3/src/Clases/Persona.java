package Clases;

public class Persona {

	private String dni;
	private String nombre;
	private int edad;
	
	public Persona() {
		this.nombre="";
		this.dni="";
		edad=0;
		
	}
	public Persona(String nombre, int edad, String dni) {
		super();
		this.setDni(dni);
		this.nombre = nombre;
		edad=0;
}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if(dni.length()==9 && Character.isLetter(dni.charAt(8))) {
		this.dni = dni;
	}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad>=0) {
		this.edad = edad;
	}
	}
		
	public boolean esMayorDeEdad() {
			if (this.edad>=18) {
				return true;
				
			}
			return false;
		}
	
	
	public void mostrar() {
		
		System.out.println("Dni: "+dni);
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+ this.edad);
}
	
}