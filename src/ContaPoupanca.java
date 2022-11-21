public class ContaPoupanca extends Conta{
    private double rendimento = 0.1;
   
   public ContaPoupanca(int numAgencia, int numConta, double saldo, Cliente cliente,Notificacao notificacao) {
       super(numAgencia, numConta,notificacao, saldo,cliente);
       
    
   }
   private int Rendimento;

   public int getRendimento() {
       return Rendimento;
   }

   public void setRendimento(int Rendimento) {
       this.Rendimento = Rendimento;
   }
   @Override
   public boolean sacar(double valor){
      return super.sacar(valor);
       }
       
   @Override
   public double depositar(double valor) {
       enviaNotificacao("deposito de ", valor);
       return super.depositar(valor+(valor * rendimento));
   }
   @Override
   public void transferir(Conta destinatario, double valor){        
               double taxa = 100*0.05;
               saldo -= (valor+ taxa);
               destinatario.depositar(valor);
               enviaNotificacao("Transferência de ", valor);
               System.out.println("Transferência efetuada com sucesso");
           }
}