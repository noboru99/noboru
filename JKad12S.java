/*
課題名JKad12A2
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad12S{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			int c=(int)(Math.random()*100);
			System.out.println("数当てゲーム！");
			int i;
			i=1;
			while (true){
				
				System.out.print(i+"回目：数値を入力してください＞");
				int a = in.nextInt();
				if (a>c){
					System.out.println(a+"より小さいです！");
				}
				if (c>a){
					System.out.println(a+"より大きいです！");
				}if  (a==c){
					System.out.print("正解しました！"); break;
				}
				i++;
			}
		}
	}
			