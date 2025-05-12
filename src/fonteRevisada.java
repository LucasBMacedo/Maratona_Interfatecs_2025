import java.util.Scanner;

public class fonteRevisada {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int v = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();
		
		int tempoNoVale = (c * t * 2) + (m * t * 4);
		int tempoNaColina = (v * t * 2) + (m * t * 2);
		int tempoNaMontanha = (v * t * 4) + (c * t * 2);
		
		int menorTempoTotal = Math.min(tempoNoVale, (Math.min(tempoNaColina, tempoNaMontanha)));
		
		System.out.print(menorTempoTotal);
		
		sc.close();
}
}