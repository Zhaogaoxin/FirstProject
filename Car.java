package cn.kgc.lei.zulin;
//�γ���
public class Car extends Vehicle {
	/**
	 * ����Ʒ��
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
