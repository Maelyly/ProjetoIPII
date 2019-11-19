package classesprimarias;

public class Arma {
	private int dano;
	private int melhoria;
	
	public Arma()
	{
		dano = 15;
		melhoria = 0;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public int getMelhoria() {
		return melhoria;
	}
	public void setMelhoria(int melhoria) {
		this.melhoria = melhoria;
	}
	
	

}
