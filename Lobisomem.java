package classesprimarias;

public class Lobisomem extends Humano{
	private int dano;
	private int vida;
	private int noitesSemComer;
	private boolean fome;
	private boolean revelado;

	
	public Lobisomem()
	{
		super();
		dano = 60;
		vida = 250;
		fome = false;
		noitesSemComer = 0;
		revelado = false;
		this.setClasse("Lobisomem");

	}
	
	public void fome()
	{
		if(noitesSemComer>3)
		{
			fome = true;
		}
	}
	public void seRevelar()
	{
		//if(tempo.equals("Noite")) só se revela se for noite
		revelado=true;
	}

	 public void darDano(Humano h)
	 {
		 this.fome();
		 if(fome)
		 {
			//h = aleatorio de posição da lista de jogadores;
		 }
			 if(h instanceof Cidadao)
				{
					if(!((Cidadao) h).isProtegido())
					{
						h.PerderVida(dano);
						this.setNoitesSemComer(0);
					}
					else
					{
						((Cidadao) h).setProtegido(false);
						this.setNoitesSemComer(this.getNoitesSemComer()+1);
					}

				}
				 else
				 {
					 h.PerderVida(dano);
					 this.PerderVida(dano);
					 this.setNoitesSemComer(0);
				 }
		 
	 }

	public int getNoitesSemComer() {
		return noitesSemComer;
	}

	public void setNoitesSemComer(int noitesSemComer) {
		this.noitesSemComer = noitesSemComer;
	}

	public boolean isRevelado() {
		return revelado;
	}

	public void setRevelado(boolean revelado) {
		this.revelado = revelado;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public boolean isFome() {
		return fome;
	}

	public void setFome(boolean fome) {
		this.fome = fome;
	}
	 
	 
}
