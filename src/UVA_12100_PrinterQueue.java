/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* @author Nicolás Penagos Montoya
* nicolas.penagosm98@gmail.com
**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class UVA_12100_PrinterQueue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		while(T>0) {
			
			String parts[] = br.readLine().split(" ");
			int n = Integer.parseInt(parts[0]);
			int m = Integer.parseInt(parts[1]);
			
			parts = br.readLine().split(" ");

			int[] priorities = new int[n];
			
			PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder()); 
			Queue<Pair> queue = new LinkedList<Pair>();
			
			for (int i = 0; i < n; i++) {
				
				int e = Integer.parseInt(parts[i]);
				priorities[i] = e;
				pQueue.add(e);
				
				boolean myJob = (i == m) ? true:false;
				Pair current = new Pair(e, myJob);
				queue.offer(current);
				
			}
			
			int minutes = 0;
			boolean stop = false;
			while(!stop) {
				
				Pair current = queue.poll();
					
				if(current.getFirst()>=pQueue.peek()) {
					
					minutes++;
					pQueue.poll();
					
					if(current.getSecond()) 
						stop = true;
					
				}else {
					queue.offer(current);
				}
				
				
			}
			
			System.out.println(minutes);	
			T--;
		}
	}

}

class Pair {

	private int first;
	private boolean second;

	public Pair(int f, boolean s) {
		first = f;
		second = s;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public boolean getSecond() {
		return second;
	}

	public void setSecond(boolean second) {
		this.second = second;
	}

}
