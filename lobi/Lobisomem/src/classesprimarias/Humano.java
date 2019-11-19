package classesprimarias;

public abstract class Humano{
	
	private int vida;
	private boolean vivo;
	private String classe;
	private String descricao;
	

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void morrer()
	{
		if(vida<=0)
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
	
    public String toString()
    {
    	return descricao+" Você tem "+vida+" pontos de vida";
    }
}
