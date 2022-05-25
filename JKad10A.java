/*
課題名JKad10A
作成日:2022/05/16
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad10A{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			
			System.out.println("そうだ！動物園に行こう！");
			System.out.print("何人で行きますか？＞");
			int s = in.nextInt();
			System.out.print("あなたの年齢を入力してください＞");
			int a = in.nextInt();
			
			
			if(a>=15 && s<30){
				System.out.print("大人料金：500円になります！");
			}
			if(a>=15 && s>=30&&s<50){
				System.out.print("大人料金：450円になります！");
			}
			if(a>=15 && s>=50){
				System.out.print("大人料金：400円になります！");
			}
			
			if(6<=a&&a<15 &&  s<30 ){
				System.out.print("子供の料金：200円になります！");
			}
			if(6<=a&&a<15 && s>=30&&s<50 ){
				System.out.print("子供の料金：180円になります！");
			}
			if(6<=a&&a<15 && s>=50 ){
				System.out.print("子供の料金：160円になります！");
			}
			
			if(a<6){
				System.out.print("無料です！");
			}
		}
	}