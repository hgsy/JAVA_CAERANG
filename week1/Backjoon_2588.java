import java.util.Scanner;

public class Backjoon_2588 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int l1 = input.nextInt();
		int l2 = input.nextInt();
		int value = 0;
		
		int l2_100 = l2/100;
		value = l2%100;
		int l2_10 = value/10;
		value = l2%10;
		int l2_1 = value;
		
		int l3 = l1 * l2_1;
		int l4 = l1 * l2_10;
		int l5 = l1 * l2_100;
		int result = l3 + (10 * l4) + (100 * l5);
		
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);
		System.out.println(result);
		input.close();
	}

}
