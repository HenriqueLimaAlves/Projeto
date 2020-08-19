package programa;

import java.util.Scanner;

import entidades.Celular;

public class TelefoneMain {

	public static void main(String[] args) {
		int opcaoAparelho;

		Scanner ler = new Scanner(System.in);
		Celular cel = new Celular();

		System.out.printf("%nQual aparelho deseja usar?%n%n1--Telefone Fixo%n2--Celular%n%n%n");
		opcaoAparelho = ler.nextInt();
		if (opcaoAparelho == 1)// Inicialização do Telefone Fixo
		{

		} else if (opcaoAparelho == 2)// Inicialização do Telefone Celular
		{
			do {
				System.out.println("Digite sua senha: ");//Senha
				cel.setSenha(ler.nextInt());
				cel.ligarTelefone(null);

				System.out.println(cel.ligarTelefone(null));
			} while (cel.ligarTelefone(null) == "Senha errada!");
			cel.menu();//Função para inicializar o menu do celular
		} else {
			System.out.println("Opção Invalida!!!!");
		}
	}

}
