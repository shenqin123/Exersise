package two;

import java.util.Scanner;

public class FirstDemo {
	public static void main(String[] args) {
		System.out.println("请输入工资:");
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		int oversalary=salary-3500;
		double money;
		if(oversalary<0){
			System.out.println("您的工资不需要纳税！");
		}
		else if(0<oversalary||oversalary<1500){
			money=3500*0.03;
			System.out.println("所需缴纳的税费为："+money);
		}
		else if(oversalary>1500||oversalary<4500){
			money=3500*0.03+1500*0.03+(oversalary-1500)*0.1;
			System.out.println("所需缴纳的税费为："+money);
		}
		else if(oversalary>4500||oversalary<9000){
			money=3500*0.03+1500*0.03+3000*0.1+(oversalary-4500)*0.2;
			System.out.println("所需缴纳的税费为："+money);
		}
		else if(oversalary>9000||oversalary<35000){
			money=3500*0.03+1500*0.03+3000*0.1+5000*0.2+(oversalary-9000)*0.25;
			System.out.println("所需缴纳的税费为："+money);
		}
		else if(oversalary>35000||oversalary<55000){
			money=3500*0.03+1500*0.03+3000*0.1+5000*0.2+27000*0.3+(oversalary-35000)*0.30;
			System.out.println("所需缴纳的税费为："+money);
		}
		else if(oversalary>55000||oversalary<80000){
			money=3500*0.03+1500*0.03+3000*0.1+5000*0.2+27000*0.3+20000*0.35+(oversalary-55000)*0.35;
			System.out.println("所需缴纳的税费为："+money);
		}
		else if(oversalary>800000){
			money=3500*0.03+1500*0.03+3000*0.1+5000*0.2+27000*0.3+20000*0.35+25000*0.35+(oversalary-55000)*0.45;
			System.out.println("所需缴纳的税费为："+money);
		}
		
	}
}
