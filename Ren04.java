/*
課題名
作成日:2022/04/21
作成者：ふじたのぼる
*/
import java.util.Scanner;
public class Ren04{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("今日は何回目:");
		int count = in.nextInt();
		System.out.println("今日は"+count+"回目の授業です");
		in.close();
		
	}
}
		