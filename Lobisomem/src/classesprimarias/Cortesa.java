package classesprimarias;

public class Cortesa extends Cidadao {

	public Cortesa()
	{
		super();
		this.setClasse("Cortesã");
	}
	public void curarando(Cidadao h,int i)
	{
		h.curar(i);
		this.PerderVida(i);
	}
}
