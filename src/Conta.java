public class Conta {
	private int numAgencia;
	private int numConta;
	protected double saldo;
	private Cliente cliente;
	private Notificacao notificacao;
	
	public Conta (int numAgencia, int numConta, Notificacao notificacao,double saldo, Cliente cliente){
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = saldo;
		this.setCliente(cliente);
		this.notificacao = notificacao;	
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Notificacao getNotificacao() {
		return notificacao;
	}
	public void setNotificacao(Notificacao notificacao) {
		this.notificacao = notificacao;
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
	
	
	public boolean sacar(double valor){
	 if (valor<=saldo){
		 saldo = saldo - valor;
		 
		 System.out.println("saque efetuado com sucesso");
		enviaNotificacao("saque", valor);
		 return true;
		 
	 }else{
		 System.out.println("Impossivel fazer a transferencia");
		 return false;
	 }
	}
	public double depositar(double valor){
		saldo= saldo + valor;
		enviaNotificacao("deposito de ", valor);
		return saldo;

	}
	
protected void enviaNotificacao(String operacao, double valor) {
		// TODO Auto-generated method stub
		notificacao.enviaNotificacao(operacao, valor);
		
	}
public void transferir(Conta destinatario, double valor){
		this.sacar(valor);
		destinatario.depositar(valor);
		System.out.println("Transferência efetuada com sucesso");
	}
}