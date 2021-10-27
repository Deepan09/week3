package week3.day1;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle vehObj=new Vehicle();            //create object to use methods in class
vehObj.accelerateVehicle();
vehObj.applyBreak();
System.out.println("*******call for vehicle********");
 Car carObj=new Car();
 carObj.driveVehicle();
 int carWheels = carObj.carWheels;
 System.out.println("no of wheeels in car: " +carWheels);
 System.out.println("********call for car******");
 
	}

}


