/*
�ۑ薼JKad06S2
�쐬��:2022/04/21
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
public class JKad06S2{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("���a����͂��Ă���������:");
		double r =in.nextDouble();
		final double PI = 3.14159265;
		double a=4*PI*r*r;
		double b=(double)4/3*PI*r*r*r;
		System.out.print("���a��"+r+"���̕\�ʐς�"+a+"�̐ς�"+(((int)((b+0.00005)*10000))/(double)10000)+"�ł��I");
	}
}