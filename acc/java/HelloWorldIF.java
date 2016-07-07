package edu.acc.java;
import edu.acc.java.enums.Sundial;
import edu.acc.java.RandomLetter;
import java.util.*;


public interface HelloWorldIF {
	/**
	@args none
	Generates random letters for random name in random sizes
	**/
default String generateName() {
RandomLetter ran = new RandomLetter();
Random rand = new Random();
String Names = "";
for(int i=0; i < rand.nextInt(15) + 1; i++) {
Names += ran.ran();

}
return Names;

}
/**
@args sundial type enums
@return Ordinal value
**/
 
default int setSundialTime(Sundial x) {
return (x.ordinal() % 2);


}



}