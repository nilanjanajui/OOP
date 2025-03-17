package OOP;

import java.util.function.*;
import java.util.*;
import java.util.stream.Collectors;

public class CombinedFunctionalInterfacesExample {

	public static void main(String[] args) {

		// 1. Predicate<T>: Test if a number is even
		Predicate<Integer> isEven = n -> n % 2 == 0;

		// 2. Consumer<T>: Print a number
		Consumer<Integer> printNumber = n -> System.out.println("Number: " + n);

		// 3. Supplier<T>: Provide a random number
		Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

		// 4. Function<T, R>: Square a number
		Function<Integer, Integer> square = n -> n * n;

		// 5. BiFunction<T, U, R>: Add two numbers
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		// 6. UnaryOperator<T>: Multiply a number by 2
		UnaryOperator<Integer> doubleValue = n -> n * 2;

		// 7. BinaryOperator<T>: Find the maximum of two numbers
		BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;

		// 8. BiConsumer<T, U>: Print a name and its length
		BiConsumer<String, Integer> printNameAndLength = (name, length) -> System.out
				.println(name + " has " + length + " characters.");

		// Demonstration:

		// Using Supplier to generate a random number
		int randomNum = randomSupplier.get();
		System.out.println("Random Number: " + randomNum);

		// Using Predicate to test if the random number is even
		System.out.println("Is Even? " + isEven.test(randomNum));

		// Using Function to square the random number
		int squared = square.apply(randomNum);
		System.out.println("Squared: " + squared);

		// Using UnaryOperator to double the random number
		int doubled = doubleValue.apply(randomNum);
		System.out.println("Doubled: " + doubled);

		// Using BiFunction to add two numbers
		int sum = add.apply(randomNum, squared);
		System.out.println("Sum (Random + Squared): " + sum);

		// Using BinaryOperator to find the maximum of two numbers
		int maxNum = max.apply(randomNum, squared);
		System.out.println("Maximum (Random, Squared): " + maxNum);

		// Using Consumer to print a number
		printNumber.accept(randomNum);

		// Using BiConsumer to print a name and its length
		String name = "Lambda";
		printNameAndLength.accept(name, name.length());

		// Bonus: Combining with Streams
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> filteredAndSquared = numbers.stream().filter(isEven) // Using Predicate to filter even numbers
				.map(square) // Using Function to square the numbers
				.collect(Collectors.toList());
		System.out.println("Filtered and Squared Numbers: " + filteredAndSquared);
	}
}
