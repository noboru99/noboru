/*
�ۑ薼JKad12C
�쐬��:2022/05/23
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad12C{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.print("1���傫����������͂��Ă���������");
			int s = in.nextInt();
			int i=0;
			while (s>0){
			 i=s+i;
			 s--;
			}
			System.out.print("���v��"+i+"�ł��I");
		}
	}
