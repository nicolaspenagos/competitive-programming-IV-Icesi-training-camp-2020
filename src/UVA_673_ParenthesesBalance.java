/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* @author Nicolás Penagos Montoya
* nicolas.penagosm98@gmail.com
**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class UVA_673_ParenthesesBalance {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T > 0) {
			
			Stack<Character> s = new Stack<Character>();
			String line = br.readLine();
			
			if(line.length()==0 || line.equals(" ") || line.equals("")) {
				System.out.println("Yes");
			}else {
				char[] parts = new char[line.length()];
				for (int i = 0; i < parts.length; i++) {
					parts[i] = line.charAt(i);
				}
				
				s.push(parts[0]);
			
				if (parts.length % 2 == 0) {
					
					for (int i = 1; i < parts.length; i++) {

						char current = parts[i];
					
					
							if (current == '(' || current == '[') {
								s.push(current);
								//System.out.println(current);
							} else {

								if (current == ')') {

									if (!s.empty()) {
										if(s.peek() == '(')
										s.pop();
									}else {
										s.push(current);
									}

								}

								if (current == ']') {

									if (!s.empty()) {
										if(s.peek() == '[')
											s.pop();
									}else {
										s.push(current);
									}

								}

							}
					}
					
					if(s.empty()) {
						System.out.println("Yes");
					}else {
						System.out.println("No");
					}

				} else {
					System.out.println("No");
				}
				
			}

			T--;
		}
	}
}