
public class Main {

	public static void main(String[] args) {

		MyHashMap<String, String> myHashMap = new MyHashMap<String, String>();

		myHashMap.put("England", "London");
		myHashMap.put("Turkey", "Ankara");
		myHashMap.list();
		// myHashMap.get("Turkey");
		// myHashMap.size();
		myHashMap.remove("Turkey");
		myHashMap.list();
		myHashMap.put("Turkey", "Ankara");
		myHashMap.list();

	}

}
