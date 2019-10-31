package repositorio;

import java.util.ArrayList;

import classesprimarias.Jogador;

public class RepositorioJogadores implements IRepositorioJogadores{
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	

	@Override
	public void adicionar(Jogador j) {
		// TODO Auto-generated method stub
		jogadores.add(j);
	}

	@Override
	public void remover(Jogador j) {
		// TODO Auto-generated method stub
		jogadores.remove(j);
	}

	@Override
	public Jogador buscar(Jogador j) {
		// TODO Auto-generated method stub
		if(jogadores.isEmpty())
			return null;
		for(int i = 0;i < jogadores.size();i++) {
			if(jogadores.get(i).equals(j))
				return jogadores.get(i);
		}
		return null;
	}

	@Override
	public void atualizar(Jogador j, String newName) {
		// TODO Auto-generated method stub
		this.buscar(j).setNome(newName);
	}

	
}
