package cursojava.executavel;

public class Matriz {

	/*Executar o c�digo Java*/
	public static void main(String[] args) {
		
		int notas[] [] = new int[2] [3]; 
		
		notas[0][0] = 80; /* 1� linha e 1� coluna valor � 80*/
		notas[0][1] = 90; /* 1� linha e 2� coluna valor � 90*/
		notas[0][2] = 70; /* 1� linha e 3� coluna valor � 70*/
		
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;
		

		
		for (int poslinha = 0; poslinha < notas.length; poslinha ++) { /* Percorre as linhas*/
			System.out.println("======================================");
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna ++) { /* Para cada linha Percorre as colunas ARRAY*/
				System.out.println("Valor da matriz: " + notas[poslinha][poscoluna]);
				}
		}
	}
}
