/*
課題名JKadRen11
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad11D{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			
			System.out.print("ひとつめの整数を入力してください＞");
			int a = in.nextInt();
			System.out.print("ふたつめの整数を入力してください＞");
			int b = in.nextInt();
			System.out.print(a+"+"+b+"の答えを入力してください＞");
			int c = in.nextInt();
			
			boolean correct = (c==a+b);
			
			if (correct){
				System.out.println("判定は・・・"+correct);
				System.out.print("正解です！");
			}else{
				System.out.println("判定は・・・"+correct);
				System.out.print("不正解です！");
				}
		}
	}