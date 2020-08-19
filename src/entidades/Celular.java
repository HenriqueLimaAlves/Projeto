package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Celular extends Telefone {
	private int senha;

	ArrayList<String> contatos = new ArrayList<String>();
	Scanner ler = new Scanner(System.in);

	// contrutores
	public Celular() {

	}

	public Celular(String ligarTelefone, String discar, String checarAgenda, String tipo, int senha) {
		super(ligarTelefone, discar, checarAgenda, tipo);
		this.senha = senha;
	}

	// get e set
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	// fun��o desbloquear o celular
	public String ligarTelefone(String ligarTelefone) {

		if (this.senha != 633) {
			return "Senha errada!";
		} else {
			return "Desbloqueado";
		}
	}

	// fun��o discar para um numero
	public String discar(String discar) {
		int contador = 0;
		String numeroDiscado;
		do {
			System.out.println("Digite o numero desejado: ");
			numeroDiscado = ler.next();
			for (int i = 0; i < numeroDiscado.length(); i++) {
				if (numeroDiscado.charAt(i) != ' ') {
					contador++;
				}
			}
			// contador para definir se o numero � valido
			if (contador < 8 || contador > 9) {
				System.out.println("Numero invalido!!!");
				contador = 0;
			}
		} while (contador < 8 || contador > 9);

		if (contador == 9 || contador == 8) {

			System.out.println("Discando para o numero " + numeroDiscado);
			if (numeroDiscado == "940028922") {
				System.out.printf("%nAAAl�%nN�o foi dessa vez, mas continue tentando%n*FIM DA LIGA��O*%n");
			} else if (numeroDiscado == "95555555") {
				System.out.printf("%nFala Zez�, bom dia Cara!%n*FIM DA LIGA��O*");
			} else {
				System.out.println("O numero digitado n�o pode receber liga��es no momento, tente mais tarde!");
			}
		}
		return numeroDiscado;
	}

	// fun��o para ver a agenda existente, e adicionar um contato
	public void checarAgenda(String checarAgenda) {
		int op = 0;
		do {
			System.out.printf("%nAGENDA%n1--Contatos Salvos%n2--Adicionar contato%n3--Sair%n%n");
			op = ler.nextInt();

			switch (op) {
			case 1:
				System.out.println(contatos.toString());
				break;
			case 2:
				System.out.println("Digite o nome do contato que quer adicionar: ");
				contatos.add(ler.next());
				break;
			default:
				if (op > 3) {
					System.out.println("Op��o invalida!!!");
				}
			}
		} while (op != 3);
	}

	// fun��o menu para selecionar os metodos
	public void menu() {
		System.out.printf("%nMENU%n0--Bloquear Celular%n1--Fazer uma liga��o%n2--Agenda%n");
		int op = ler.nextInt();
		switch (op) {
		case 1:

			discar(null);
			break;
		case 2:
			checarAgenda(null);
		default:
			if (op != 0 && op >= 3) {
				System.out.println("Op��o invalida!!!");
			}
			if (op == 0) {
				System.out.println("Celular bloqueado");
				break;
			}
		}
	}

	public String tipo(String tipo) {
		return "Celular";
	}
}
