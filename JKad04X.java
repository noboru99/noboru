/*
課題名JKad04X
作成日:2022/04/21
作成者：ふじたのぼる
*/
		import java.util.Scanner;
public class JKad04X1{
	public static void main(String[] args){
Scanner in = new Scanner(System.in);
		System.out.print("0から２５５までの整数を入力してください＞");
		
		int s = in.nextInt();
			System.out.println("最上位ビットから順に表示します！");
			for(int a=0; a<9; a++){
			String i= "" + (s%2);
			s/=2;
			i= (s%2)+i;
				System.out.print(i);
			in.close();
			}
			
	}
}