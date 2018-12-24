package cn.kgc.lei.zulin;

import javax.swing.text.StyledEditorKit.ForegroundAction;

//����������
public class Rent {
	/**
	 * ��ʼ������
	 * */
	private Vehicle[] velist=new Vehicle[8];
	private void init(){//��������
		velist[0]=new Car( "X6", "��NY28588", "����", 800);
		velist[1]=new Car( "550i", "��CNY3284", "����", 600);
		velist[2]=new Car( "������", "��NT37465", "���", 300);
		velist[3]=new Car( "GL8", "��NT96968", "���", 800);
		velist[4]=new Bus( 16, "��6566754", "��", 800);
		velist[5]=new Bus( 16, "��8696997", "����", 800);
		velist[6]=new Bus( 34, "��9696996", "��", 1500);	
		velist[7]=new Bus( 34, "��8696998", "����", 1500);
	}
	
	/**
	 * ���ݲ�ͬ�Ĳ�����ȡ��ͬ�ĳ�
	 * */
	public Vehicle getCar(String brand,String type,int seat){
		init();
		Vehicle ve=null;
		for (Vehicle v : velist) {
			//�ж�v�Ƿ�����car����
			if(v instanceof Car){
				Car c=(Car)v;
				if(c.getBrand().equals(brand) && c.getType().equals(type)){
					ve=c;//����ת�ͣ�
					break;
				}
			}
			if(v instanceof Bus){//�ͳ�    �γ����ж����ڲ��й�ϵ 
				Bus b=(Bus)v;
				if(b.getBrand().equals(brand) && b.getSeat()==seat){
					ve=b;//����ת�ͣ�
					break;
				}
			}
		}
		return ve;//���ظ���ֵ
	}
	/**
	 * �������
	 */
	public double price(int days,String brand,String type, int seat){
	Vehicle ve=null;
	ve=getCar(brand , type, seat);
	double prices=ve.getDayPrices()*days;
	if(ve instanceof Car){
		if(days>150){
			prices*=0.7;
			
		}else if(days>30){
			prices*=0.8;
		}else if(days>7){
			prices*=0.9;
		}	
	}
 	if(ve instanceof Bus){
 		if(days>=150){
 			prices*=0.6;
 		}else if(days>=30){
 			prices*=0.7;
 		}else if(days>=7){
 			prices*=0.8;
 		}else if(days>=3){
 			prices*=0.9;
 		}
 	}	
		return prices;
		
	}//������ʹ��
}
