/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* @author Nicolás Penagos Montoya
* nicolas.penagosm98@gmail.com
**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeSet;

public class UVA_10391_CompoundWords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		TreeSet<String> set = new TreeSet<String>();
		ArrayList<String> words = new ArrayList<String>();
		TreeSet<String> compoundWords = new TreeSet<String>();

		while (true) {

			set.add(line);
			words.add(line);
			line = br.readLine();
			
			if(line == null || line.equals("")) {
				break;
			}

		}

		for (int k = 0; k < words.size(); k++) {

			String current = words.get(k);
			
			if(current.length()==2) {
				
				String sbs1 = String.valueOf(current.charAt(0));
				String sbs2 = String.valueOf(current.charAt(1));
				
				if(set.contains(sbs1)&&set.contains(sbs2))
					compoundWords.add(current);
					
	
			}else {
				
				for (int i = 1; i < current.length() - 1; i++) {

					String sbs = current.substring(0, i);
				
					if (set.contains(sbs)) {

						String sbs1 = current.substring(i, current.length());

						if (set.contains(sbs1))
							compoundWords.add(current);
					}

				}
				
			}

			
		}

		for (String string : compoundWords) {
			System.out.println(string);
		}

	}

}
