/*
�ۑ薼JKad10A
�쐬��:2022/05/16
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad10A{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			
			System.out.println("�������I�������ɍs�����I");
			System.out.print("���l�ōs���܂����H��");
			int s = in.nextInt();
			System.out.print("���Ȃ��̔N�����͂��Ă���������");
			int a = in.nextInt();
			
			
			if(a>=15 && s<30){
				System.out.print("��l�����F500�~�ɂȂ�܂��I");
			}
			if(a>=15 && s>=30&&s<50){
				System.out.print("��l�����F450�~�ɂȂ�܂��I");
			}
			if(a>=15 && s>=50){
				System.out.print("��l�����F400�~�ɂȂ�܂��I");
			}
			
			if(6<=a&&a<15 &&  s<30 ){
				System.out.print("�q���̗����F200�~�ɂȂ�܂��I");
			}
			if(6<=a&&a<15 && s>=30&&s<50 ){
				System.out.print("�q���̗����F180�~�ɂȂ�܂��I");
			}
			if(6<=a&&a<15 && s>=50 ){
				System.out.print("�q���̗����F160�~�ɂȂ�܂��I");
			}
			
			if(a<6){
				System.out.print("�����ł��I");
			}
		}
	}