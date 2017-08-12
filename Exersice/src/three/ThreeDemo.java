package three;

import java.util.Scanner;

public class ThreeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("输入年：");
			int year =sc.nextInt();
			System.out.print("输入月：");
			int month =sc.nextInt();
			System.out.print("输入日：");
			int  day =sc.nextInt()+1;
		  if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
				System.out.println("输入错误，请重新输入！"); 
							}
		  else{
			  System.out.println("下一天是:"+year+"-"+month+"-"+day);
		  }
	}
}
