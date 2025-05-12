import java.util.Scanner;

public class heliconOriginal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String[] entrada = sc.nextLine().split(" ");
		int [] vet = new int[n];
		
        for (int i = 0; i < n; i++) {
            vet[i] = Integer.parseInt(entrada[i]);
        }
        
        int posicaoInicial = 0;
        
        int k = 1;
        int soma = 0;
        int maiorSoma = Integer.MIN_VALUE;
        
        while (posicaoInicial < n/2){
        	while (k < n/2){
        		for (int i = posicaoInicial; i < n; i += k){
        			soma += vet[i];
        }
        		if (soma > maiorSoma){
        			maiorSoma = soma;
        }
        		soma =0;
        		k++;
        }
        	posicaoInicial++;
        	k = 1;
        }
        System.out.println(maiorSoma);
        sc.close();
}
}