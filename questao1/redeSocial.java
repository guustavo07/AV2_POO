package questao1;

import java.util.ArrayList;

public class redeSocial {
	private String dataCriacao;
	private String nomeUsuario;
	private String dataNascimento;
	private String senha;
	
	ArrayList<Publicacao> publicacoes = new ArrayList<> (); 
	
	public redeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
	}
	public void RedeSocial(String dataCriacao,String nomeUsuario,String dataNascimento, String senha) {
		
	}
	public void inserePublicacao(Publicacao publi) {
		publicacoes.add(publi);
	}
	public void imprimePublicacao() {
		
	}
}
