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

	// fun��o para visualizar a agenda existente, e adicionar um contato
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
	// fun��o calculadora do celular
	public void calculadora()
	{
		double soma=0;
		int op=0;
		double n1 = 0, n2=0;
		System.out.printf("%nCalculadora%nDigite o Primeiro Numero:%n");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo Numero");
		n2 = ler.nextInt();
		System.out.printf("%nDigite a opera��o%n1--Soma%n2--Subtra��o%n3--Multiplica��o%n4--Divis�o%n");
		op = ler.nextInt();
		switch(op)
		{
		case 1:
			soma = n1+n2;
			System.out.printf("%nSoma de %.2f por %.2ff � igual a %.2f%n", n1, n2, soma);
			break;
		case 2:
			soma = n1-n2;
			System.out.printf("%nSubtra��o de %.2f por %.2f � igual a %.2f%n", n1, n2, soma);
			break;
		case 3:
			soma = n1*n2;
			System.out.printf("%nMultiplica��o de %.2f por %.2f � igual a %.2f%n", n1, n2, soma);
			break;
		case 4:
			soma = n1/n2;
			System.out.printf("%nDivis�o de %.2f por %.2f � igual a %.2f%n", n1, n2, soma);
			break;
		default:
			if (op>4)
			{
				System.out.println("Op��o invalida!!!");
			}
		}
	}
	// fun��o menu para selecionar os metodos
	public void menu() {
		int op;
		do {
			System.out.printf("%nMENU%n0--Bloquear Celular%n1--Fazer uma liga��o%n2--Agenda%n3--Calculadora%n");
			op = ler.nextInt();
			switch (op) {
			case 1:

				discar(null);
				break;
			case 2:
				checarAgenda(null);
				break;
			case 3:
				calculadora();
				break;
			default:
				if (op != 0 && op >= 4) {
					System.out.println("Op��o invalida!!!");
				}
				if (op == 0) {
					System.out.println("Celular bloqueado");
					break;
				}
			}
		} while (op != 0);
	}

	public String tipo(String tipo) {
		return "Celular";
	}
}
