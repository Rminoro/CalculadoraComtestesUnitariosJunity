package br.com.fiap.calculadora.main;

import br.com.fiap.calculadora.model.Calculadora;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		Calculadora calcu = new Calculadora();
		
		int escolha = 0;
		
		while(escolha != 5) {
		
		System.out.println("CALCULADORA");
		System.out.println("Insira dois números:");
		System.out.println("Numero 1");
		int numero1 = S.nextInt();
		System.out.println("Número 2");
		int numero2 = S.nextInt();
		
		System.out.println("Qual operação deseja realizar?\n"
				+"1 para somar\n"
				+"2 para subtrair\n"
				+"3 para multiplicar\n"
				+"4 para dividir");
		escolha = S.nextInt();
	

	
	if(escolha == 1) {
		int resultado = calcu.somar(numero1,numero2);
		System.out.println(" A soma resulta em " + resultado);
	}else if (escolha == 2) {
		int resultado = calcu.subtrair(numero2,numero1);
		System.out.println(" A subtração resulta em " + resultado);
	}else if (escolha == 3) {
		int resultado = calcu.multiplicar(numero1,numero2);
		System.out.println(" A multiplicação resulta em " + resultado);
	}else if (escolha == 4) {
		int resultado = calcu.dividir(numero1,numero2);
		System.out.println(" A divisão resulta em " + resultado);
	}
		
	}

			
	}
	}

