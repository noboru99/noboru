/*
課題名JKad08S3
作成日:2022/04/21
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad08S3{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.print("現在の時刻(時)を入力してください (0-23)＞");
			int a = in.nextInt();
			System.out.print("現在の時刻(分)を入力してください (0-23)＞");
			int b = in.nextInt();
			System.out.print("授業終了の時刻(時)を入力してください (0-23)＞");
			int c = in.nextInt();
			System.out.print("授業終了の(分)を入力してください (0-23)＞");
			int d = in.nextInt();
			
			int	z=(c*60+d)-(a*60+b);
			z=(z+60*24)%(60*24); //意味わからん
			
			int x;
			x=z/60;
			int y;
			y=z%60;
			
			
			
			System.out.print("あと"+x+"時間"+y+"分、頑張って！");
		}
	}