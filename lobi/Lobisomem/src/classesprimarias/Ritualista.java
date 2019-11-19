package classesprimarias;

public class Ritualista extends Cidadao{
	private Jogador amaldicoado;

	public Ritualista() {
		super();
		this.setClasse("Ritual�sta");
		super.setDescricao("Voc� � o Ritual�sta. Voc� escolhe uma pessoa para amaldi�oar, se voc� for morto essa pessoa leva 40 de dano.");
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
