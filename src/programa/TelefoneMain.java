package programa;

import java.util.Scanner;

import entidades.Celular;
import entidades.TelefoneFixo;

public class TelefoneMain {

	public static void main(String[] args) {
		int opcaoAparelho;

		Scanner ler = new Scanner(System.in);
		Celular cel = new Celular();
		TelefoneFixo tf = new TelefoneFixo();
		
		System.out.printf("%nQual aparelho deseja usar?%n%n1--Telefone Fixo%n2--Celular%n%n%n");
		opcaoAparelho = ler.nextInt();
		if (opcaoAparelho == 1)// Inicialização do Telefone Fixo
		{
			do {//liga o aparelho
			System.out.println("Deseja ligar o telefone? \n1  Sim \n2  Não ");
			tf.setLigar(ler.nextInt());
			tf.ligarTelefone(null);
			System.out.println(tf.ligarTelefone(null));
			}while(tf.ligarTelefone(null)=="Telefone desligado");
			
			tf.menu();//menu do telefone fixo 
			
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
