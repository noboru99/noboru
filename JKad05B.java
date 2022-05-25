/*
課題名JKad05C3
作成日:2022/04/25
作成者：ふじたのぼる
*/
import java.util.Scanner;
public class JKad05B{
		public static void main(String[] args){
			final int COFFEE = 290;
			
			
			int tax;
			tax	=((int)(COFFEE*0.08));
		
					
			int total;
			total= tax+COFFEE;
			
			System.out.println("ようこそ！ECCコーヒーへ お持ち帰りですね！ コーヒー"
			+COFFEE+"円、消費税が"+((int)tax)+"円で合計"+((int)total)+"円になります！");
			System.out.println("ありがとうございました！");
		}
}