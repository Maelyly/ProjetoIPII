package classesprimarias;

public class Xerife extends Humano{
	private Humano preso = null;
	
	@Override //o eclipse encheu o saco pra botar esse método aq :c
	void darDano(Humano h) {
		// TODO Auto-generated method stub
		
	}
	
	public void prender(Humano h)
	{
		this.setPreso(h);
	}
	//a ideia seria checar se o xerife tem alguém preso, e tirar o direito dessa pessoa de votar
	
	public void soltar()
	{
		this.setPreso(null);
	}
	//solta o meliante dps de n votar 1 vez

	public Humano getPreso() {
		return preso;
	}

	public void setPreso(Humano preso) {
		this.preso = preso;
	}
	
	
}
