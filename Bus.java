package cn.kgc.lei.zulin;
//客车类
public class Bus extends Vehicle {
	/**
	 * 座位数
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
