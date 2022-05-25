/*
課題名JKad09X
作成日:2022/05/12
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad09X{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
				System.out.println("こんにちは！");
				System.out.println("私はスーパーティーチャー、ECCエクセントよ！");
				
				System.out.println("あなたのクラスを教えてくださいね！");
					System.out.print("1:SE, 2:SK, 3:SE, それ以外：わからない＞");
					int a = in.nextInt();
				if (a==1){
					System.out.print("4年制コースですね");
				}
				if (a==2){
					System.out.print("3年制コースですね");
				}
				if (a==3){
					System.out.print("2年制コースですね");
				}else{
					System.out.println("わからんのね！");	}
		}
	}
