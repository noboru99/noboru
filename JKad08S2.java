/*
課題名JKad08S2
作成日:2022/04/21
作成者：ふじたのぼる
*/
public class JKad08S2{
		public static void main(String[] args){
			int a=0;
			int b=1;
			int c ;
			int z=1;	
			
			System.out.println("第"+1+"項"+1);
			for(int i=0; i<8; i++)
			{
				
						
					c=a+b;
					a=b;
					b=c;
					z++;
			System.out.println("第"+z+"項"+c);
			}
			
		}
}