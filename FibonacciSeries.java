package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int firstnum = 0;
		int secondnum = 1;
		int sum;
		System.out.println(firstnum+"\n"+secondnum);
		for (int i = 2; i < range; i++) {
			sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
			System.out.println(sum);
		}

	}

}
