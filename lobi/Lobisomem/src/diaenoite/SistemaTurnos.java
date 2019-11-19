package diaenoite;

import java.util.ArrayList;
import java.util.Scanner;

import classesprimarias.Cidadao;
import classesprimarias.Jogador;
import classesprimarias.Lobisomem;
import controladores.ControladorPessoas;
import repositorio.*;


public class SistemaTurnos {
	public boolean dia = false;
	private ArrayList<Jogador> vezDosJogadores = new ArrayList<Jogador>();
	protected ArrayList<Cidadao> cidadoes = new ArrayList<>();
	protected ArrayList<Lobisomem> lobisomens = new ArrayList<>();
	
	public ArrayList<Cidadao> getCidadoes() {
		return cidadoes;
	}


	public void dividindo()
	{
		for(int i=0;i<vezDosJogadores.size();i++)
		{
			if(!vezDosJogadores.get(i).getNomePersonagem().equals("Lobisomem"))
			{
				cidadoes.add(((Cidadao)vezDosJogadores.get(i).getPersonagem()));
			}
			else
			{
				lobisomens.add(((Lobisomem)vezDosJogadores.get(i).getPersonagem()));
			}
		}
		
	}
	


	public void setCidadoes(ArrayList<Cidadao> cidadoes) {
		this.cidadoes = cidadoes;
	}





	public ArrayList<Lobisomem> getLobisomens() {
		return lobisomens;
	}





	public void setLobisomens(ArrayList<Lobisomem> lobisomens) {
		this.lobisomens = lobisomens;
	}





	//constr
	public ArrayList<Jogador> getVezDosJogadores() {
		return vezDosJogadores;
	}

	
	
	
	
	public	void preencherJogadoresVivos(RepositorioJogadores a) {
		for(int i = 0; i < a.getJogadores().size();i++) {
			if(a.getJogadores().get(i).isJogando()) {
				vezDosJogadores.add(a.getJogadores().get(i));
				
			}
		}
		cidadoes.clear();
		lobisomens.clear();
		dividindo();
	}
	
	public void horaDaVotacaoDia() {
			for(int i = 0;i<vezDosJogadores.size();i++) {
				
				vezDosJogadores.get(i).votarDia(vezDosJogadores);
				vezDosJogadores.remove(i);
			}
	}
	public void resultadoVotacaoDia(RepositorioJogadores a) {
		int votos = -1;
		int checkEmpate = 0;
		int morte = 0;
		for(int i = 0;i<a.getJogadores().size();i++) {
			if(a.getJogadores().get(i).getVotos() > votos) {
				votos = a.getJogadores().get(i).getVotos();
			}
		}
		for(int i = 0;i<a.getJogadores().size();i++) {
			if(a.getJogadores().get(i).getVotos() == votos) {
				checkEmpate++;
				morte = i;
			}
		}
		if(checkEmpate > 1) {
			System.out.println("Voto empatado");
		}else {
			a.getJogadores().get(morte).getPersonagem().morrer();
		}
			
		
	}
	
	public void zerarVotos() {
		for(int i = 0;i<this.vezDosJogadores.size();i++) {
			if(this.vezDosJogadores.get(i).getPersonagem().isVivo()) {
				this.vezDosJogadores.get(i).resetVotos();
			}
		}
	}
	
	
	
	

	
	
	
	
	

}

