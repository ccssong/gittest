package gittest;

public class test {

	public static void main(String[] args) {
		System.out.println("This is for testing .gitignore");
		int N = 6;
		
		int[] resultArray = new int[5];
		for(int i=0; i<5; i++) {
			resultArray[i] = (int)(Math.random() * 6 + 1);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(resultArray[i]);
		}
	}

}
