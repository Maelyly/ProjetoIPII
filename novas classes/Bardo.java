package classesprimarias;
import java.util.List;

public class Bardo extends Cidadao{
private int acoes = 2;

	public Bardo() {
		super();
		this.setClasse("Bardo");
	}

	public int getAcoes() {
		return acoes;
	}

	public void setAcoes(int acoes) {
		this.acoes = acoes;
	}

	public void tocar(List<Jogador> jogadores) //lista de cidadao não de jogadores (faz mais sentido já que o bardo só faz isso na segunda parte do jogo quando ele já sabe quem é lobo e quem n é)
	{
		if(acoes >= 1) {
			acoes--;
			
			for(int i = 0;i < jogadores.size();i++) {
				int newDano = (int) (jogadores.get(i).getPersonagem().getDano() * (1.05));
				jogadores.get(i).getPersonagem().setDano(newDano);
				
				//precisa colocar quando de dano cada classe vai dar
			}
		}
	}

}
