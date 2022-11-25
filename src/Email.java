public class Email implements Notificacao {

	@Override
	public void enviaNotificacao(String operacao, double valor) {
		// TODO Auto-generated method stub
		System.out.println("(Email) operação concluída: " + operacao + valor);
	}

}