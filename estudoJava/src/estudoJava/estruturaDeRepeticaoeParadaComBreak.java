package estudoJava;

public class estruturaDeRepeticaoeParadaComBreak {

	public static void main(String[] args) {
		/*Estrutura de repeti��o For com Break(parada)*/
		
		for (int numero = 0; numero <= 10 ; numero ++) {
			if (numero == 8) {
				System.out.println("Obaaaa, encontrei o n�mero 8");
				System.out.println("Estou parando de executar...");
				break;
			}
		}

	}

}
