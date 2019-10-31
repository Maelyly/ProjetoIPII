package classesprimarias;

public abstract class Humano{
	
	private int vida;
	private String nomeClasse;
	
	
	
	public void PerderVida(int n){
		vida = vida-n;
	}
	public void curar(int n){
		vida = vida+n;
	}
	abstract void darDano(Humano h);
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public String getNome() {
		return nomeClasse;
	}
	public void setNome(String nome) {
		this.nomeClasse = nome;
	}
	

}
