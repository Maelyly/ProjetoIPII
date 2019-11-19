package classesprimarias;

import java.util.List;

public class Mineiro extends Cidadao{

	public Mineiro() {
		super();
		this.setClasse("Mineiro");
		super.setDescricao("Voc� � o Mineiro. Voc� tem dinamites em sua casa, prontas para explodir e tirar 30 de vida dos vizinhos pr�ximos se voc� morrer na vota��o.");
	}
	
	public void mineiroMorreu(List<Jogador> jogadores)
	{
		if(!(this.isVivo()))
		{
			for(int i = 0;i < jogadores.size();i++) {
				if(this.equals(jogadores.get(i).getPersonagem()))
				{
					jogadores.get(i - 1).getPersonagem().PerderVida(30);
					jogadores.get(i + 1).getPersonagem().PerderVida(30);
					break;
				}
			}
		}
	}
	

}
