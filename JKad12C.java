/*
課題名JKad12C
作成日:2022/05/23
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad12C{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.print("1より大きい整数を入力してください＞");
			int s = in.nextInt();
			int i=0;
			while (s>0){
			 i=s+i;
			 s--;
			}
			System.out.print("合計は"+i+"です！");
		}
	}
