package classesprimarias;
import java.util.List;

public class Bardo extends Cidadao{
private int acoes = 2;

	public Bardo() {
		super();
		this.setClasse("Bardo");
		super.setDescricao("Você é um Bardo. Duas vezes por partida você pode inspirar seus alidados tocando uma canção de batalha e aumentando em 5% a força de cada um");
	}

	public int getAcoes() {
		return acoes;
	}

	public void setAcoes(int acoes) {
		this.acoes = acoes;
	}

	public void tocar(List<Cidadao> cidadao)
	{
		if(acoes >= 1) {
			acoes--;
			
			for(int i = 0;i < cidadao.size();i++) {
				int newDano = (int) (cidadao.get(i).getArma().getDano() * (1.05));
				cidadao.get(i).getArma().setDano(newDano);
				
			}
		}
	}

}
