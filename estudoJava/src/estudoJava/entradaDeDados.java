package estudoJava;

import javax.swing.JOptionPane;

public class entradaDeDados {

	public static void main(String[] args) {
		/*Entrada de dados*/
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros? ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas? ");
		
		/*Convers�o de string para n�mero:*/
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		System.out.println("Divis�o para cada pessoa deu: " + divisao + " carros e sobrou " + resto + " carro(s)");
		
		JOptionPane.showMessageDialog(null,"Divis�o para cada pessoa deu: " + divisao + " carros e sobrou " + resto + " carro(s)");

	}

}
