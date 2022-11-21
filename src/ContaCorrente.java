public class ContaCorrente extends Conta {
    private double chequeEspecial;
    
    private int quantiTransf;

    public ContaCorrente(int numAgencia, int numConta, double saldo, Cliente cliente, Notificacao notificacao) {
        super(numAgencia, numConta, notificacao, saldo, cliente);
        this.chequeEspecial=100;
    }
    
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor);
    }
    @Override
    public double depositar(double valor){
		
		return super.depositar(valor);
	}
    @Override
    public void transferir(Conta destinatario, double valor){
        if(quantiTransf<2){
        	saldo-=valor;
        	destinatario.depositar(valor);
        	enviaNotificacao("transferência de ", valor);
        	quantiTransf++;
        	System.out.println("Transferência efetuada com sucesso");
        }
        else{
        	double taxa = 100*0.05;
	        saldo -= (valor+ taxa);
	        destinatario.depositar(valor);
	        enviaNotificacao("Transferência", valor);
	        System.out.println("Transferência efetuada com sucesso");
        }        
    }   
}