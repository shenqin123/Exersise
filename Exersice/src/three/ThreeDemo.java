package three;

import java.util.Scanner;

public class ThreeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("�����꣺");
			int year =sc.nextInt();
			System.out.print("�����£�");
			int month =sc.nextInt();
			System.out.print("�����գ�");
			int  day =sc.nextInt()+1;
		  if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
				System.out.println("����������������룡"); 
							}
		  else{
			  System.out.println("��һ����:"+year+"-"+month+"-"+day);
		  }
	}
}
