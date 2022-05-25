/*
課題名JKad10B
作成日:2022/05/16
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad10B{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.println("そうだ！水族館へ行こう！");
			System.out.print("あなたの年齢を入力してください＞");
			int a = in.nextInt();
			
			if(a>=65){
				System.out.print("シニア料金：2200円になります！");
			}
			if(a>=15&&a<65){
				System.out.print("大人料金：2400円になります！");
			}
			if(a>=6&&a<15){
				System.out.print("子ども料金：1200円になります！");
			}
			if(a>=3&&a<6){
				System.out.print("幼児料金：600円になります！");
			}
			if(a<3){
				System.out.print("無料です！");
			}
		}
	}