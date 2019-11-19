package classesprimarias;

public class Ritualista extends Cidadao{
	private Jogador amaldicoado;

	public Ritualista() {
		super();
		this.setClasse("Ritualísta");
		super.setDescricao("Você é o Ritualísta. Você escolhe uma pessoa para amaldiçoar, se você for morto essa pessoa leva 40 de dano.");
	}

	public Jogador getAmaldicoado() {
		return amaldicoado;
	}

	public void setAmaldicoado(Jogador amaldicoado) {
		this.amaldicoado = amaldicoado;
	}
	
	public void amaldicoar()
	{
		if(!(this.isVivo()))
		{
			amaldicoado.getPersonagem().PerderVida(40);
		}
	}
	
	
	
	

}
