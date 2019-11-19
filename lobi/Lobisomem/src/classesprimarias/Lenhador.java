package classesprimarias;

public class Lenhador extends Cidadao{
	private Humano protegido = null;
	
	void proteger(Humano h)
	{
		this.setProtegido(h);
		super.setDescricao("Você é o Lenhador. Você pode escolher um jogador por noite para proteger, tomando o possível dano no lugar dele.");
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
