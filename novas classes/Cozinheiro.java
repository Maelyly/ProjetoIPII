package classesprimarias;

import java.util.List;

public class Cozinheiro extends Cidadao{
	private int acoes = 2;

	public Cozinheiro() {
		super();
		this.setClasse("Cozinheiro");
	}

	public int getAcoes() {
		return acoes;
	}

	public void setAcoes(int acoes) {
		this.acoes = acoes;
	}

	public void cozinhar(List<Jogador> jogadores)
	{
		if(acoes >= 1) {
			acoes--;
			
			for(int i = 0;i < jogadores.size();i++) {
				jogadores.get(i).getPersonagem().curar(10);
			}
		}
	}
	
	

}
