package simpleJavaProgram;
import java.util.Random;
public class rollingDice {

	public static void main(String[] args) {
		Random coolNumberBro = new Random();
	int x = coolNumberBro.nextInt(6) + 1;
	System.out.println("You rolled a: " + x);
	}

}
