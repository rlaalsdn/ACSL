

import java.util.*;
import java.io.*;

public class Code {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("Code.in"));
		
		for(int i=0; i<10; i++) {
			int num = in.next().charAt(0) - 64;
			
			//A-E
			if (1<=num && num<=5)
				num = num*2;
			
			//F-J
				else if (6<=num && num<=10) 
					num = num%3*5;
			
			//K-O
				else if (11<=num && num<=15)
					num = num/4*8;
			
			
			//P-T
				else if (16<=num && num<=20)
					num = ((num/10)+(num%10))*10;
			
			//U-Z
				else if (21<=num && num<=26)
					num = gcf(num)*12;
			
			num = num % 26;
			if (num==0) num = 26;
			
			System.out.println( (char)(num+64) );
		}

	}
	
	public static int gcf(int n) {
		for (int i = n/2; i>1;i--) {
			if (n%i==0) {
				return i;
			}
			
		}
		return 1;
	}

}
