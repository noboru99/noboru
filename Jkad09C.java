/*
課題名JKad09C
作成日:2022/05/12
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class Jkad09C{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("ひとり一つずつリンゴをたべます!");
			System.out.print("リンゴの数を入力してください＞");
			int a = in.nextInt();
			System.out.print("食べる人の数を入力してください＞");
			int b = in.nextInt();
			if (b>a){
					System.out.print("リンゴの数が足りません！");
			
			} else{
			System.out.println("一つずつリンゴをたべました！");
			System.out.print("残ったリンゴの数は"+(a-b)+"です！");
			
			}
		}
	}