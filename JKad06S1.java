/*
�ۑ薼JKad06S1
�쐬��:2022/04/13
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad06S1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ЂƂ߂̐�������͂��Ă���������");
		int n1 = in.nextInt();
		System.out.print("�ӂ��߂̐�������͂��Ă���������");
		int n2 = in.nextInt();
		System.out.println("�̂ё����v�Z���܂��I");
		System.out.println(n1+"��"+n2+"��"+n1/n2+"�ł��I");
		System.out.println("�o�ؐ����񂪌v�Z���܂��I");
		
		System.out.println(n1+"��"+n2+"��"+(double)n1/(double)n2+"�ł��I");
		in.close();
	}
}