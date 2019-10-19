import java.util.*;
import java.io.*;

public class C1_asterisk {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C1JR.in"));
		for (int i = 0; i < 4; i++) {
			String str = in.next();
			int n = in.nextInt();
			if (str.equals("S")) {
				s(n);
				
			}
			else if (str.equals("H")) {
				h(n);
				
			}
			else if (str.equals("L")) {
				l(n);
				
			}
			else if (str.equals("B")) {
				int m = in.nextInt();
				b(n, m);
				
			}
		}
		
		
	}
	
	public static void s (int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void h (int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
				
			}
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void l (int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	public static void b (int n, int m) {
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
			System.out.print("*");
			}
			System.out.println();
	}

}
}
