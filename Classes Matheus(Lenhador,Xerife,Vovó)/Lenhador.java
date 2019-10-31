package classesprimarias;

public class Lenhador extends Humano{
	private Humano protegido = null;
	
	@Override //o eclipse encheu o saco pra botar esse método aq :c
	void darDano(Humano h) {
		// TODO Auto-generated method stub
		
	}
	
	void proteger(Humano h)
	{
		this.setProtegido(h);
	}
	//a ideia seria checar se o humano atacado for o "protegido", o dano for pro lenhador ao invés do protegido
	
	void ja_protegeu()
	{
		this.setProtegido(null);
	}
	//resetando dps de tomar dano

	public Humano getProtegido() {
		return protegido;
	}

	public void setProtegido(Humano protegido) {
		this.protegido = protegido;
	}
	

}
