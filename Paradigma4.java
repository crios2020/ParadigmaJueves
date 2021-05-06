public class Paradigma4{
	public static void main(String[] args){
		System.out.println("Ultima Clase!");
		
		Auto.acelerar();
		Auto.acelerar();
		
		System.out.println("-- auto1 --");
		Auto auto1 = new Auto("Mercedes","Clase A","Blanco");
		auto1.acelerar();		//Auto.acelerar();
		System.out.println(auto1.getEstado()+", "+auto1.getVelocidad());
		
		System.out.println("-- auto2 --");
		Auto auto2 = new Auto("Ferrari","Testarosa","Rojo");
		auto2.acelerar();		//Auto.acelerar();
		System.out.println(auto1.getEstado()+", "+auto1.getVelocidad());
		System.out.println(auto2.getEstado()+", "+auto2.getVelocidad());
		
		System.out.println(Auto.getVelocidad());
	}
}

class Auto{
	private String marca;
	private String modelo;
	private String color;
	private static int velocidad;
	
	public Auto(String marca, String modelo, String color){
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	}
	
	public String getEstado(){
		return marca+", "+modelo+", "+color;
	}
	
	public static void acelerar(){
		velocidad=velocidad+10;
	}
	
	public static void frenar(){
		velocidad=velocidad-10;
	}
	
	public static int getVelocidad(){
		return velocidad;
	}
}
