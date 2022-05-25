/*
課題名JKad09B
作成日:2022/05/12
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad09B{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
				System.out.print("ひとつめの整数を入力してください＞");
				int a = in.nextInt();
				System.out.print("ふたつめの整数を入力してください＞");
				int b = in.nextInt();
				
				System.out.print("誰が計算しますか(1:のび太	１以外:出木杉＞");
				int c = in.nextInt();
				
				if( c == 1){
						System.out.println("のび太が計算します");
						System.out.print(a+"÷"+b+"は"+(a/b)+"ですね");
							
				}else {
					System.out.println("出木杉が計算します");
						System.out.print(a+"÷"+b+"は"+((double)a/b)+"ですね");
				
				}
				
		}
	}