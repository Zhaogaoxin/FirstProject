package cn.kgc.lei.zulin;
//汽车类
public class Vehicle {
	/**
	 * 车牌号
	 */
	private String carNumber;
	/**
	 * 车的种类
	 */
	private String brand;
	/**
	 * 车的日租金
	 */
	private double dayPrices;

	public Vehicle() {

	}

	public Vehicle(String carNumber, String brand, double dayPrices) {
		this.carNumber = carNumber;
		this.brand = brand;
		this.dayPrices = dayPrices;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getDayPrices() {
		return dayPrices;
	}

	public void setDayPrices(double dayPrices) {
		this.dayPrices = dayPrices;
	}

	@Override
	public String toString() {
		return "Vehicle [carNumber=" + carNumber + ", brand=" + brand + ", dayPrices=" + dayPrices + "]";
	}

}
