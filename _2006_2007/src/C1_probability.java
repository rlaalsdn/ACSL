import java.util.*;
import java.io.*;

public class C1_probability {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C1JR.in"));
		for (int i = 1; i<=8; i++) {


		int red = 0;
		int blue = 0;
		int sum = 0;


			//input
		
			String[] str = in.nextLine().split(" ");
			//System.out.println(Arrays.toString(str));
			
			
			//ONLY SELECTING ONE MARBLE
			
			
			if (str[0].equals("1")) {
				red = Integer.parseInt(str[1]);
				blue = Integer.parseInt(str[2]);
				sum = red + blue;
				
				//PROBABILITY OF 1 RED
				
				if (str[3].equals("R")) {
					//System.out.println("red");
					System.out.println(red+"/"+sum);
				}
				
				//PROBABILITY OF 1 BLUE
				
				else if (str[3].equals("B")) {
					//System.out.println("blue");
					System.out.println(blue+"/"+sum);
				}
			
			}
			
			
			//SELECTING TWO MARBLES
			
			
			else if (str[0].equals("2")) {
				red = Integer.parseInt(str[1]);
				blue = Integer.parseInt(str[2]);
				sum = red + blue;
				
				//WITH REPLACEMENT
				
				if (str[3].equals("Y")) {
					
					//RED FIRST MARBLE
					
					if (str[4].equals("R")) {
						
						//RED SECOND MARBLE (red)
												
						if (str[5].equals("R")) {
							//System.out.println("red * red / total (Y)");
							System.out.println(red * red +"/"+sum * sum);
						}
						
						//BLUE SECOND MARBLE (red)
						
						if (str[5].equals("B")) {
							//System.out.println("blue * blue / total (Y)");
							System.out.println(red * blue + "/" + sum * sum);
							
						}
						
					//BLUE FIRST MARBLE
						
					}
					else if (str[4].equals("B")) {
						
						//RED SECOND MARBLE (blue)
						
						if (str[5].equals("R")) {
							//System.out.println("blue * red / total (Y)");
							System.out.println(blue * red + "/" + sum * sum);
						}
						
						//BLUE SECOND MARBLE (blue)
						
						else if (str[5].equals("B")) {
							//System.out.println("blue * blue / total (Y)");
							System.out.println(blue * blue + "/" + sum * sum);
						}
					}
					
				}
				else if (str[3].equals("N")) {
					
					
					//RED FIRST MARBLE
					
					
					if (str[4].equals("R")) {
						
						//RED SECOND MARBLE (red)
												
						if (str[5].equals("R")) {
							//System.out.println("red * red / total (N)");
							System.out.println(red * red +"/"+sum * sum);
						}
						
						//BLUE SECOND MARBLE (red)
						
						if (str[5].equals("B")) {
							//System.out.println("blue * blue / total (N)");
							System.out.println(red * blue + "/" + sum * (sum-1));
							
						}
						
					//BLUE FIRST MARBLE
						
					}
					else if (str[4].equals("B")) {
						
						//RED SECOND MARBLE (blue)
						
						if (str[5].equals("R")) {
							//System.out.println("blue * red / total (N)");
							System.out.println(blue * red + "/" + sum * (sum-1));
						}
						
						//BLUE SECOND MARBLE (blue)
						
						else if (str[5].equals("B")) {
							//System.out.println("blue * blue / total (N)");
							System.out.println(blue * (blue-1) + "/" + sum * (sum-1));
						}
					}
				}
				
			}
		}
		
		
		

	}

}
