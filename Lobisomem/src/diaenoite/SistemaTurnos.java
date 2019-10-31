package diaenoite;

import java.util.ArrayList;

import classesprimarias.Jogador;
import repositorio.ControladorPessoas;
import repositorio.RepositorioJogadores;

public class SistemaTurnos {
	public boolean dia = false;
	public ArrayList<Jogador> getVezDosJogadores() {
		return vezDosJogadores;
	}

	private ArrayList<Jogador> vezDosJogadores = new ArrayList<Jogador>();
	
	
 public	void preencherJogadoresVivos(RepositorioJogadores a) {
		for(int i = 0; i < a.getJogadores().size();i++) {
			if(a.getJogadores().get(i).isVivo()) {
				vezDosJogadores.add(a.getJogadores().get(i));
			}
		}
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
			a.getJogadores().get(morte).morrer();
		}
			
		
	}
	
	public void zerarVotos() {
		for(int i = 0;i<this.vezDosJogadores.size();i++) {
			if(this.vezDosJogadores.get(i).isVivo()) {
				this.vezDosJogadores.get(i).resetVotos();
			}
		}
	}
	
	
	
	
	

}
