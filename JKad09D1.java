/*
課題名JKad09D
作成日:2022/05/12
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad09D1{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.print("ひとつめの整数を入力してください＞");
			int a = in.nextInt();
			System.out.print("ふたつめの整数を入力してください＞");
			int b = in.nextInt();
			
			if (a>=b){
				System.out.print("ふたつの数字で大きい方は"+a+"です！");
		
			}
			if (b>a){
				System.out.print("ふたつの数字で大きい方は"+b+"です！");
		
			}
		
		}
	}
	