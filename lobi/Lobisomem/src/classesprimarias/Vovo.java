package classesprimarias;

public class Vovo extends Cidadao{
	
	private boolean atacada = false;//booleana pra saber se a vov� j� foi atacada
	private Lenhador protetor = null;
	
	public Vovo() {
		super();
		this.setClasse("Vov�");
		super.setDescricao("Voc� � a Vov�. Se existir um lenhador no jogo ele ir� obrigatoriamente lhe proteger do primeiro ataque de lobo que voc� receber.");
	}
	
	
	public void primeiro_ataque(Lenhador l)
	{
		if(atacada == false)
		{
			atacada = true;
			this.protetor.proteger(this);//isso funciona????????????
		}
		
	}
	//essa � a classe q eu tenho menos certeza sobre o jeito de implementar, aceito sugest�es
}
