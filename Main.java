import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	Scanner keyboard=new Scanner(System.in);
	
	char choose;
	float fc , cf , total;
	// fc meaning : Fahrenheit to Celsius
	// cf meaning : Celsius to Fahrenheit	
	
		System.out.print("");
		System.out.println("1- Fahrenheit to Celsius");
		System.out.println("2- Celsius to Fahrenheit");
		System.out.print("Choose number from list: ");
		choose=keyboard.next().charAt(0);

		if (choose == '1'){
		System.out.print("Fahrenheit temperature: ");
		fc=keyboard.nextFloat();
		total = (fc - 32)* 5/9;
		System.out.print("Celsius temperature is: "+total+"C°");
		}
		if (choose == '2'){
		System.out.print("Celsius temperature: ");
		cf=keyboard.nextFloat();
		total = (cf * 9/5) + 32;
		System.out.print("Fahrenheit temperature is: "+total+"F°");
		}
	}
}

// P15
