package repositorio;

import java.util.ArrayList;

import classesprimarias.Jogador;

public class RepositorioJogadores implements IRepositorioJogadores{
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	

	
	public void adicionar(Jogador j) {
		jogadores.add(j);
	}

	
	public void remover(Jogador j) {
		jogadores.remove(j);
	}

	
	public Jogador buscar(Jogador j) {
		
		if(jogadores.isEmpty())
			return null;
		for(int i = 0;i < jogadores.size();i++) {
			if(jogadores.get(i).getNome().equals(j.getNome()))
				return jogadores.get(i);
		}
		return null;
	}


	public void atualizar(Jogador j, String newName) {
		
		this.buscar(j).setNome(newName);
	}

	
}
