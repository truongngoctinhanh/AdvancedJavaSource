package Task16;
/**
 * Author: Truong Ngoc Tinh Anh  
 * Date: 23- 08 -2016
 * Version: 1.0
 * Main for management of vehicle
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;

public class MainForManagementVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int check = 1;
			Car[] listCar = new Car[0];
			Ship[] listShip = new Ship[0];
			//Enter information of vehicle
			while(check == 1){
				System.out.println("Enter name: ");
				String name = buff.readLine();
				System.out.println("Enter owner: ");
				String owner = buff.readLine();
				System.out.println("Enter manufacturer: ");
				String manufacturer = buff.readLine();
				System.out.println("Enter color: ");
				String color = buff.readLine();
				System.out.println("Enter distance: ");
				double distance = Double.parseDouble(buff.readLine());
				System.out.println("Enter fuel consumption: ");
				double fuelConsumption = Double.parseDouble(buff.readLine());
				System.out.println("Enter time: ");
				double time = Double.parseDouble(buff.readLine());
				MovingByFuel moveFuel = new MovingByFuel(distance, fuelConsumption);
				MovingByTime moveTime = new MovingByTime(distance, time);
				
				//Choose type of vehicle
				System.out.println("Press 1: Car");
				System.out.println("Press 2: Ship");
				System.out.println("Please choice 1 or 2");
				int rep = Integer.parseInt(buff.readLine());
				if (rep != 1 && rep != 2) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
				
				//Enter separate information of each vehicle
				switch (rep) {
					case 1:
						System.out.println("Enter gear type: ");
						String gear = buff.readLine();
						System.out.println("Enter type of car: ");
						String type = buff.readLine();
						Car car = new Car(name, manufacturer, color, owner, gear, type);
						car.setTime(moveTime);
						car.setFuel(moveFuel);
						listCar = Arrays.copyOf(listCar, listCar.length + 1);
						listCar[listCar.length - 1] = car;
						break;
					case 2:
						System.out.println("Enter weight: ");
						double weight = Double.parseDouble(buff.readLine());
						System.out.println("Enter capacity: ");
						double capacity = Double.parseDouble(buff.readLine());
						System.out.println("Enter down - stream: ");
						double downStream = Double.parseDouble(buff.readLine());
						System.out.println("Enter up - stream: ");
						double upStream = Double.parseDouble(buff.readLine());
						System.out.println("Enter consume fuel start: ");
						double fuelStart = Double.parseDouble(buff.readLine());
						System.out.println("Enter fuel type: ");
						String fuelTye = buff.readLine();
						Ship ship = new Ship(name, manufacturer, color, owner, weight, capacity, downStream, upStream, fuelStart, fuelTye);
						ship.setTime(moveTime);
						ship.setFuel(moveFuel);
						listShip = Arrays.copyOf(listShip, listShip.length + 1);
						listShip[listShip.length - 1] = ship;
						break;
						
					default:
						System.out.println("Please choice 1 or 2");
				}
				
				//Choose if you continue
				System.out.println("Press 1: Continue");
				System.out.println("Press 2: Quit");
				System.out.println("Please choice 1 or 2");
				int reply = Integer.parseInt(buff.readLine());
				if (reply != 1 && reply != 2) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
				if(reply != 1)
					check = 0;
			}
			
			//Display result speed and fuel consumption of car
			if(listCar.length > 0){
				for(Car car : listCar){
					System.out.println("Speed of car: " + car.calSpeed());
					System.out.println("Fuel consumption: " + car.calConsumeFuel());
				}
			}
			
			//Display result speed and fuel consumption of ship
			if(listShip.length > 0){
				for(Ship ship : listShip){
					System.out.println("Speed of ship: " + ship.calSpeed());
					System.out.println("Fuel consumption: " + ship.calConsumeFuel());
				}
			}
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
