/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* @author Nicolás Penagos Montoya
* nicolas.penagosm98@gmail.com
**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class CodeForces22A_SecondOrderStatictics {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] parts = br.readLine().split(" ");
		
		Set<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		int[] numbers = new int[parts.length];
		
		for (int i = 0; i < numbers.length; i++) {
			int x = Integer.parseInt(parts[i]);
			if(!set.contains(x)) {
				set.add(x);
				list.add(x);
			}
		}
		
		
		Collections.sort(list);
		if(list.size()>1) {
			System.out.println(list.get(1));
		}else {
			System.out.println("NO");
		}
		
	}

}
