package estudoJava;

public class comandoSwitchecase {

	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		/*SWITCH CASE: OPERA��ES EXATAS*/
		int dia = 5;
		switch (dia) {
		case 70:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("ter�a-feira");
			break;
		case 4:
			System.out.println("quarta-feira");
			break;
		case 5:
			System.out.println("quinta-feira");
			break;
		case 6:
			System.out.println("sexta-feira");
			break;
		case 7:
			System.out.println("s�bado");
			break;
			
			
		default: System.out.println("Outro dia qualquer" + media);
			break;
		}
		
	}

}
