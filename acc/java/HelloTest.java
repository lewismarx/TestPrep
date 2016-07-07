package edu.acc.java;
import edu.acc.java.enums.Sundial;
import edu.acc.java.enums.*;
import java.util.*;
import java.util.Scanner;





public class HelloTest implements HelloWorldIF {
	
	int mySunDial = 0;
public static void main(String[] args) {
HelloTest test = new HelloTest();
Scanner scan = new Scanner(System.in);

System.out.println(test.generateName());

Sundial two = Sundial.two;
System.out.println("Please Input Time Number: ");
test.mySunDial = test.setSundialTime(test.STSE(scan.next()));
try {
Thread.sleep(400);
}
catch(InterruptedException IE) {
	System.err.println(IE);
}
System.out.println("Thank You");


System.out.println("My Sundial Time is: " + test.mySunDial);
 

}

private int sundialtime(Sundial x) {
	mySunDial = setSundialTime(x);
	return mySunDial;
	
}
private Sundial STSE(String input) {
	switch(input) {
		case "one": return Sundial.one;
		case "two": return Sundial.two;
		case "three": return Sundial.three;
		case "four": return Sundial.four;
		case "five": return Sundial.five;
		case "six": return Sundial.six;
		case "seven": return Sundial.seven;
		case "eight": return Sundial.eight;
		case "nine": return Sundial.nine;
		case "ten": return Sundial.ten;
		case "eleven": return Sundial.eleven;
		case "twelve": return Sundial.twelve;
		case "1": return Sundial.one;
		case "2": return Sundial.two;
		case "3": return Sundial.three;
		case "4": return Sundial.four;
		case "5": return Sundial.five;
		case "6": return Sundial.six;
		case "7": return Sundial.seven;
		case "8": return Sundial.eight;
		case "9": return Sundial.nine;
		case "10": return Sundial.ten;
		case "11": return Sundial.eleven;
		case "12": return Sundial.twelve;
		default: System.out.println(" This is not a valid input");
					return null;
	}
	
}

}
