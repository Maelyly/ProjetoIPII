package controladores;

import java.util.Random;

import classesprimarias.Jogador;
import repositorio.RepositorioJogadores;

public class ControladorPessoas {
	private RepositorioJogadores repoPessoas;
 	private static ControladorPessoas controller;
 	public static int numLobos = 3;
 	Random random = new Random();
	
	private ControladorPessoas() {
		this.repoPessoas = new RepositorioJogadores();
	}
	
	public static ControladorPessoas getInstance() {
		if(controller == null) {
			controller = new ControladorPessoas();
		}
		return controller;
	}
	
	public RepositorioJogadores getRepoPessoas() {
		return repoPessoas;
	}

	public void cadastrar(Jogador j) {
		if(j == null) {
			return;
		}
			
		if(j.getNome() == null) {
			return;
		}
			
		int ran;
		if(numLobos > 0) {
			ran = 99;
			numLobos--;
		}
		else {
			//ran = random.nextInt(11);
			ran = 0;
		}
		j.setPersonagem(ControladorPartida.genericInstance(ran));
		this.repoPessoas.adicionar(j);
	}
	
	public void remover(Jogador j) {
		if(j == null)
			return;
		this.repoPessoas.remover(j);
	}
	
	public Jogador getJogador(int i) {
		return repoPessoas.getJogadores().get(i);
	}
    public int tam()
    {
    	return repoPessoas.getJogadores().size();
    }

	public void atualizar(Jogador j, String newName) {
		if(j == null)
			return;
		if(newName == null)
			return;
		this.repoPessoas.atualizar(j, newName);
	}
	
	public Jogador buscar(Jogador j) {
		if(j == null)
			return null;
		if(this.repoPessoas.getJogadores().isEmpty())
			return null;
		return this.repoPessoas.buscar(j);
	}
	
	

}