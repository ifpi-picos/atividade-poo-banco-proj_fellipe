public class Sms implements Notificacao {
	@Override
	public void enviaNotificacao(String operacao, double valor){
		System.out.println("(Sms) operação concluida: " + operacao + valor);
    }
}