/*
�ۑ薼JKad06X1
�쐬��:2022/04/21
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
public class JKad06X1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
			System.out.println("����ɂ��́I");
			System.out.println("���͐肢�}�V�[����ECC�P�O�O�O��I");
			System.out.println("���Ȃ��̂��Ƃ����Ă����܂���I��낵���ˁI");
			
			System.out.print("���Ȃ��̂����O�́H��");
			String s=in.next();
			System.out.print("�N��͂����H��");
			int count = in.nextInt();	
			
			System.out.println(s+"���񂱂�ɂ��́I");
			System.out.println(count+"�΂Ȃ̂ˁI");
			
			System.out.println(s+"����̍����̉^����");
			
			double d=Math.random();
			
			
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			int c=(int)(Math.random()*100);
			System.out.println("���u�^��"+a);
			System.out.println("���K�^��"+b);
			System.out.println("�S�̉^��"+c);
			
	}
}