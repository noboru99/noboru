/*
課題名JKad04B
作成日:2022/04/21
作成者：ふじたのぼる
*/

import java.util.Scanner;
public class JKad04B{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("いくつまでたしあわせますか？");
		int s = in.nextInt();
			
		System.out.print("1から"+s+"まで足し合わせるとー"+(s+1)*s/2+"になりました");
		
	}
}
		