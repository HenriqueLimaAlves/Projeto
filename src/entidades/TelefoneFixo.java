package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class TelefoneFixo extends Telefone {
	Scanner ler = new Scanner(System.in);
	ArrayList<String> contatos = new ArrayList<String>();
	public TelefoneFixo( )
	{
		
	}
	
	public TelefoneFixo(String ligarTelefone, String discar, String checarAgenda, String tipo  )
	{
		super (ligarTelefone, discar, checarAgenda, tipo);
	}

	
	public String ligarTelefone(String ligarTelefone ) {
		
		System.out.println("Deseja ligar o telefone? \n1  Sim \n2  Não ");
		 int op = ler.nextInt();
		 if (op == 1) {
			 return "Telefone ligado";
		 }
		 else
		 {
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

		
	

	@Override
	public String tipo(String tipo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
