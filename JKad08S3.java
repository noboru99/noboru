/*
�ۑ薼JKad08S3
�쐬��:2022/04/21
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad08S3{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.print("���݂̎���(��)����͂��Ă������� (0-23)��");
			int a = in.nextInt();
			System.out.print("���݂̎���(��)����͂��Ă������� (0-23)��");
			int b = in.nextInt();
			System.out.print("���ƏI���̎���(��)����͂��Ă������� (0-23)��");
			int c = in.nextInt();
			System.out.print("���ƏI����(��)����͂��Ă������� (0-23)��");
			int d = in.nextInt();
			
			int	z=(c*60+d)-(a*60+b);
			z=(z+60*24)%(60*24); //�Ӗ��킩���
			
			int x;
			x=z/60;
			int y;
			y=z%60;
			
			
			
			System.out.print("����"+x+"����"+y+"���A�撣���āI");
		}
	}