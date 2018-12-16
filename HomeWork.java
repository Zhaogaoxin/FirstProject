package cn.kcg.test;

//public class HomeWork {
//	public static void main(String[] args){
//	double xiaoshu=123.5678;
//	//xiaoshu=xiaoshu*10000;
//	int zhengshu=(int)(xiaoshu*10000);//小数转换成整数
//	System.out.println(zhengshu);
//	for(int i=1;i<=2;i++){
//		if(zhengshu%10>=5){//整数取模10，如果余数大于5，
//			zhengshu=zhengshu/10+1;//把整数取模10+1重新赋给整数
//		}else{//如果整数取模10，余数小于5，
//			zhengshu=zhengshu/10;
//		}
//		System.out.println(zhengshu);
//	}
//		xiaoshu=(double)zhengshu;
//		xiaoshu=xiaoshu/100;
//		System.out.println(xiaoshu);
//	}
//
//}
public class HomeWork{
	public static void main(String[] args){
		double xs=123.5678;//数据类型 变量名=数据；
		xs=xs*100;
		xs=(int)(xs+0.5);//加0.5看能不能四舍五入
		xs=xs/100;
		System.out.println(xs);
		
	}
}
