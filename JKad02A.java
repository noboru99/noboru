/*
課題名JKad02A
作成日:2022/04/13
作成者：藤田　昇
*/
public class JKad02A{
	public static void main(String[] args){
		System.out.println("りんごが１０こあります");
		int apple = 10; //リンゴの数
		System.out.println(apple);
		
		System.out.println("人間が3人やってきました！");
		int person=3; //人間の数
		System.out.println(person);
		
		System.out.println("それぞれがたべたりんごの数は");
		int a=apple/person;
		
		System.out.println(a);
		
		System.out.println("残ったりんごのかずは");
		apple=apple%person;
		System.out.println(apple);
	}
}