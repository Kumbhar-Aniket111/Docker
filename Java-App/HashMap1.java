
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		Map<String,Integer> hashm = new HashMap<>();
		hashm.put("Aniket", 100);
		hashm.put("Ramesh", 50);
		if (hashm.containsKey("Aniket"))
			System.out.println(hashm.get("Aniket"));
		for(String i:hashm.keySet()) {
			System.out.println(i + " " + hashm.get(i));
		}
		for(Entry<String,Integer> entry:hashm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
