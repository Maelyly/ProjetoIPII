package classesprimarias;

import java.util.List;
import java.util.Random;

public class Chapeuzinho extends Cidadao{
	private boolean sair;

	public Chapeuzinho() {
		super();
		this.setClasse("Chapeuzinho");
	}

	public boolean isSair() {
		return sair;
	}

	public void setSair(boolean sair) {
		this.sair = sair;
	}
	
	public Jogador resNoite(List<Jogador> jogadores)
	{
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		
		if(num >= 60)
		{
			for(int i = 0;i < jogadores.size();i++) {
				if(jogadores.get(i).getPersonagem().getClasse().equalsIgnoreCase("Lobisomem"))
				{
					return jogadores.get(i);
				}
			}
		//???criar lista s� com os lobos ou revelar um lobo do rep jogadores???
		}
		else
		{
			this.PerderVida(60);
		}
		return null;
	}
	

}
