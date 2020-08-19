package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Celular extends Telefone {

	ArrayList<String> contatos = new ArrayList<String>();
	Scanner ler = new Scanner(System.in);

	public Celular() {

	}

	public Celular(String ligarTelefone, String discar, String checarAgenda, String tipo) {
		super(ligarTelefone, discar, checarAgenda, tipo);
	}

	public String ligarTelefone(String ligarTelefone) {
		int senha = 633;
		if (senha != 633) {
			return "Senha errada!";
		} else {
			return "Desbloqueado";
		}
	}

	public String discar(String discar) {
		int contador = 0;
		String numeroDiscado;
		do {
			System.out.println("Digite o numero desejado: ");
			numeroDiscado = ler.nextLine();
			for (int i = 0; i < numeroDiscado.length(); i++) {
				if (numeroDiscado.charAt(i) != ' ') {
					contador++;
				}
			}

			if (contador < 8 || contador > 9) {
				System.out.println("Numero invalido!!!");
				contador = 0;
			}
		} while (contador < 8 || contador > 9);

		if (contador == 9 || contador == 8) {

			System.out.println("Discando para o numero " + numeroDiscado);

		}
		return numeroDiscado;
	}

	public void checarAgenda(String checarAgenda) {
		int op=0;
		do {
			System.out.printf("AGENDA%n1--Contatos Salvos%n2--Adicionar contato%3--Sair");
			op = ler.nextInt();

			switch (op) {
			case 1:
				System.out.println(contatos.toString());
				break;
			case 2:
				System.out.println("Digite o nome do contato que quer adicionar: ");
				contatos.add(ler.nextLine());
			default:
				System.out.println("Opção invalida!!!");
			}
		} while (op != 3);
	}

	public void menu() {
		System.out.printf("%nMENU%n0--Sair%n1--Fazer uma ligação%n2--Agenda%n");
		int op = ler.nextInt();
		switch (op) {
		case 1:

		}

		ler.close();
	}

	@Override
	public String tipo(String tipo) {
		// TODO Auto-generated method stub
		return null;
	}
}
