/*
�ۑ薼JKad05C3
�쐬��:2022/04/25
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
public class JKad05B{
		public static void main(String[] args){
			final int COFFEE = 290;
			
			
			int tax;
			tax	=((int)(COFFEE*0.08));
		
					
			int total;
			total= tax+COFFEE;
			
			System.out.println("�悤�����IECC�R�[�q�[�� �������A��ł��ˁI �R�[�q�["
			+COFFEE+"�~�A����ł�"+((int)tax)+"�~�ō��v"+((int)total)+"�~�ɂȂ�܂��I");
			System.out.println("���肪�Ƃ��������܂����I");
		}
}