import java.util.Scanner;

public class Backjoon_2884_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int H, M;
		
		H = input.nextInt();
		M = input.nextInt();
		
		if(M-45<0) {
			H--;
			M = (M+60)-45;
			if(H<0)	{
				H += 24;
			}
		}else	{
			M = M-45;
		}
		
		System.out.printf("%d %d", H, M);
		input.close();
	}

}
