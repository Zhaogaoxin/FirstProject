package cn.kgc.lei.zulin;
//轿车类
public class Car extends Vehicle {
	/**
	 * 汽车品牌
	 * */
	private String type;

	public Car() {
		
	}

	public Car(String type,String carNumber,String brand,double dayPrices) {
		super(carNumber, brand, dayPrices);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
