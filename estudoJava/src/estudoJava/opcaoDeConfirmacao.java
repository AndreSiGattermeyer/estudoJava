package estudoJava;

import javax.swing.JOptionPane;

public class opcaoDeConfirmacao {

	public static void main(String[] args) {
		/*Entrada de dados*/
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros? ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas? ");
		
		/*Convers�o de string para n�mero:*/
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu " + divisao);
		}else {
			System.out.println("N�o quis ver o resultado!");
		}
		
		resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o RESTO da divis�o? ");

		if (resposta == 0) {
			 JOptionPane.showMessageDialog(null,"O resto da divis�o �  " + resto);
			
		}else {
			System.out.println("N�o quis ver o resultado!");
	}

	}
}


