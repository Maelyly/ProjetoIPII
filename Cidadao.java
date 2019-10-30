package Primarias;

public class Cidadao extends Humano{
	private Casa casa;
	private Arma arma;
	private boolean protegido;
	
	public Casa getCasa() {
		return casa;
	}
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public boolean isProtegido() {
		return protegido;
	}
	public void setProtegido(boolean protegido) {
		this.protegido = protegido;
	}
	public Cidadao()
	{
		super();
		casa = new Casa();
		arma = new Arma();
		this.setVida(100);
		protegido = false;
		this.setNome("Cidadão comum");
		
		 
	}
	public void darDano(Humano h)
	{
	      //if(revelados==true)  se todos os lobisomens estiverem revelados
			h.PerderVida(this.getArma().getDano());
	    
	}
	
	public void seProteger()
	{
		if(casa.getEstado()>=60)
		{
			casa.destruir(60);	
			this.protegido = true;
			
			
		}
		else if(casa.getEstado()<60 && casa.getEstado()>0)
		{			
			this.PerderVida(60-casa.getEstado());
			casa.destruir(casa.getEstado());
			this.protegido = true;
			
		}
		else
		{
			this.protegido = false;
		}
	}
	public void aprimorarArma()
	{
		 
		if(arma.getMelhoria()==0)
		{
			arma.setDano(50);
			arma.setMelhoria(1);
		}
		else if(arma.getMelhoria()==1)
		{
			arma.setDano(100);
			arma.setMelhoria(2);
		}
		else 
		{
			arma.setDano(150);
			arma.setMelhoria(3);
		}
	}
	

}
