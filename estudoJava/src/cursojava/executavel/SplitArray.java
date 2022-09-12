package cursojava.executavel;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "André, Curso Java, 80, 70, 60, 49";
		
		String[] valoresArray = texto.split(","); /* split quebra o texto*/
		
		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota 1: " + valoresArray[2]);
		System.out.println("Nota 2: " + valoresArray[3]);
		System.out.println("Nota 3: " + valoresArray[4]);
		System.out.println("Nota 4: " + valoresArray[5]);
		
		
		/****Convertendo um Array em uma lista****/
		
		java.util.List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		/****Convertendo uma lista em uma Array****/
		String[] conversaoArray = list.toArray(new String[6]);
		
		for (int pos = 0; pos< conversaoArray.length; pos++) {
		System.out.println(conversaoArray);
		}
	}
}
