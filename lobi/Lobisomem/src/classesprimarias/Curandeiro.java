package classesprimarias;

public class Curandeiro extends Cidadao {
	private int cura = 40;
	
	public Curandeiro()
	{
		super();
		this.setClasse("Curandeiro");
		super.setDescricao("Você é um Curandeiro. Escolha um jogador por noite para curar "+cura+" pontos de vida");
	}
	public void curarC(Cidadao h)
	{
		h.curar(cura);
	}

}
