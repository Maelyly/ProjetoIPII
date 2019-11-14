package teste;

import java.util.ArrayList;
import controladores.*;
import java.util.Scanner;

import classesprimarias.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ControladorPartida con;
		//Só para facilitar a navegação e o codigo ficar mais limpo (vai ser o mesmo controlador de ControladorPartida):
		ControladorPessoas p;		
		p = ControladorPessoas.getInstance();
		con = ControladorPartida.getControler();
		
		int num;
		do
		{
			System.out.println("Digite o número de jogadores:");
			num = scanner.nextInt();
			
			if(num<4)
			{
				System.out.println("Número inválido");
			}
			
		}while(num<4);
		
		

		for(int i = 0;i<num;i++)
		{
			System.out.println("Jogador "+ (i+1) + " , digite seu nome: ");
			String nome = scanner.next();
			p.cadastrar(new Jogador(nome));
			
		}
		ArrayList<Humano> lista = new ArrayList<Humano>(num);
		
		int t=0;
		do{
		
		Cidadao cd1 = new Cidadao();
		t++;
		Cidadao cd2 = new Cidadao();
		t++;
		Cidadao cd3 = new Cidadao();
		t++;
		Lobisomem lb1 = new Lobisomem();
		t++;
		Cortesa ct1 = new Cortesa();
		t++;
		Curandeiro cr1 = new Curandeiro();
		t++;
		Lenhador ln1 = new Lenhador();
		t++;
		Bardo b1 = new Bardo();
		t++;
		Chapeuzinho cp1 = new Chapeuzinho();
		t++;
		Cozinheiro cz1 = new Cozinheiro();
		t++;
		Mineiro mn1 = new Mineiro();
		t++;
		lista.add(cd1);
		lista.add(cd2);
		lista.add(lb1);
		lista.add(ct1);
		lista.add(cr1);
		lista.add(cd3);
		lista.add(cp1);
		lista.add(b1);
		lista.add(ln1);
		lista.add(mn1);
		lista.add(cz1);
		
		}while(t<num);
		
		for (int i = 0; i < p.tam(); i++) {
			p.getJogador(i).setPersonagem(lista.get(i));

		}
		
		
		
		for(int i=0; i<p.tam();i++)
		{
			System.out.println(p.getJogador(i).getNome()+" é "+p.getJogador(i).getNomePersonagem());		
			
		}
		
		scanner.close();
		((Lobisomem)p.getJogador(2).getPersonagem()).darDano(p.getJogador(1).getPersonagem());
		System.out.println(p.getJogador(1).getNome()+" foi atacado pelo lobisomem. Sua vida agora é: "+p.getJogador(1).getPersonagem().getVida());
		((Lobisomem)p.getJogador(2).getPersonagem()).darDano(p.getJogador(0).getPersonagem());
		System.out.println(p.getJogador(0).getNome()+" foi atacado pelo lobisomem. Sua vida agora é: "+p.getJogador(0).getPersonagem().getVida());
		((Cortesa)p.getJogador(3).getPersonagem()).brincarDeMedico(p.getJogador(0).getPersonagem(),20);
		System.out.println(p.getJogador(2).getNome()+" a Cortesã dormiu com você. Sua vida agora é: "+p.getJogador(0).getPersonagem().getVida());
		p.getJogador(0).votar(p.getJogador(0));
		p.getJogador(1).votar(p.getJogador(0));
		p.getJogador(2).votar(p.getJogador(3));
		p.getJogador(3).votar(p.getJogador(0));
		System.out.println("A vila matou: "+ con.jogadorMaisVotado().getNome());
		
		
	}
}
