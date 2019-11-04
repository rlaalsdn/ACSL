import java.util.*;
import java.io.*;

public class C1_postoffice {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C1JR.in"));
		for (int j = 1; j<=10; j++) {
			//double next = in.nextDouble();
			//System.out.println(next);
			
			
		//input
		double[] a = new double[3];
		
		for (int i = 0; i<3; i++) {
			a[i] = in.nextDouble();			
		}
		
		//System.out.println(Arrays.toString(a));
		
		//process
			
			//regular post card
			if ((a[0] >= 3.5 && a[0] <= 4.25) &&
					(a[1] >=3.5 && a[1] <=6) &&
					(a[2] >= .007 && a[2] <=.016)) {
						//System.out.println(Arrays.toString(a));
						System.out.println("Regular Post Card");
			}
			
			//large post card
			else if ((a[0] > 4.25 && a[0] <= 6) &&
				(a[1] >6 && a[1] <=11.5) &&
				(a[2] >= .007 && a[2] <=.016)) {
					//System.out.println(Arrays.toString(a));
					System.out.println("Large Post Card");
			}
			
			//envelope
			else if ((a[0] >= 3.5 && a[0] <= 6.125) &&
				(a[1] >=5 && a[1] <=11.5) &&
				(a[2] >= .016 && a[2] <=.25)) {
					//System.out.println(Arrays.toString(a));
					System.out.println("Envelope");
			}
			
			//large envelope
			else if ((a[0] >= 6.125 && a[0] <= 24) &&
				(a[1] >=11 && a[1] <=18) &&
				(a[2] >= .25 && a[2] <=.5)) {
					//System.out.println(Arrays.toString(a));
					System.out.println("Large Envelope");
					
			}
			
			//package
			else if ((a[0] > 6.125 && a[1] > 18 && a[2] > .5) &&
					(a[0] + (2 * a[1]) + (2 * a[2]) <= 84)) {
						//System.out.println(Arrays.toString(a));
						System.out.println("Package");
			}
			
			//large package			
			else if (a[0] + (2 * a[1]) + (2 * a[2]) > 84 && a[0] + (2 * a[1]) + (2 * a[2]) < 130) {				
				//System.out.println(Arrays.toString(a));
				System.out.println("Large Package");
			}
			
			//unmailable
			else {
				//System.out.println(Arrays.toString(a));
				System.out.println("Unmailable");
			}	
		}	
	}
}