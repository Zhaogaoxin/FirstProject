package cn.kgc.lei.zulin;
//�ͳ���
public class Bus extends Vehicle {
	/**
	 * ��λ��
	 * */
	private int seat;

	public Bus() {
	
	}

	public Bus(int seat,String carNumber, String brand, double dayPrices) {
		super(carNumber, brand, dayPrices);
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	

}
