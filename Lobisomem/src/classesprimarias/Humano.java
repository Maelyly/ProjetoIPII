package classesprimarias;

public abstract class Humano{
	
	private int vida;
	private boolean vivo;
	private String classe;
	private Jogador jogador;
	
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public void morrer()
	{
		vivo = false;
	}
	public void PerderVida(int n)
	{
		vida = vida-n;
	}
	public void curar(int n)
	{
		vida = vida+n;
	}
	abstract void darDano(Humano h);
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String nome) {
		this.classe = nome;
	}
	

}
