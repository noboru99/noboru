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
			//System.out.println("1回割れば○○全部"+(v*h)-1);	
		}
		public static int breakoff(int v, int h){
			int va;//商
			va=v; 
			int ha;//商
			ha=h;
			int vw;//余り
			vw=0;
			int hw;//余り
			hw=0;
			while (va>1){
				va=va-1;
				vw++;
				if (va==1){
					vw=vw*ha;
					break;
				}
			}
			while (ha>1){
				ha=ha-1;
				hw++;
				if (ha==1){
					break;
				}
			}
			int sum;
			sum=vw+hw;
		return sum;
		
		}
		
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("板チョコを割っていきます");
			System.out.println("縦のブロックはいくつですか");
			int length = in.nextInt(); 
			System.out.println("横のブロックはいくつですか");
			int width = in.nextInt(); 
			System.out.println("誰が試合を計算しますか(1:出木杉くん, それ以外:しずか)");
			int num = in.nextInt(); 
			if (num==1){
				dekisugi(length,width);
			}
		}
		
	}