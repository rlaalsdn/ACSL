import java.util.*;
import java.io.*;

public class C1_draftpicks {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("C1JR.in"));
		
		for (int i=0;i<2;i++) {
			
			String[] a = new String[10];
				for (int n=0;n<=9;n++) {
					
					a[n] = in.next();
					//System.out.println(a[n]);
						
				}
				//System.out.println(Arrays.toString(a));
			double[] b = new double[10];
				for (int f=0;f<=9;f++) {
					double next = Double.parseDouble(a[f]);
					b[f] = next;
				}
				//System.out.println(Arrays.toString(b));
				
				//1
				int first = 0;
				for (int j=0;j<=9;j=j+2) {					
					if ((b[j+1]/b[j])>10) {
						first++;
					}										
				}
				System.out.println(first);	
			
				
				
				//2
				
				double total = 0;
				for (int k=0;k<=9;k=k+2) {
					total += b[k+1]/b[k];
					
					//System.out.println(total);
				}
				double ave = (total/5)*1000000;
				System.out.printf("%.0f\n", ave);
			
				
				
				//3
				double temp = 0;
				double min = (b[1]/(b[0]*16));
				for (int m=2;m<=9;m=m+2) {
					temp = (b[m+1]/(b[m]*16));
					if (temp<min) 
						min = temp;
				}
				min= min*1000000;
				System.out.printf("%.0f\n", min);
				
				
				
				//4
				double tempA = 0;
				double max = (b[1]/(b[0]*18));
				for (int h=2;h<=9;h=h+2) {
					tempA = (b[h+1]/(b[h]*18));
					if (tempA>max) 
						max = tempA;
				}
				max=max*1000000;
				System.out.printf("%.0f\n", max);
				
				
				
				//5
				
				//average salary 16-game season 
				double totalA = 0;
				for (int d=0;d<=9;d=d+2) {
					totalA += (b[d+1]/(b[d]*16));
				}
				double aveA = totalA/5;
				
				//average salary 18-game season
				double totalB = 0;
				for (int e=0;e<=9;e=e+2) {
					totalB += (b[e+1]/(b[e]*18));
				}
				double aveB = totalB/5;
				
				if (aveB>aveA) {
					double tempB = aveA;
					aveA = aveB;
					aveB = tempB;
				}
				double result = (aveA-aveB)*1000000;
				System.out.printf("%.0f\n", result);
				
		}
	}
}


