/*
課題名JKad09A
作成日:2022/05/12
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad09A{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.print("のび太の点数を入力してください＞");
			int a = in.nextInt();
			System.out.print("しずかちゃんの点数を入力してください＞");
			int b = in.nextInt();
			System.out.print("ジャイアンの点数を入力してください＞");
			int c = in.nextInt();
			System.out.print("スネ夫の点数を入力してください＞");
			int d = in.nextInt();
			System.out.print("出木杉の点数を入力してください＞");
			int e = in.nextInt();
			int max = a;
			if (b>max){
					max=b;
			}
			if (c>max){
				max=c;
			}
			if (d>max){
				max=d;
			}
			if (e>max){
				max=e;
			}
			System.out.print("一番高い点数は"+max+"です");
		}
	}