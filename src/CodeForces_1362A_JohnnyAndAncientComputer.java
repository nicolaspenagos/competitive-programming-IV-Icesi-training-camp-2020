/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* @author Nicolás Penagos Montoya
* nicolas.penagosm98@gmail.com
**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class CodeForces_1362A_JohnnyAndAncientComputer {
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); 
 
		int counter = 0;
		while(counter<T) {
		
			String line = br.readLine();
			String[] parts = line.split(" ");
			long a = Long.parseLong(parts[0]);
			long  b = Long.parseLong(parts[1]);
			
			long  major, minor;
			
			if(a>b) {
				major = a;
				minor = b;
			}else {
				major = b;
				minor = a;
			}
			
			if(major != minor) {
				long m = major;
			
				if(major%2==0 && major % (minor*2)==0) {
					
					long  divs = 0;
					
					while(major%2==0 && major >minor ) {
						major = major/2;
						divs++;
					}
					
					long  _8 = divs / 3;
					divs = divs - (_8 * 3);
					
					long  _4 = divs / 2;
					divs = divs - (_4 * 2 );
				
					long  _2 = divs;
			
					if((long)minor* (Math.pow(2, (_8*3 + _4*2+_2)))!=m) {
						System.out.println("-1");
					}else {
						System.out.println(_8 + _4 + _2);
					}
					
				}else {
					System.out.println("-1");
				}
				
			}else {
				System.out.println("0");
			}
			
			counter++;
		}
		
	}
 
}