package mapDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapImp {
	public static void main(String[] args) {
		// String st = "ab abc abc abd abd ab aba abb aba";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Big String Seprated By Space");

		String st = sc.nextLine();
		String[] arr = st.split(" ");
		Map<String, Integer> mp = new LinkedHashMap<>();
		for (String i : arr) {
			if (mp.containsKey(i)) {
				mp.put(i, mp.get(i) + 1);

			} else {
				mp.put(i, 1);
			}
		}
		System.out.println("Your Maped String Is :- " + mp);

	}
}
