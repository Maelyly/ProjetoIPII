package repositorio;

import classesprimarias.Jogador;

public interface IRepositorioJogadores {
	
	void adicionar(Jogador j);
	/**
	 * Adiciona o jogador ao Repositorio
	 * check se jogador n é nulo
	 **/
	void remover(Jogador j);
	/*
	 * Remove o jogador existente passado pelo parametro
	 */
	Jogador buscar(Jogador j);
	/*
	 * Acha o jogador e retorna o mesmo
	 */
	void atualizar(Jogador j, String newName);
	/*
	 * troca o nome do jogador pelo nome passado 
	 */

}
