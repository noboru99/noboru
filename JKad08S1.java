/*
課題名JKad08S1
作成日:2022/04/21
作成者：ふじたのぼる
*/
import java.util.Scanner;
public class JKad08S1{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("Aさんの前を列車が通過します！");
			
			System.out.print("列車の速度（時速）を入力してください＞");
			int a = in.nextInt();
			System.out.print("列車の長さ（メートル）を入力してください＞");
			int b = in.nextInt();
			System.out.println((double)(b*3600)/(a*1000)+"秒かかります！");
			//ｂ=長さ　a＝時速
			
		}
}