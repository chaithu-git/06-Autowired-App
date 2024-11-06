package in.chaithanya.beans;

public class Car {

	private DieselEngine dieselEngine;

	public void setDieselEnge(DieselEngine dieselEngine) {
		System.out.println("setDieselEnge().method Excuted....");
		this.dieselEngine = dieselEngine;
	}

	public Car() {
		System.out.println("Car ::0-Param Constructor");
	}
	public Car(DieselEngine dieselEngine) {
		System.out.println("Car ::Param Constructor");
		this.dieselEngine = dieselEngine;	
	}

	public void drive() {
		int start = dieselEngine.start();
		if (start >= 1) {
			System.out.println("journey Started......");
		} else {
			System.out.println("Engine Failed to Started......");
		}

	}

}
