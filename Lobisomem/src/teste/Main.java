package teste;

import java.util.ArrayList;
import java.util.Scanner;

import classesprimarias.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int num;
		do
		{
			System.out.println("Digite o número de jogadores:");
			num = scanner.nextInt();
			
			if(num<3)
			{
				System.out.println("Número inválido");
			}
			
		}while(num<3);
		
		//isso aq vai ser substituido pelo repositorio
		ArrayList<Jogador> lista = new ArrayList<Jogador>(num);
		
		for(int i = 0;i<num;i++)
		{
			System.out.println("Jogador "+ (i+1) + " , digite seu nome: ");
			String nome = scanner.next();
			lista.add(new Jogador(nome));
		}
		
		
		
		Jogador player1 = new Jogador("Sasa");
		Jogador player2 = new Jogador("Lulu");
		Jogador player3 = new Jogador("Teteu");
		
		Cidadao jogador1 = new Cidadao();
		Curandeiro jogador2 = new Curandeiro();
		Cortesa jogador3 = new Cortesa();
		
		jogador1.setJogador(player1);
		jogador2.setJogador(player2);
		jogador3.setJogador(player3);
		
		
		
		System.out.println("Vida do jogador 2: "+jogador3.getVida());
		System.out.println("Vida do jogador 3: "+jogador2.getVida());
		System.out.println(jogador1.getJogador().getNome()+" é "+jogador1.getClasse());
		System.out.println(jogador2.getJogador().getNome()+" é "+jogador2.getClasse());
		System.out.println(jogador3.getJogador().getNome()+" é "+jogador3.getClasse());
		jogador1.darDano(jogador3);
		jogador1.darDano(jogador3);
		jogador1.darDano(jogador2);
		jogador2.curarando(jogador3);
		jogador3.curarando(jogador2, 10);
		System.out.println("Vida do jogador 2: "+jogador3.getVida());
		System.out.println("Vida do jogador 3: "+jogador2.getVida());
		System.out.println(jogador1.getJogador().getNome()+" "+jogador1.getCasa().getNome());
		jogador1.seProteger();
		jogador2.darDano(jogador1);
		System.out.println(jogador1.getJogador().getNome()+" "+jogador1.getCasa().getNome());
		System.out.println("Vida do jogador 1: "+jogador1.getVida());
		scanner.close();
	}
}
