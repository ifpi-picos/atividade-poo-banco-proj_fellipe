public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numAgencia, int numConta, double saldo, double transferencia) {
        super(numAgencia, numConta, saldo);
        
    }
    private int Rendimento;

    public int getRendimento() {
        return Rendimento;
    }

    public void setRendimento(int Rendimento) {
        this.Rendimento = Rendimento;
    }
    public double taxa(double valor){
		double taxa = 5/100 * valor;
		return taxa;
	}
    
}
