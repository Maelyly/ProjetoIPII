package teste;

import java.util.ArrayList;
import controladores.*;
import java.util.Scanner;

import classesprimarias.*;

public class Main {

	public static void main(String[] args) {
		ControladorPartida con;
		//Só para facilitar a navegação e o codigo ficar mais limpo (vai ser o mesmo controlador de ControladorPartida):
		ControladorPessoas p;		
		p = ControladorPessoas.getInstance();
		con = ControladorPartida.getControler();
		
		con.gameStart(p);
		do {
			con.noite2();
			con.votarDia2();
		}while(true);
		
		

		
	}
}
