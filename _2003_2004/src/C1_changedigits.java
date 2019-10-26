import java.util.*;
import java.io.*;

public class C1_changedigits {

	public static void main(String[] args) throws IOException {
		
		
		Scanner in = new Scanner(new File("C1JR.in"));
		for (int j = 1; j <= 10; j++) {
			String str = in.next();
			
			int[] a = new int[str.length()];
	
	
			for (int i=0;i<str.length();i++) {
				a[i] = str.charAt(i)-'0'; 
			}
			
			//System.out.println(Arrays.toString(a));
			int max = a[0];
			int index = 0;
			for (int k = 0; k <= a.length-1; k++) {
				if (a[k] > max) {
					max = a[k];
					index = k;
				}
				
			}
			if (max % 2 == 0) {
				max = max+4;
				if (max > 9) {
					max = max % 10;
					
				}
				
			}
			else {
				max = 0;
			}
			a[index] = max;
			
			if (a[0]==0) {
				String array = Arrays.toString(a);
				System.out.println("[" + array.substring(4));
			}
			
			else
			
			System.out.println(Arrays.toString(a));
			
		}
		
				
		

	}

}
