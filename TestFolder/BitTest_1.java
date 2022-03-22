import java.util.Scanner;

public class BitTest_1 { 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int input = s.nextInt();
		int reverse = ~input; //결과 비교용
		int mask = 1;
		int result;
		
		System.out.println("입력된 정수 : " + input);
		System.out.println("입력된 정수의 이진수 변환 : " + Integer.toBinaryString(input));
		
		for(int i=16;i>=0;i--)	{
			result = input >> i & mask;
			System.out.printf("%d",result);
		}
		
		/* 기억 못할까봐 쓰는 진행 상황
		 * 0 생략안하고 출력까진 완료함. 연산자 중 ~ 사용하지 않고 뒤집기위해
     		 * 비트 비교하여 서로 다르면 참이 나오는 ^ 사용하려 했으나 결과가 1 또는 0 이 아닌 3, 4 등이 나와서 일단 보류
		 */
		
		System.out.println("\n----------------------------");
		System.out.println("비교용 : " + Integer.toBinaryString(reverse));
	}
}
