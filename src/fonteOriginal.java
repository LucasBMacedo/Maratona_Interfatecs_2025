import java.util.Scanner;

public class fonteOriginal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int v = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();
		
		if (v > c && v > m) {
			System.out.print((c * t * 2 ) + (m * t * 4));
		}
			else if (c >= v && c >= m || v == m || v == c && v == m) {
				System.out.println((v * t * 2 ) + (m * t * 2));
			}
			else if (m > c && m > v) {
				System.out.print((v * t * 4) + (c * t * 2));	
			}
		sc.close();
		}
}