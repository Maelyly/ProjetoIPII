package classesprimarias;

public class Vovo extends Cidadao{
	
	private boolean atacada = false;//booleana pra saber se a vovó já foi atacada
	private Lenhador protetor = null;
	
	public Vovo() {
		super();
		this.setClasse("Vovó");
		super.setDescricao("Você é a Vovó. Se existir um lenhador no jogo ele irá obrigatoriamente lhe proteger do primeiro ataque de lobo que você receber.");
	}
	
	
	public void primeiro_ataque(Lenhador l)
	{
		if(atacada == false)
		{
			atacada = true;
			this.protetor.proteger(this);//isso funciona????????????
		}
		
	}
	//essa é a classe q eu tenho menos certeza sobre o jeito de implementar, aceito sugestões
}
