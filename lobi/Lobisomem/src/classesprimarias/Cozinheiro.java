package classesprimarias;

import java.util.List;

public class Cozinheiro extends Cidadao{
	private int acoes = 2;

	public Cozinheiro() {
		super();
		this.setClasse("Cozinheiro");
		super.setDescricao("Voc� � o Cozinheiro. Duas vezes por partida pode fazer uma refei��o para deixar todos os cidad�o mais saud�veis curando 10 pontos de vida.");
	}

	public int getAcoes() {
		return acoes;
	}

	public void setAcoes(int acoes) {
		this.acoes = acoes;
	}

	public void cozinhar(List<Cidadao> jogadores)
	{
		if(acoes >= 1) {
			acoes--;
			
			for(int i = 0;i < jogadores.size();i++) {
				jogadores.get(i).curar(10);
			}
		}
	}
	
	

}
