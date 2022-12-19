package vezba1;

import java.util.HashMap;
import java.util.Map;

public class main {
	public static void main(String[] args) {
		Map<String,String> rechnik=new HashMap<String,String>();
		rechnik.put("One", "Eden");
		rechnik.put("Two","Dva");
		rechnik.put("Three", "Tri");
		rechnik.put("Hi", "Zdravo");
		rechnik.put("Five", "Pet");
		
		System.out.println("Kluchevi se: "+rechnik.keySet());
		System.out.println("Vrednosti se: "+rechnik.values());
		
		for(Map.Entry<String, String> entry: rechnik.entrySet()) {
			System.out.println(entry.getKey()+" | "+entry.getValue());
			
		}
		
		if(rechnik.containsKey("Hi"))
			System.out.println("'Hi' vo prevod na makedonski jazik znaci: "+rechnik.get("Hi"));
		else
			System.out.println("Ne postoi zbor 'Hi'.");
	}
}
