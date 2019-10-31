package classesprimarias;

import java.util.ArrayList;
import java.util.Scanner;

import diaenoite.SistemaTurnos;
import repositorio.RepositorioJogadores;

public class Jogador {
	private String nome;
	private boolean jogando;
	private int votos;
	private Humano personagem;
	private boolean vivo;
	
	public Jogador(String nome, Humano h) {
		super();
		this.nome = nome;
		this.jogando = true;
		this.votos = 0;
		this.setPersonagem(h);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isJogando() {
		return jogando;
	}
	
	public void setJogando(boolean jogando) {
		this.jogando = jogando;
	}
	
	public int getVotos() {
		return votos;
	}
	
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	public void resetVotos()
	{
		this.votos = 0;
	}
	public void foiVotado() {
		this.votos += 1;
	}

	public Humano getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Humano personagem) {
		this.personagem = personagem;
	}
	public void votarDia(ArrayList<Jogador> vezDosJogadores) {
		 System.out.println("Hora de vc votar, escolha entre: ");
		 Scanner scan = new Scanner(System.in);
		 vezDosJogadores.get(scan.nextInt()).foiVotado();
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public void morrer() {
		this.vivo = false;
	}
	
	
}
