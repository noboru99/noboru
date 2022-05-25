/*
課題名JKad11C2
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad11C2{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.println("そうだ！動物園へ行こう！");
			System.out.print("あなたの年齢を入力してください＞");
			int a = in.nextInt();
			
			if (a<6){
				System.out.print("未就学児：無料です！");
			}else if (a<15){
					System.out.print("子ども料金：200円になります！");
				}
				else{
					System.out.print("大人料金：500円になります！");
				}
			
		
		}
	}