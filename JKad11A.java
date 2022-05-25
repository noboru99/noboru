/*
課題名JKad11B
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad11A{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.println("そうだ！動物園へ行こう！");
			System.out.print("何人で行きますか？＞");
			int n = in.nextInt();
			System.out.print("あなたの年齢を入力してください＞");
			int a= in.nextInt();
			
			if (a>=15){
				if (n>=50){
						System.out.print("大人料金：400円になります！");
				}else if (n>=30){
					System.out.print("大人料金：450円になります！");
				}else {
					System.out.print("大人料金：500円になります！");
				}
			}
			else if (a>=6){
					if (n>=50){
							System.out.print("子供料金：160円になります！");
					}else if (n>=30){
						System.out.print("子供料金：180円になります！");
					}else if (n<30){
						System.out.print("子供料金：200円になります！");
					}
				}else{
					System.out.print("未就学児：無料です！");
				}
		
		}
	}