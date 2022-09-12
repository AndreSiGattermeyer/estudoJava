package cursojava.executavel;

public class Matriz {

	/*Executar o código Java*/
	public static void main(String[] args) {
		
		int notas[] [] = new int[2] [3]; 
		
		notas[0][0] = 80; /* 1ª linha e 1ª coluna valor é 80*/
		notas[0][1] = 90; /* 1ª linha e 2ª coluna valor é 90*/
		notas[0][2] = 70; /* 1ª linha e 3ª coluna valor é 70*/
		
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
