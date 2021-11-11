package homework3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = {3,2,6};
		int temp=0;
		
		
		for(int i=0;i<sayilar.length;i++) {
			for(int j=i+1;j<sayilar.length;j++) {
				
				if(sayilar[i]<sayilar[j]) {
					temp=sayilar[i];
					sayilar[i]=sayilar[j];
					sayilar[j]=temp;
				}
			}
		}
		
		for(int sayi: sayilar) {
			System.out.println(sayi);
		}
		
	}

}
