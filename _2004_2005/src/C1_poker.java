import java.util.*;
import java.io.*;

public class C1_poker {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new File("C1JR.in"));
		
		
		for(int j=0; j<9; j++) {
			//input
			int a[] = new int[5];
			
			for (int i = 0; i<5; i++) {
					a[i] = in.nextInt()%13;
			}
	
			//System.out.println(Arrays.toString(a));

			//process
			int count = 0;
			boolean f[] = new boolean[4];
			
			for (int k = 0; k<=4; k++) {
				count = 0;
				if (a[k] == -1) continue;
				for (int n = k+1; n<=4; n++) {
					if (a[n] == a[k]) {
						count++;
						a[n] = -1;					
					}		
				}
				f[count] = true;					
			}
			
			//System.out.println(Arrays.toString(f));
			
			//output
			 if (f[1] && f[2]){
				System.out.println("FULL HOUSE");
			}
			 else if (f[1]) {
				 System.out.println("PAIR");
			 }
			 else if (f[3]) {
				 System.out.println("FOUR OF A KIND");
			 }
			 else if (f[2]) {
				 System.out.println("THREE OF A KIND");
			 }
			 else System.out.println("NONE");
			
			
		}
	}

}
