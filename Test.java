package cn.kgc.lei.zulin;

import java.util.Scanner;

//
public class Test {
	public static void main(String[] args) {
		Rent r=  new Rent();
		Scanner  sc=new Scanner(System.in);
		String brand="";
		String type="";
		int seat=0;
		

		do {
			System.out.println("****************欢迎光临小铁汽车租赁公司*******************");
			System.out.println("1、轿车 \t 2、客车 \t 3、结束程序");
			System.out.println("请选择你要租赁的汽车类型");
			int choice=sc.nextInt();
			switch (choice) {//switch语句；
			case 1:
				System.out.println("请输入品牌：1、宝马\t2、别克");
				choice=sc.nextInt();
				if(choice==1){//if语句；
				brand="宝马";
				System.out.println("请输入宝马车类型：1、X6\t2、550i");
				choice =sc.nextInt();	
				type=choice==1?"X6":"550i";//三目运算符；
					
					System.out.println("请输入租赁的天数");
					int days=sc.nextInt();
					double money=r.price(days, brand, type, seat);//计算总钱数
					Vehicle v=r.getCar(brand, type, seat);//获取单个车对象
					String carNumber=v.getCarNumber();//根据车对象获取车牌号
					System.out.println("您选择的车是："+brand+type+";车牌号是"+carNumber+";您的租金是"+money);
				
				}
				else if(choice==2){
					brand="别克";
					System.out.println("请输入别克车的类型：1、林荫大道\t2、GL8");
					choice=sc.nextInt();
					type=choice==1?"林荫大道":"GL8";
					System.out.println("请输入租赁的天数");
					int days=sc.nextInt();
					double money=r.price(days, brand, type, seat);//计算总钱数
					Vehicle v=r.getCar(brand, type, seat);//获取单个车对象
					String carNumber=v.getCarNumber();//根据车对象获取车牌号
					System.out.println("您选择的车是："+brand+type+";车牌号是"+carNumber+";您的租金是"+money);
				}
				break;
			case 2:
				System.out.println("请输入品牌：1、金杯\t2、金龙");
				choice=sc.nextInt();
				if(choice==1){
					brand="金杯";
					System.out.println("请输入金杯车座位数：1、16\t2、34");
					choice =sc.nextInt();	
					seat=choice==1?16:34;
						System.out.println("请输入租赁的天数");
						int days=sc.nextInt();
						double money=r.price(days, brand, type, seat);//计算总钱数
						Vehicle v=r.getCar(brand, type, seat);//获取单个车对象
						String carNumber=v.getCarNumber();//根据车对象获取车牌号
						System.out.println("您选择的车是："+brand+";车牌号是"+carNumber+";您的租金是"+money);
					
					}
				if(choice==2){
					brand="金龙";
					System.out.println("请输入金龙车座位数：1、16\t2、34");
					choice =sc.nextInt();	
					seat=choice==1?16:34;
						System.out.println("请输入租赁的天数");
						int days=sc.nextInt();
						double money=r.price(days, brand, type, seat);//计算总钱数
						Vehicle v=r.getCar(brand, type, seat);//获取单个车对象
						String carNumber=v.getCarNumber();//根据车对象获取车牌号
						System.out.println("您选择的车是："+brand+seat+";车牌号是"+carNumber+";您的租金是"+money);
					
					}
				break;
			case 3:
				
				return;//return的运用，结束方法

			default:
				System.out.println("输入不正确，请重新输入");
				break;
			}

		
		
		
		
		
		}while(true);
	
	}
}
