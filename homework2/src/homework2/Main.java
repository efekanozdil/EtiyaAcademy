package homework2;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = { 5, 10, 2, 5, 8, 4, 2 };

		boolean tekrar = false;
		
		for (int i = 0; i < sayilar.length; i++) {

			for (int j = 0; j < i; j++) {
				if (sayilar[i] == sayilar[j]) {
					tekrar = true;
				}
			}

			if (tekrar == false) {
				System.out.println(sayilar[i]);
			}

		}

	}

}
