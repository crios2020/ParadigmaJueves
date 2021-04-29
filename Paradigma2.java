public class Paradigma2{
	public static void main(String[] main){
		//Punto de entrada de proyecto.
		System.out.println("Hola Mundo!");
				
		//Objetos Simulados | Objetos Mocks
		System.out.println("-- cuenta1 --");
		Cuenta cuenta1=new Cuenta(1,"arg$");
		cuenta1.depositar(50000);
		cuenta1.depositar(40000);
		cuenta1.debitar(12000);
		System.out.println(cuenta1.getEstado());
		
		System.out.println("-- cliente1 --");
		Cliente cliente1=new Cliente(1,"Juan",2,"arg$");
		cliente1.getCuenta().depositar(60000);
		cliente1.getCuenta().debitar(13000);
		System.out.println(cliente1.getEstado());
		
		System.out.println("-- matrimonio Ana y Mario");
		Cliente ana=new Cliente(2,"Ana",new Cuenta(3,"arg$"));
		ana.getCuenta().depositar(120000);
		Cliente mario=new Cliente(3,"Mario",ana.getCuenta());
		mario.getCuenta().debitar(30000);
		
		System.out.println(ana.getEstado());
		System.out.println(mario.getEstado());
		
	}
}

class Cuenta{
	private int nro;
	private String moneda;
	private double saldo;
	
	//método constructor
	public Cuenta(int nro, String moneda){
		this.nro = nro;
		this.moneda = moneda;
		this.saldo = 0;
	}
	
	public void depositar(float monto){
		saldo=saldo+monto;
	}
	
	public void debitar(float monto){
		if(saldo>=monto){
			saldo=saldo-monto;
		}else{
			System.out.println("No hay fondos suficientes!");
		}
	}
	
	public String getEstado(){
		return nro+", "+moneda+", "+saldo;
	}
	
}

class Cliente{
	private int nro;
	private String nombre;
	private Cuenta cuenta;
	
	//Un cliente se puede crear sin cuenta, un cliente puede no tener cuenta.
	//public Cuenta(int nro, String nombre){
	//	this.nro=nro;
	//	this.nombre=nombre;
	//}
	
	//Un cliente siempre tiene una cuenta, un cliente se crea con una cuenta obligatoriamente.
	//Una cuenta sea compartida por más de un cliente.
	public Cliente(int nro, String nombre, Cuenta cuenta){
		this.nro=nro;
		this.nombre=nombre;
		this.cuenta=cuenta;
	}
	
	//Un cliente siempre tiene una cuenta, un cliente se crea con una cuenta obligatoriamente.
	//Una cuenta solo pertenece a un cliente.
	public Cliente(int nro, String nombre, int nroCuenta, String moneda){
		this.nro=nro;
		this.nombre=nombre;
		this.cuenta=new Cuenta(nroCuenta, moneda);
	}
	
	public Cuenta getCuenta(){
		return cuenta;
	}
	
	public String getEstado(){
		return nro+", "+nombre+", "+cuenta.getEstado();
	}
	
}

