package repositorio;

import classesprimarias.Jogador;

public class ControladorPessoas {
	private RepositorioJogadores repoPessoas;
 	private static ControladorPessoas controller;
	
	private ControladorPessoas() {
		this.repoPessoas = new RepositorioJogadores();
	}
	
	public static ControladorPessoas getInstance() {
		if(controller == null) {
			controller = new ControladorPessoas();
		}
		return controller;
	}
	
	public void cadastrar(Jogador j) {
		if(j == null)
			return;
		if(j.getNome() == null)
			return;
		this.repoPessoas.adicionar(j);
	}
	
	public void remover(Jogador j) {
		if(j == null)
			return;
		this.repoPessoas.remover(j);
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
