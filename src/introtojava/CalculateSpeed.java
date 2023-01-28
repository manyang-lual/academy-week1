package introtojava;

import java.util.Scanner;
public class CalculateSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter distance in meters");
		String str= obj.nextLine();
		double speedMeters=Double.parseDouble(str);
		double speedKM=speedMeters/1000;
		double speedMiles = speedMeters/1606;
		
		System.out.println("Enter hour in this format: HH:MM:SS");
		String hour=obj.nextLine();
		
		String[] split = hour.split(":");
		
		double hr=Double.parseDouble(split[0]);
		double min=Double.parseDouble(split[1]);
		double sec=Double.parseDouble(split[2]);
		
		double totalSecond = hr*3600+min*60+sec;
		double totalMin = hr*60+min*60+sec/60;
		double totalHr = hr+min/60+sec/3600;
		
		System.out.println("Your speed in meters/second is "+(speedMeters/totalSecond));
		System.out.println("Your speed in km/hr is "+(speedKM/totalHr));
		System.out.println("Your speed in meters/second is "+(speedMiles/totalHr));
		
		obj.close();
	}

}
