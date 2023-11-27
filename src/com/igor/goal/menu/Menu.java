package com.igor.goal.menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		int opcao;
		int id;
		String nome;
		String tipo;
		float preço;
		
		Scanner scan = new 	Scanner(System.in);
		
		while(true) {
		System.out.println(
				  "*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                Musica & Vida                ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Criar produto                        ");
		System.out.println("            2 - Listar todos os produtos            ");
		System.out.println("            3 - Atualizar Dados do produto           ");
		System.out.println("            4 - Apagar produto                       ");
		System.out.println("            0 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");
	
		opcao = scan.nextInt();
	
		
		if(opcao == 0) {
			System.out.println("Loja Musica & Vida");
			sobre();
			scan.close();
			System.exit(0);
		}
	}
	}
	public static void sobre() {
		System.out.println("Musica e Vida finalizado!!!");
	}
}
	
