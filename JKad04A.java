/*
�ۑ薼JKad04A
�쐬��:2022/04/21
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
public class JKad04A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�����ԍ�����͂��Ă�������");
		int s = in.nextInt();
		
		System.out.print("��̈�");	System.out.println(s%10-s%1);
		System.out.print("�\�̈�");	System.out.println((s%100-s%10)/10);
		System.out.print("�S�̈�");	System.out.println((s%1000-s%100)/100);
		System.out.print("��̈�");	System.out.println((s%10000-s%1000)/1000);
						
	}
}
