/*
�ۑ薼JKad12A2
�쐬��:2022/05/19
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad12S{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			int c=(int)(Math.random()*100);
			System.out.println("�����ăQ�[���I");
			int i;
			i=1;
			while (true){
				
				System.out.print(i+"��ځF���l����͂��Ă���������");
				int a = in.nextInt();
				if (a>c){
					System.out.println(a+"��菬�����ł��I");
				}
				if (c>a){
					System.out.println(a+"���傫���ł��I");
				}if  (a==c){
					System.out.print("�������܂����I"); break;
				}
				i++;
			}
		}
	}
			