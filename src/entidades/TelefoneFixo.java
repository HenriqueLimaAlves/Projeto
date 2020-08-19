package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class TelefoneFixo extends Telefone {
	private int ligar;
	Scanner ler = new Scanner(System.in);
	ArrayList<String> contatos = new ArrayList<String>();

	public TelefoneFixo() {

	}

	public TelefoneFixo(String ligarTelefone, String discar, String checarAgenda, String tipo, int ligar) {
		super(ligarTelefone, discar, checarAgenda, tipo);
		this.ligar = ligar;
	}

	public int getLigar() {
		return ligar;
	}

	public void setLigar(int ligar) {
		this.ligar = ligar;
	}

	public String ligarTelefone(String ligarTelefone) {

		
		if ( this.ligar== 1) {
			return "Telefone ligado";
		} else {
			return "Telefone desligado";
		}

	}

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

			if (contador < 8 || contador > 9) {
				System.out.println("Numero invalido!!!");
				contador = 0;
			}
		} while (contador < 8 || contador > 9);

		if (contador == 9 || contador == 8) {

			System.out.println("Discando para o numero " + numeroDiscado);
			if (numeroDiscado == "940028922") {
				System.out.printf("%nAAAlô%nNão foi dessa vez, mas continue tentando%n*FIM DA LIGAÇÃO*%n");
			} else if (numeroDiscado == "95555555") {
				System.out.printf("%nFala Zezé, bom dia Cara!%n*FIM DA LIGAÇÃO*");
			} else {
				System.out.println("O numero digitado não pode receber ligações no momento, tente mais tarde!");
			}
		}
		return numeroDiscado;
	}

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
					System.out.println("Opção invalida!!!");
				}
			}
		} while (op != 3);
	}
	
	public void menu() {
		int op;
		do {
			System.out.printf("%nMENU%n0--Bloquear Celular%n1--Fazer uma ligação%n2--Agenda%n");
			op = ler.nextInt();
			switch (op) {
			case 1:

				discar(null);
				break;
			case 2:
				checarAgenda(null);
				break;
			default:
				if (op != 0 && op >= 4) {
					System.out.println("Opção invalida!!!");
				}
				if (op == 0) {
					System.out.println("Celular bloqueado");
					break;
				}
			}
		} while (op != 0);
	}

	public String tipo(String tipo) {
		return null;
	}

}
