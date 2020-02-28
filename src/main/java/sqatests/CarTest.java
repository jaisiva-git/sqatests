package sqatests;

import java.util.HashMap;
import java.util.Map;

public class CarTest {

	public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car();
		
		String clr = a.getColor();
		
		System.out.println("color = " + clr);
		
		a.setColor("silver");
		a.setModel("Toyota");
		
		b.setColor("gray");
		b.setModel("Honda");
		
		System.out.println("a color = " + a.getColor());
		System.out.println("b color = " + b.getColor());
		
		System.out.println("type: " + Car.typeName());
		
		String t = Car.type;
		
		
		Map<String, Car> carMap = new HashMap<>();
		carMap.put("silver", a);
		carMap.put("gray", b);
		
		
		//get model by color
		System.out.println("carmap: " + carMap);
		
		
		System.out.println("silver car model: " + carMap.get("silver").getModel());
		System.out.println("gray car model: " + carMap.get("gray").getModel());
	}
}
