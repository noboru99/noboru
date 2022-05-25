/*
課題名JKad10S
作成日:2022/05/16
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad10S{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			final int IE=1;
			final int SK=2;
			final int SE=3;
			System.out.println("こんにちは！");
			System.out.println("私はスーパーティーチャー、ECCエクセントよ！");
			System.out.print("あなたのコースを教えてね！(1:IE, 2:SK, 3:SE)>");
			int a = in.nextInt();
			
			if ((a==IE)||(a==SK)||(a==SE)){
				
				System.out.print("今何年生？");
				int s = in.nextInt();
				
				if(a==IE){
					if(4>=s&&s>=1){		
				System.out.print("ITのカレッジの学生さん、よろしくね！");
				}else {
				System.out.print("IEは4年のコースよ！");
				}
				}
				
				if(a==SK){
					if(3>=s&&s>=1){
					System.out.print("ITのカレッジの学生さん、よろしくね！");
				}else{ 
					System.out.print("SKは3年のコースよ！");
				}
				}
				if(a==SE){
					if(2>=s&&s>=1){
					System.out.print("ITのカレッジの学生さん、よろしくね！");
				}else{ 
					System.out.print("SEは2年のコースよ！");
				}
				}
	
				
			}else{
				System.out.print("ちゃんと答えてね！");
			}	
		}
	}