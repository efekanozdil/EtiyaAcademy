package homework4;

public class Main {

	public static void main(String[] args) {
		MyList mylist = new MyList();
		mylist.add("İstanbul");
		mylist.add("Ankara");
		//mylist.remove(1);
	//	boolean sonuc =mylist.contains("Ankara");
		//System.out.println(sonuc);
		mylist.add("izmir");
		mylist.remove("izmir");
		mylist.remove("Ankara");
		mylist.list();
	

	}

}
