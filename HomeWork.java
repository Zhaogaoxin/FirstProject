package cn.kcg.test;

//public class HomeWork {
//	public static void main(String[] args){
//	double xiaoshu=123.5678;
//	//xiaoshu=xiaoshu*10000;
//	int zhengshu=(int)(xiaoshu*10000);//С��ת��������
//	System.out.println(zhengshu);
//	for(int i=1;i<=2;i++){
//		if(zhengshu%10>=5){//����ȡģ10�������������5��
//			zhengshu=zhengshu/10+1;//������ȡģ10+1���¸�������
//		}else{//�������ȡģ10������С��5��
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
		double xs=123.5678;//�������� ������=���ݣ�
		xs=xs*100;
		xs=(int)(xs+0.5);//��0.5���ܲ�����������
		xs=xs/100;
		System.out.println(xs);
		
	}
}
