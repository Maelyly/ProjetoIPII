package classesprimarias;

public class Cortesa extends Cidadao {

	public Cortesa()
	{
		super();
		this.setClasse("Cortes�");
		super.setDescricao("Voc� � a Cortes�. Voc� pode escolher um jogador por noite para dormir com ele e ceder parte de sua vida para curar o valor escolhido no outro.");
	}
	public void brincarDeMedico(Humano h,int i)
	{
		h.curar(i);
		this.PerderVida(i);
	}
}
