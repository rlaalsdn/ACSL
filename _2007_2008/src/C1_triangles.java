import java.util.*;
import java.io.*;

public class C1_triangles {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C1JR.in"));
		double[] a = new double[6];
		for (int i = 1; i<=10; i++) {
			int count = 0;
			
			//input
			String[] str = in.nextLine().split(" ");
			System.out.println(Arrays.toString(str));
			
			for (int k = 0; k<3; k++) {
				//System.out.print("[" + k + " " + str[k] + "] ");
				for (int j = 3; j<6; j++) {
					//System.out.print("(" + j + " " + str[j] + ") ");
					if (str[k].equals(str[j])) {
						//System.out.println(str[k] + " " + str[j]);
						count = count + 1;
						str[j] = "-1";
					}
				}
			}
			System.out.println(count);
			
			
		}
		
	}

}
