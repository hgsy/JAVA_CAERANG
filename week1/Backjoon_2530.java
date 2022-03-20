import java.util.Scanner;

public class Backjoon_2530 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int H, M, S, T, ST, MT, HT, value;
		H = s.nextInt();
		M = s.nextInt();
		S = s.nextInt();
		T = s.nextInt();	//초 단위
//		System.out.printf("%d %d %d %d", H, M, S, T);
		
		ST = T%60;
		value = T/60;
		MT = value%60;
		HT = value/60;
		
		H = H+HT;
		if(S+ST>=60)	{
			M++;
			S = (S+ST)%60;
		}else	{
			S = S+ST;
		}
		
		if(M+MT>=60)	{
			H++;
			M = (M+MT)%60;
		}else	{
			M = M+MT;
		}
		
		if(H>=24)	{
			H = H%24;
		}
		
		System.out.printf("%d %d %d", H, M, S);
		s.close();
	}

}
