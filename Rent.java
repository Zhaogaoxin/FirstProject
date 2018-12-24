package cn.kgc.lei.zulin;

import javax.swing.text.StyledEditorKit.ForegroundAction;

//汽车租赁类
public class Rent {
	/**
	 * 初始化数据
	 * */
	private Vehicle[] velist=new Vehicle[8];
	private void init(){//数组运用
		velist[0]=new Car( "X6", "京NY28588", "宝马", 800);
		velist[1]=new Car( "550i", "京CNY3284", "宝马", 600);
		velist[2]=new Car( "林荫大道", "京NT37465", "别克", 300);
		velist[3]=new Car( "GL8", "京NT96968", "别克", 800);
		velist[4]=new Bus( 16, "京6566754", "金杯", 800);
		velist[5]=new Bus( 16, "京8696997", "金龙", 800);
		velist[6]=new Bus( 34, "京9696996", "金杯", 1500);	
		velist[7]=new Bus( 34, "京8696998", "金龙", 1500);
	}
	
	/**
	 * 根据不同的参数获取不同的车
	 * */
	public Vehicle getCar(String brand,String type,int seat){
		init();
		Vehicle ve=null;
		for (Vehicle v : velist) {
			//判断v是否属于car对象
			if(v instanceof Car){
				Car c=(Car)v;
				if(c.getBrand().equals(brand) && c.getType().equals(type)){
					ve=c;//向上转型，
					break;
				}
			}
			if(v instanceof Bus){//客车    轿车类判断属于并列关系 
				Bus b=(Bus)v;
				if(b.getBrand().equals(brand) && b.getSeat()==seat){
					ve=b;//向上转型，
					break;
				}
			}
		}
		return ve;//返回父类值
	}
	/**
	 * 计算租金
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
		
	}//构造器使用
}
