package sqatests;

public class Car {
	
	public String color;
	private String model;
	private int year;
	
	public static String type = "CAR_2019";
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void drive() {
		//drive
		System.out.println("driving....");
	}
	
	public void stop() {
		System.out.println("Stopped");
	}
	
	public void horn() {
		System.out.println("honk.....");
	}
	
	public static String typeName() {
		return type;
	}


}
