import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* @author Nicolás Penagos Montoya
* nicolas.penagosm98@gmail.com
**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
public class UVA_10763_ForeignExchange {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		while (!line.equals("0")) {

			boolean flag = true;
			int T = Integer.parseInt(line);

			PriorityQueue<Integer> a = new PriorityQueue<Integer>();
			PriorityQueue<Integer> b = new PriorityQueue<Integer>();
		
			for (int i = 0; i < T; i++) {
				
				String[] parts = br.readLine().split(" ");
				int A = Integer.parseInt(parts[0]);
				int B = Integer.parseInt(parts[1]);

				a.offer(A);
				b.offer(B);
				
			}
			
			while(!a.isEmpty()&&flag) {
		
				int x = a.poll();
				int y = b.poll();
				if(x!=y) {
					flag = false;
				}
			}
			
			if(flag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}

			line = br.readLine();

		}
	}
}
