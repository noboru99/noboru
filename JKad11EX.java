/*
課題名JKad11EX
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad11EX{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			
			int week;
			int time;
			
			System.out.println("曜日を入力してください＞");
			System.out.print("0:日曜1:月曜2:火曜3:水曜4:木曜5:金曜6:土曜>");
			int week = in.nextInt()
			
			System.out.print("時間帯を入力してください＞");
			System.out.print("0=午前、1=午後、2=夜間＞");
			int time = in.nextInt();
		}
		
	}