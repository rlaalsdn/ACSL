import java.util.*;
import java.io.*;

public class C1_numbertransformation {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C1IN.in"));
		
		for (int j = 0; j<5; j++) {
			
			String[] a = in.nextLine().split(" ");
			String first = a[0];
			char[] b = first.toCharArray();
			int[] n = new int[first.length()];
			for (int i = 0; i<first.length(); i++) {
				n[i] = (int)b[i] - 48;
			}
			//System.out.println(Arrays.toString(n));
			
			
			int p = Integer.parseInt(a[1]);
			
			int loc = n.length - p;
			//System.out.println(loc);
			
			p = n[n.length - p];
			//System.out.println(p);
			
			for (int i = 0; i<=n.length-1; i++) {
				if (i < loc) {
					n[i] = (n[i] + p) % 10;
				}
				else if (i > loc) {
					n[i] = Math.abs(n[i] - p);
				}
			}
			System.out.println(Arrays.toString(n));
				
				
				
				
		}
	}

}
