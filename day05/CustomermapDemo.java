package ILPday05;

import java.util.HashMap;

public class CustomermapDemo {
	private static HashMap<Integer, Customermap> customersmap;

	public static void main(String Arggs[]) {

		customersmap = new HashMap<Integer, Customermap>();
		customersmap.put(100, new Customermap(100, "abcd", "12/2/34", 1500, "abc@test.com", 25));
		customersmap.put(101, new Customermap(101, "bbcd", "02/2/34", 2509, "ybc@test.com", 65));
		customersmap.put(102, new Customermap(102, "cbcd", "42/2/34", 2200, "avc@test.com", 75));
		customersmap.put(103, new Customermap(103, "bkcd", "72/2/34", 2540, "abi@test.com", 85));
		customersmap.put(104, new Customermap(104, "abud", "92/2/34", 2580, "lbc@test.com", 95));

		replaceEmail(104, "gtc@tewst.com");
	}

	public static void replaceEmail(int id, String email) {

		if (customersmap.containsKey(id)) {
			customersmap.get(id).setEmail(email);
			System.out.println(customersmap.get(id).toString());
		} else {
			System.out.println("NoIdFound");
		}
	}
}
