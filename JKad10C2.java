/*
課題名JKad10C2
作成日:2022/05/16
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad10C2{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			final int IE=1;
			final int SK=2;
			final int SE=3;
			System.out.println("こんにちは！");
			System.out.println("私はスーパーティーチャー、ECCエクセントよ！");
			System.out.print("あなたのコースを教えてね！(1:IE, 2:SK, 3:SE)>");
			int a = in.nextInt();
			
			if ((a!=IE)&&(a!=SK)&&(a!=SE)){
				System.out.print("ちゃんと答えてね");
			}else{
				
				System.out.print("ITのカレッジの学生ね！");
			}
		}
	}