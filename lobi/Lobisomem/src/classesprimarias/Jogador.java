package classesprimarias;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
	private String nome;
	private boolean jogando;
	private int votos;
	private Humano personagem;
	
	public Jogador(String nome,Humano humano) {
		super();
		this.nome = nome;
		this.jogando = true;
		this.votos = 0;
		this.personagem = humano;
		
	}
	public Jogador(String nome)
	{
		super();
		this.nome = nome;
		this.jogando = true;
		this.votos = 0;
	}
	public void votar(Jogador j)
	{
		if(j!=null)
		j.setVotos(j.getVotos()+1);
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
	public void foiVotado() {
		this.votos += 1;
	}
	public void votarDia(ArrayList<Jogador> vezDosJogadores) {
		 System.out.println("Hora de você votar: ");
		 Scanner scan = new Scanner(System.in);
		 int a = scan.nextInt();
		 if(a<vezDosJogadores.size())
		 vezDosJogadores.get(a).foiVotado();
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	public void resetVotos()
	{
		this.votos = 0;
	}

	public Humano getPersonagem() {
		return personagem;
	}
	public String getNomePersonagem()
	{
		return getPersonagem().getClasse();
	}

	public void setPersonagem(Humano classe) {
		this.personagem = classe;
	}
	
	public boolean equals(Jogador j) {
		if(j==null)
			return false;
		if(j.getNome().equals(this.nome))
			return true;
			else
			 return false;	
	}
	public String toString()
	{
		return nome+" "+personagem.toString();
	}
}
