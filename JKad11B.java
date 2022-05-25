/*
課題名JKad11B
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad11B{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.println("そうだ！水族館へ行こう！");
			System.out.print("あなたの年齢を入力してください＞");
			int a = in.nextInt();
			
			if (a >=65){
				System.out.print("シニア料金：2200円になります！");
			}else if (a>=15){
				System.out.print("大人料金：2400円になります！");
			}else if (a>=6){
				System.out.print("子ども料金：1200円になります！");
			}else if (a>=3){
				System.out.print("幼児料金：600円になります！");
			}else{
				System.out.print("未就学児料金：無料です！！");
			}
		}
	}