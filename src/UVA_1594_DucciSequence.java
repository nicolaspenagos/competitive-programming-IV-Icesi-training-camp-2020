/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* @author Nicolás Penagos Montoya
* nicolas.penagosm98@gmail.com
**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVA_1594_DucciSequence {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T>0) {
			
			int n = Integer.parseInt(br.readLine());
			int[] array = new int[n];
			String[] parts = br.readLine().split(" ");
			
			boolean allZeros = true;
			boolean powerOfTwo = false;
			
			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(parts[i]);
				if(array[i]!=0) {
					allZeros = false;
				}
			}
			
			powerOfTwo = (n != 0) && ((n & (n - 1)) == 0);
			
			if(allZeros) {
				System.out.println("ZERO");
			}else if(powerOfTwo) {
				System.out.println("ZERO");
			}else {
				System.out.println("LOOP");
			}
			T--;
		}
		
	}
}
