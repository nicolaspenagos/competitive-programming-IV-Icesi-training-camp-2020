/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* @author Nicolás Penagos Montoya
* nicolas.penagosm98@gmail.com
**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UVA_10474_WhereIsTheMarble {
	
	static int[] marbels;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] parts = br.readLine().split(" ");
		int N = Integer.parseInt(parts[0]);
		int Q = Integer.parseInt(parts[1]);
		int casecounter = 0;

		while (N != 0 && Q != 0) {

			casecounter++;
			System.out.println("CASE# " + casecounter + ":");

			marbels = new int[N];

			for (int i = 0; i < N; i++) {
				marbels[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(marbels);
	
			for (int i = 0; i < Q; i++) {

				int x = Integer.parseInt(br.readLine());
				int j = binarySearch(x, marbels);
				
				if(j == -1) 
					System.out.println( x +" not found");
				else 
					System.out.println(x + " found at " + (j+1));
				
			}

			parts = br.readLine().split(" ");
			N = Integer.parseInt(parts[0]);
			Q = Integer.parseInt(parts[1]);
		}

	}

	public static int binarySearch(int x, int[] array) {

		int low = -1;
		int high = array.length - 1;

		while (low + 1 != high) {

			int mid = (low + high) >>> 1;

			if (array[mid] < x)
				low = mid;
			else
				high = mid;

		}

		if (array[high] != x)
			high = -1;

		return high;
	}
	
	public static int linearSearch(int x) {
		
		int pos = -1;
		boolean flag = true;
		
		for (int i = 0; i < marbels.length && flag; i++) {
			if(marbels[i] == x) {
				flag = false;
				pos = i;
			}
				
		}
		
		return pos;
		
		
	}
}
