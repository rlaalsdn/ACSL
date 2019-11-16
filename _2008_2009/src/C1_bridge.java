import java.util.*;
import java.io.*;

public class C1_bridge {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C1JR.in"));
		
		
		//input
		for (int i = 1; i<=10; i++) {
			
			int under = 0;
			int over = 0;
			
			String str[] = in.nextLine().split(" ");
			//System.out.println(Arrays.toString(str));
			
			//process
			
			
			int first = Integer.parseInt(str[0]);
			
			System.out.println(first);
			int second = Integer.parseInt(str[1]);
			System.out.println(second);
			
			if (str[2].equals("N")) {
				under = (40 + (first-1) * 30);
				int diff = second - (first+6);
				over = (40 + (diff-1) * 30) - 10;
				System.out.println(under + ", " + over);
			}
			else if (str[2].equals("H") || str[2].contentEquals("S")) {
				under = first * 30;
				int diff = second - (first+6);
				over = diff * 30;
				System.out.println(under + ", " + over);
			}
			else if (str[2].equals("C") || str[2].contentEquals("D")) {
				under = first * 20;
				int diff = second - (first+6);
				over = diff * 20;
				System.out.println(under + ", " + over);
			}
			
			
		}
			
	}
}


