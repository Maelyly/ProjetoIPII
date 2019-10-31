package classesprimarias;

public class Vovo extends Humano{
	
	private boolean atacada = false;//booleana pra saber se a vovó já foi atacada
	private Lenhador protetor = null;
	
	@Override //o eclipse encheu o saco pra botar esse método aq :c
	void darDano(Humano h) {
		// TODO Auto-generated method stub
		
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
