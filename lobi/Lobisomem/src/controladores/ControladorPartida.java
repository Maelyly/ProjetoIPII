package controladores;
import java.util.ArrayList;
import diaenoite.*;
import repositorio.*;
import java.util.List;
import java.util.Scanner;

import classesprimarias.*;
public class ControladorPartida {
	
	private ControladorPessoas cont;
	private SistemaTurnos turnos = new SistemaTurnos();
	private static ControladorPartida contro;
	public Scanner scanner = new Scanner(System.in);
	
	
    private ControladorPartida()
    {
    	cont = cont.getInstance();
    	
    }
    
	public static ControladorPartida getControler()
    {
    	if(contro == null)
    	{
    		contro = new ControladorPartida();
    	}
    	return contro;
    }
	
	public Jogador jogadorMaisVotado()
	{
		Jogador maisVotado = null;
		int numVotos = 0;
		for(int i = 0;i<cont.tam();i++)
		{
			if(cont.getJogador(i).getVotos()>numVotos)
			{
				numVotos = cont.getJogador(i).getVotos();
				maisVotado = cont.getJogador(i);
			}
			else if(cont.getJogador(i).getVotos() == numVotos)
			{
				maisVotado = null;
			}
		}
		return maisVotado;
	}
	
	public void gameStart(ControladorPessoas p) {
		int num,num2;
		do
		{
			System.out.println("Digite o número de jogadores:");
			num = scanner.nextInt();
			
			if(num<4)
			{
				System.out.println("Número inválido");
			}
			
		}while(num<4);
		
		do
		{
			System.out.println("Digite o número de Lobsmens:");
			num2 = scanner.nextInt();
			
			if(num2<1)
			{
				System.out.println("Número inválido");
			}
			
		}while(num2<1);
		p.numLobos = num2;
		

		for(int i = 0;i<num;i++)
		{
			System.out.println("Jogador "+ (i+1) + " , digite seu nome: ");
			String nome = scanner.next();
			p.cadastrar(new Jogador(nome));
		}
	}
	
	public void imprimirJogadoresVivos(int k)
	{
		if(k==1)
		{
			for(int i=0;i<cont.tam();i++)
			 {
				 
				 if(cont.getJogador(i).isJogando())
				 {
					       System.out.println("Aperte "+i+" para selecionar o jogador "+cont.getJogador(i).getNome());
				}
			 }
		}
		else if(k == 2)
		{
			for(int i=0;i<cont.tam();i++)
			 {
				 
				 if(cont.getJogador(i).isJogando())
				 {
					 if(!cont.getJogador(i).getNomePersonagem().equalsIgnoreCase("Lobisomem"))
					       System.out.println("Aperte "+i+" para selecionar o jogador "+cont.getJogador(i).getNome());
				}
			 }
		}
		else if(k == 3)
		{
			for(int i=0;i<cont.tam();i++)
			 {
				 
				 if(cont.getJogador(i).isJogando())
				 {
					 if(cont.getJogador(i).getNomePersonagem().equalsIgnoreCase("Lobisomem"))
					       System.out.println(cont.getJogador(i).getNome());
				}
			 }
		}
		else
		{
			for(int i=0;i<cont.tam();i++)
			 {
				 
				 if(cont.getJogador(i).isJogando())
				 {
					 if(cont.getJogador(i).getNomePersonagem().equalsIgnoreCase("Lobisomem"))
					       System.out.println("Aperte "+i+" para selecionar o jogador "+cont.getJogador(i).getNome());
				}
			 }
		}
		
	}
	public void votarDia2()
	{
		 turnos.preencherJogadoresVivos(cont.getRepoPessoas());
		 imprimirJogadoresVivos(1);
		 turnos.horaDaVotacaoDia();
		 turnos.resultadoVotacaoDia(cont.getRepoPessoas());
		 turnos.zerarVotos();
	}
	public void alguemMorreu()
	{
		for(int i=0;i<cont.tam();i++)
		 {
			 if(cont.getJogador(i).isJogando())
			 {
				 cont.getJogador(i).getPersonagem().morrer();
			 }
		 }
			 
	}

