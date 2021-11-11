package homework4;

public class MyList {

	String[] test;

	public MyList() {
		this.test = new String[0];
	}

	public String[] add(String nesne) {
		String[] newTest = new String[test.length + 1];// 102

		for (int i = 0; i < test.length; i++) {
			newTest[i] = test[i];
		}
		newTest[newTest.length - 1] = nesne;

		test = new String[newTest.length]; // 103
		for (int i = 0; i < newTest.length; i++) {
			test[i] = newTest[i];
		}
		return test;
	}

	public boolean contains(String nesne) {

		boolean varMi = false;
		for (int i = 0; i < test.length; i++) {
			if (test[i] == nesne) {
				varMi = true;
			} else {
				varMi = false;
			}
		}

		return varMi;
	}

	public void remove(String nesne) {

		String[] newTest = new String[test.length];
		for (int i = 0; i < test.length; i++) {
			newTest[i] = test[i];
		}

		test = new String[test.length - 1];
		int silinmeyen = 0;
		for (int i = 0; i < test.length + 1; i++) {
			if (newTest[i] == nesne) {
				continue;
			} else {
				test[silinmeyen] = newTest[i];
				silinmeyen++;
			}
		}

	}

	public void remove(int index) {

		String[] newTest = new String[test.length];// 102
		for (int i = 0; i < test.length; i++) {
			newTest[i] = test[i]; // elemanları yeni arraye taşıdım.
		}

		test = new String[test.length - 1];// 103
		int silinmeyen = 0;
		for (int i = 0; i < test.length + 1; i++) {
			if (i == index) {
				continue;
			} else {
				test[silinmeyen] = newTest[i];
				silinmeyen++;
			}
		}

	}

	public void list() {
		for (String result : test) {
			System.out.println(result);
		}
	}
}
