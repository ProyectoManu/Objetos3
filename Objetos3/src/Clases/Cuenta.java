package Clases;

public class Cuenta {
	
	private Persona  titular;
	private double cantidad;
	
	public Cuenta(Persona titular) {
		
		this.titular= titular;
		this.cantidad=0;
	}
	
	public Cuenta(Persona titular, double cantidad) {
		super();
		this.titular= titular;
		this.cantidad = cantidad;
}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}
 
	public double getCantidad() {
		return cantidad;
	}
	
    public void mostrar() {
		
		System.out.println("___________ ");
		System.out.println("Titular"+titular);
		titular.mostrar();
		System.out.println("Cantidad: "+cantidad);
		System.out.println("___________ ");
}
    public void ingresar (double cantidad) {
    	if (cantidad>0) {
    		this.cantidad=cantidad+cantidad;
    	}
    }
    public void retirar (double cantidad) {
    	if(cantidad>0) {
    		this.cantidad=cantidad-cantidad;
    	}
    }
}