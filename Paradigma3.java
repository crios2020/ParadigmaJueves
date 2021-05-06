public class Paradigma3{
	public static void main(String[] args){
	
		// Obtiene el cliente
		ClienteIndividuo c = new ClienteIndividuo(“27014589”);
		
		// Obtiene la caja de ahorro del cliente
		//CajaDeAhorro cda = c.obtenerCajaDeAhorro();
		
		// Realiza el deposito
		//cda.depositar(2500);
	
		c.obtenerCajaDeAhorro().depositar(2500);
	
	}
}

class ClienteIndividuo{
	private String dni;
	private CajaDeAhorro cda;
	
	public ClienteIndividuo(String dni){
		this.dni=dni;
		cda=new CajaDeAhorro();
	}
	
	public CajaDeAhorro obtenerCajaDeAhorro(){
		return cda;
	}
}

class CajaDeAhorro{
	private double saldo;					//18000
	private double saldoDescubierto;		// 5000
	
	public void depositar(double monto) {
			saldo = saldo + monto;
	}
	
	public void debitar(double monto){		//20000
		if( saldo >= monto ) {
			saldo = saldo- monto;
			System.out.println("Extraccion ok");
		}else{
			double montoExcedente = monto - saldo;		//20000 - 18000 = 2000
			if( montoExcedente <= saldoDescubierto) {
				saldo = 0;
				saldoDescubierto = saldoDescubierto - montoExcedente;		// 5000-2000=3000
				System.out.println("Extraccion ok");
			}else{
				System.out.println("No hay fondos suficientes");
			}
		}
	}
	
}
