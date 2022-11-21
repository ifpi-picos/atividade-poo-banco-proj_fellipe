import java.util.Date;
public class Cliente {
	private String nome;
	private String cpf;
	private Date dataNasc;
	private String endereco;
	
	
	public Cliente (String nome,Date dataNasc,String cpf,String endereco){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.endereco = endereco;
        
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}
	
}