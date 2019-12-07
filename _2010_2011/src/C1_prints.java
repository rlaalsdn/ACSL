import java.util.*;
import java.io.*;

public class C1_prints {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C1JR.in"));
		//input
		int[] arr = {0, 16, 16, 8, 8, 4, 4, 2, 2, 1, 1};
		for(int i = 0; i<7; i++)  {
			int top = 1;
			int bot = 1; 
			String[] str = in.nextLine().split(" ");
			//System.out.println(Arrays.toString(str));
			
			for (int j = 0; j<str.length; j++) {
				int next = Integer.parseInt(str[j]);
				if (next % 2 == 0) {
					top += arr[next];
				}
				else {
					bot += arr[next];
				}
				
				
				
			}
			System.out.println(top + "/" + bot);
		
		
		
		
		}

	}
	
}
