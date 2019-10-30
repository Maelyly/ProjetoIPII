package classesprimarias;

public class Curandeiro extends Cidadao {
	private int cura = 20;
	
	public Curandeiro()
	{
		super();
		this.setClasse("Curandeiro");
	}
	public void curarando(Cidadao h)
	{
		h.curar(cura);
	}

}
