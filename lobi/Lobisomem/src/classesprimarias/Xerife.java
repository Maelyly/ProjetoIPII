package classesprimarias;

public class Xerife extends Cidadao{
	private Humano preso = null;
	
	public void prender(Humano h)
	{
		this.setPreso(h);
		super.setDescricao("Voc� � o Xerife. Voc� pode escolher um jogador por noite para colocar na cadeia tirando seu voto do dia.");
	}
	//a ideia seria checar se o xerife tem algu�m preso, e tirar o direito dessa pessoa de votar
	
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

