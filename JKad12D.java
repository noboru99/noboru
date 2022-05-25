/*
課題名JKad12D
作成日:2022/05/23
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad12D{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.print("リンゴの数を入力してください＞");
			int apple = in.nextInt();
			
			System.out.print("食べる人の数を入力してください＞");
			int person = in.nextInt();
			int a=0;
			while (apple>person){
				System.out.println("ひとり一つずつリンゴを食べました！");
				apple-=person;
				a++;
			}
			System.out.println("それぞれ"+a+"個のリンゴをたべました！");
			System.out.println("残ったリンゴは"+apple+"個です！");
		}
	}