import java.util.*;
import java.io.*;

public class C1_golf {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C1JR.in"));
		for (int i = 1; i<=2; i++) {
			int totalS = 0;
			int totalP = 0;
			int result = 0;
			for(int j = 1; j<=4; j++) {
			
			//input
			
			String temp = in.next();
			int first = Integer.parseInt(temp);
			
			totalP = totalP + first;
			
			//System.out.println(first);
			temp = in.next();
			int second = Integer.parseInt(temp);
			
			totalS = totalS + second;
			
			//System.out.println(second);
			
			//process
			
			int diff = (first - second) * -1;
			
			
			//output
			
			if(diff == -1) 
				System.out.println("Birdie");				
			
			else if (diff == -2) 
				System.out.println("Eagle");
			
			else if (diff == 1) 
				System.out.println("Bogey");
			
			else if (diff == 2) 
				System.out.println("Double Bogey");
			
			else
				System.out.println("Par");
			
			
			
			}
			if (totalS > totalP) {
				result = totalS - totalP;
				System.out.println(result + " over par");
			}
			else if (totalP > totalS) {
				result = totalP - totalS;
				System.out.println(result + " under par");
			}
			else 
				System.out.println("Par");
			
		}

	}

}
