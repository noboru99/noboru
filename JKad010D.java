/*
課題名JKad10D
作成日:2022/05/16
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad010D{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("そうだ！動物園に行こう！");
			System.out.print("あなたの年齢を入力してください＞");
			int a = in.nextInt();
			if(a<6){
				System.out.print("無料です！");
			}
			if((6<=a)&&(a<15)){
				System.out.print("子供の料金：200円になります！");
			}
			if(a>=15){
				System.out.print("大人料金：500円になります！");
			}
				
	}
}