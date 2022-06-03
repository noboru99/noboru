/*
課題名JKad15X
作成日:2022/06/02
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad15X {
		public static void dekisugi(int v, int h){
			System.out.println("これはなかなか手ごわいぞ");
			System.out.println("とりあえず1回割って、それぞれをまた割って、全部"+breakoff(v,h));	
			
		}
		public static void sizuka(int v, int h){
			System.out.println("そんな簡単よ");
			System.out.println("1回割れば○○全部"+v*h+"個にするには"+(v*h-1)+"回だ");	
		}
		public static int breakoff(int v, int h){
			int dh;//縦の値 divide heigth
			dh=v; 
			int dw;//縦の値 divide width
			dw=h;
			int vw;//縦の加算式を入れる
			vw=0;
			int hw;//横の加算式を入れる
			hw=0;
			while (dh>1){
				dh=dh-1;
				vw++;       //1個ずつ分けて加算する
				if (dh==1){
					vw=vw*dw;//縦で分けたらそれを横の分をかける
					break;
				}
			}
			while (dw>1){
				dw=dw-1;
				hw++;  //横の分を分けて加算する
				if (dw==1){
					break;
				}
			}
			int sum;
			sum=vw+hw;//縦で分ける分と横で分けた分をたす
		return sum;
		
		}
		
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("板チョコを割っていきます");
			System.out.print("縦のブロックはいくつですか");
			int length = in.nextInt(); 
			System.out.print("横のブロックはいくつですか");
			int width = in.nextInt(); 
			System.out.print("誰が試合を計算しますか(1:出木杉くん, それ以外:しずか)");
			int num = in.nextInt(); 
			if (num==1){
				dekisugi(length,width);
			}
			if (num==2){
				sizuka(length,width);
			}
		}
		
	}