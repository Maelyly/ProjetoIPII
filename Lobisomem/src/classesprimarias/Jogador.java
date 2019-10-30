package classesprimarias;

public class Jogador {
	private String nome;
	private boolean jogando;
	private int votos;
	
	public Jogador(String nome) {
		super();
		this.nome = nome;
		this.jogando = true;
		this.votos = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isJogando() {
		return jogando;
	}
	
	public void setJogando(boolean jogando) {
		this.jogando = jogando;
	}
	
	public int getVotos() {
		return votos;
	}
	
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	public void resetVotos()
	{
		this.votos = 0;
	}
	
	
}
