/*
�ۑ薼JKad12A1
�쐬��:2022/05/19
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad12A1{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.print("�ЂƂ߂̐�������͂��Ă���������");
			int a = in.nextInt();
			
			System.out.print("�ӂ��߂̐�������͂��Ă���������");
			int b = in.nextInt();
						
			int change ;
			
			while (true){	
			 if(a>b){
			   	a=a-b;
			 } else {
			 	if (b>a){
					change = a;
					a=b;
					b=change;
					
					a=a-b;
				} if (a==b)break;
			 }
		}
			
			System.out.println("�ő���񐔂�"+a+"�ł��I");
			
		}
	}
	
	
	/*
	change = a:
	b = change:
	a = b 
	
	*/