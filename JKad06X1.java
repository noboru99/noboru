/*
課題名JKad06X1
作成日:2022/04/21
作成者：ふじたのぼる
*/
import java.util.Scanner;
public class JKad06X1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
			System.out.println("こんにちは！");
			System.out.println("私は占いマシーンのECC１０００よ！");
			System.out.println("あなたのことを占ってあげますわ！よろしくね！");
			
			System.out.print("あなたのお名前は？＞");
			String s=in.next();
			System.out.print("年齢はいくつ？＞");
			int count = in.nextInt();	
			
			System.out.println(s+"さんこんにちは！");
			System.out.println(count+"歳なのね！");
			
			System.out.println(s+"さんの今日の運勢は");
			
			double d=Math.random();
			
			
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			int c=(int)(Math.random()*100);
			System.out.println("ラブ運は"+a);
			System.out.println("金銭運は"+b);
			System.out.println("全体運は"+c);
			
	}
}