package PART12.com.java.programs.GenerateRandomNumbersAndStrings;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumbersAndStrings {
	public static void main(String[] args) {
		// Generate Random Integers - Approach-1 using Random Class

		Random rand = new Random();
		// int rand_int=rand.nextInt(10);//it will consider 0 to 9
		// int rand_int=rand.nextInt(100);//it will consider 0 to 99
		// int rand_int=rand.nextInt(100);//it will consider 0 to 999
		// System.out.println(rand_int);

		// double double_rand=rand.nextDouble(); // it will generate random
		// decimal numbers 0.0 to and less than 1.0
		// System.out.println(double_rand);

		// Generate Random Integers - Approach-2 using Math Class
		// System.out.println(Math.random()); // it will generate random decimal
		// numbers

		// Generate Random Integers - Approach-3 using Apache commons-lang API
		// String randNum=RandomStringUtils.randomNumeric(10);
		// System.out.println(randNum);

		String randString = RandomStringUtils.randomAlphabetic(10);
		System.out.println(randString);
	}
}
