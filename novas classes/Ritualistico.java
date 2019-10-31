package classesprimarias;

public class Ritualistico extends Cidadao{
	private Jogador amaldicoado;

	public Ritualistico() {
		super();
		this.setClasse("Ritualistico");
	}

	public Jogador getAmaldicoado() {
		return amaldicoado;
	}

	public void setAmaldicoado(Jogador amaldicoado) {
		this.amaldicoado = amaldicoado;
	}
	
	public void amaldicoar()//acho que não tá certo, pois teria que checar se o ritualista morreu toda vez e não tá fazendo isso
	{
		if(!(this.isVivo()))
		{
			amaldicoado.getPersonagem().PerderVida(40);
		}
	}
	
	
	
	

}
