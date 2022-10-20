public class Conta {
	private int numAgencia;
	private int numConta;
	protected double saldo;
	private String cliente;
	
	
	public Conta (int numAgencia, int numConta, double saldo){
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = saldo;
		
			
	}

	public int getNumAgencia() {
		return numAgencia;
	}


	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	public String cliente() {
		return cliente;
	}

	
	public boolean sacar(double valor){
	 if (valor<=saldo){
		 saldo = saldo - valor;
		 return true;
		 
	 }else{
		 return false;
	 }
	}
	public double depositar(double valor){
		saldo= saldo + valor;
		return saldo;
	}
	 }
