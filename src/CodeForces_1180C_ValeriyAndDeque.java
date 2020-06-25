/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* @author Nicolas Penagos Montoya
* nicolas.penagosm98@gmail.com
**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class CodeForces_1180C_ValeriyAndDeque {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		String[] parts = line.split(" ");
		Deque<Integer> deque = new LinkedList<Integer>();

		int n = Integer.parseInt(parts[0]);
		int q = Integer.parseInt(parts[1]);
	

		line = br.readLine();
		parts = line.split(" ");

		for (int i = 0; i < n; i++) {
			int e = Integer.parseInt(parts[i]);
			deque.offerLast(e);

		}

		MyPair[] uniques = new MyPair[n];
		MyPair[] loop = new MyPair[n-1];
		

		for (int i = 0; i < n; i++) {

			int first = deque.pollFirst();
			int second = deque.pollFirst();

			uniques[i] = new MyPair(first, second);

			if (first > second) {
				deque.offerFirst(first);
				deque.offerLast(second);
			} else {
				deque.offerFirst(second);
				deque.offerLast(first);
			}

		}
	
		for (int i = 0; i < n-1; i++) {
			
			int first = deque.pollFirst();
			int second = deque.pollFirst();
		
			loop[i] = new MyPair(first, second);

			if (first > second) {
				deque.offerFirst(first);
				deque.offerLast(second);
			} else {
				deque.offerFirst(second);
				deque.offerLast(first);
			}
			
		}

		while (q > 0) {

			long m = Long.parseLong(br.readLine())-1;

			MyPair pair;
			
			if(m<n) {
				pair = uniques[(int)m];
			}else {
				m = m - n;
	
				
				int i = (int)(m%(n-1));
				
		
				pair = loop[i];
			}

			System.out.println(pair.getFirst() + " " + pair.getSecond());

			q--;
		}

	}

}

class MyPair {

	private int first;
	private int second;

	public MyPair(int f, int s) {
		first = f;
		second = s;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