	public void getSure() {
		String a = "e";
		while(!a.equalsIgnoreCase("ok")){
		System.out.println("Digite ok para continuar.");
		a  = scanner.nextLine();
		}
	}
	public void jogarNoite(Humano h) {
		if(h.getClasse().equalsIgnoreCase("Lobisomem")) {
			getSure();
			System.out.println("Você é um Lobisomem.");
			System.out.println("Lobisomens: ");
			imprimirJogadoresVivos(3);
			System.out.println("Selecione quem deseja atacar: ");
			imprimirJogadoresVivos(2);
			System.out.print("Digite o numero: ");
			int b = scanner.nextInt();
			if(b<turnos.getCidadoes().size())
			((Lobisomem)h).darDano(turnos.getCidadoes().get(b+1));
			//getSure();
		}else if(h.getClasse().equalsIgnoreCase("Cidadao")) {
			//getSure();
			System.out.println("Sua classe é uma bosta, volte a dormir");
			getSure();
		}else if(h.getClasse().equalsIgnoreCase("Curandeiro")){
			h.toString();
			System.out.println("Selecione quem deseja atacar: ");
			imprimirJogadoresVivos(2);
			System.out.print("Digite o numero: ");
			int b = scanner.nextInt();
			if(b<turnos.getCidadoes().size())
			((Curandeiro)h).curarC((Cidadao)cont.getJogador(b).getPersonagem());
			
		}
		
	}
	
	public void noite2()
	{
		turnos.preencherJogadoresVivos(cont.getRepoPessoas());
		for(int i = 0;i<turnos.getVezDosJogadores().size();i++) {
			jogarNoite(turnos.getVezDosJogadores().get(i).getPersonagem());
			turnos.getVezDosJogadores().remove(i);
		}
		alguemMorreu();
		 
	}
	
	
	
	/*public ArrayList<Jogador> gerarListaProtegidos()
	{
		 ArrayList<Jogador> protegidos = new ArrayList<Jogador>();
		for(int i = 0;i < this.cidadoes.size();i++) {
			if(this.cidadoes.get(i).getClasse().equalsIgnoreCase("Lenhador"))
			{
				//protegidos.add(((Lenhador) this.cidadoes.get(i)).getProtegido());
			}
		}
		
		return protegidos;
	}
	
	public ArrayList<Jogador> gerarListaPresos(){
		 ArrayList<Jogador> presos = new ArrayList<Jogador>();
		for(int i = 0;i < this.cidadoes.size();i++) {
			if(this.cidadoes.get(i).getClasse().equalsIgnoreCase("Xerife"))
			{
				//protegidos.add(((Xerife) this.cidadoes.get(i)).getPreso());
			}
		}
		
		return presos;
	}*/
	
	public static Humano genericInstance(int id) {
		 if(id == 99)
           return new Lobisomem();
		else if(id == 0)
            return new Cidadao();
        else if(id == 1)
            return new Cortesa();
        else if(id == 2)
            return new Ritualista();
        else if(id == 3)
            return new Lenhador();
        else if(id == 4)
            return new Bardo();
        else if(id == 5)
            return new Chapeuzinho();
        else if(id == 6)
            return new Xerife();
        else if(id == 7)
            return new Cozinheiro();
        else if(id == 8)
            return new Mineiro();
        else if(id == 9)
            return new Vovo();
        else if(id == 10)
            return new Curandeiro();
        return null;
    }
	
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}

	

public SistemaTurnos getTurnos() {
		return turnos;
	}
	//checagem no fim de cada turno
	public void checagem(List<Jogador> mortosNaPartida) {
		for(int i = 0;i < mortosNaPartida.size();i++) {
			if(mortosNaPartida.get(i).getPersonagem().getClasse().equalsIgnoreCase("Mineiro")){
				((Mineiro)(mortosNaPartida.get(i).getPersonagem())).mineiroMorreu(this.cont.getRepoPessoas().getJogadores());
			}
			
			if(mortosNaPartida.get(i).getPersonagem().getClasse().equalsIgnoreCase("Ritualistico")){
				((Ritualista)(mortosNaPartida.get(i).getPersonagem())).amaldicoar();
			}
		}
	}
}