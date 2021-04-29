public class Paradigma{
	public static void main(String[] args){
		
		//Punto de entrada.
		System.out.println("Hola Mundo!!");
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto();		//new Auto() se construye un auto
		auto1.marca="Fiat";
		auto1.modelo="Idea";
		auto1.acelerar();			// 10
		auto1.acelerar();			// 20
		auto1.acelerar();			// 30
		auto1.frenar();				// 20
		//auto1.acelerar(23);			// 43
		//auto1.acelerar(14);			// 57
		auto1.acelerar(10,true);	// 77
		//auto1.velocidad=560;
		System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.obtenerVelocidad());
	
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="Ford";
		auto2.modelo="Ka";
		for(int a=0;a<=60;a++){
			auto2.acelerar();
		}
		System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.obtenerVelocidad());
		
		System.out.println(auto2.obtenerVelocidad());

		Auto auto3 = new Auto();
	
	}
} //end class

//Declaración de clase
class Auto{
	
	//atributos
	public String marca;
	public String modelo;
	public String color;
	private int velocidad;
	Motor motor;
	
	//métodos
	public void acelerar(){								//acelerar
		//velocidad = velocidad + 10;
		//if(velocidad>100){
		//	velocidad=100;
		//}
		acelerar(10);						//llamado de método dentro de la misma clase							
	}
	
	//método con parametro de entrada
	//método sobrecargado
	private void acelerar(int kilometros){					//acelerarInt
		velocidad = velocidad + kilometros;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	public void acelerar(int kilometros, boolean nitro){	//acelerarIntBoolean
		if(nitro == true){
			acelerar(kilometros*2);			//llamado de método dentro de la misma clase
		}else{
			acelerar(kilometros);
		}
	}
	
	public void frenar(){
		velocidad = velocidad - 10;
	}
	
	//método que retorna un valor
	public int obtenerVelocidad(){
		return velocidad;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
} //end class

class Motor {
	int peso;
	int cilindrada;
	int potencia;
}

class Persona{
	String nombre;		//"Carlos"
	String apellido;	//"Rios"
	int edad;			//48
	Direccion direccion;
}

class Direccion{
	String calle;		//"Lavalle"
	int numero;			//"648"
	int piso;			//8
	String depto;		//"a"
	String ciudad;		//"CABA"
}



