import java.util.*;

public class TemperatureReadingsApp
{
	 public static void main(String[] args)
	 {
	     double[ ] temperature = new double[7]; //7 days of the week variable
	     enterTemps(temperature); //calling methods from main
	     displayTemps(temperature); 
	     wasHot(temperature);
	     convertToFarenheit(temperature);
	 }
	
	 static void enterTemps(double[] temperatureIn)
	 {
	     Scanner keyboard = new Scanner(System.in); //scanner for input
	     for (int i = 0; i < temperatureIn.length; i++) //print temp only for day1-7
	     {
	         System.out.print("enter max temperature for day " + (i+1)+ ": ");
	         temperatureIn[i] = keyboard.nextDouble(); //user inputs temp
	     }
	     keyboard.close(); //close scanner
	 }
	
	 static void displayTemps(double[] temperatureIn)
	 {
	     System.out.println(); 
	     System.out.println("***TEMPERATURES ENTERED***");
	     for (int i = 0; i < temperatureIn.length; i++)
	     {
		      System.out.println("day "+(i+1)+" "+ temperatureIn[i]); //display temp 
	     }															//for day 1-7
	 }
	 
	static void wasHot(double[] temperatureIn) {
		 System.out.println("*** 18 DEGREES OR ABOVE ***");
		 
	     for (int i = 0; i < temperatureIn.length; i++) //display temp for day1-7
	    	 if (temperatureIn[i] >= 18) //if temp is bigger or equal to 18
		 {
			 System.out.println("day " +(i+1)+" " + temperatureIn[i]); //print temp for those days
			 
		 }
	 } 
	
	static void convertToFarenheit(double[] temperatureIn) {
		double farenheit; //farenheit variable (double)
		
		System.out.println("*** CELCIUS TO FARENHEIT ***");
		
		for (int i = 0; i < temperatureIn.length; i++) //days 1-7
		{
			farenheit = (temperatureIn[i] * 9) / 5 + 32; //Farenheit = (Celsius*9/5)+32
			System.out.println("day " +(i+1)+" " + farenheit); //print temp day1-7 in farenheit
	}
}
}
