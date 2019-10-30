package teste;
import java.util.*;
import classesprimarias.*;
public class Jogo {
	
	
	public Jogador jogadorMaisVotado(List<Jogador> lista)
	{
		Jogador maisVotado = null;
		int numVotos = 0;
		for(int i = 0;i<lista.size();i++)
		{
			if(lista.get(i).getVotos()>numVotos)
			{
				numVotos = lista.get(i).getVotos();
				maisVotado = lista.get(i);
			}
			else if(lista.get(i).getVotos() == numVotos)
			{
				maisVotado = null;
			}
		}
		return maisVotado;
	}
	
	
}
