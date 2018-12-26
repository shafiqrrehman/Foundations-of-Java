import java.util.Arrays;

class SampleArrayAPI {

	public static void main(String[] args) {
		
		int[] numbers = { 5, 4, 7, 3, 25, 33};
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		boolean[] responses = { true, false, false, true };
		boolean[] responses2 = { true, true, false, true };

		System.out.println("Arrays before sorting: " 
			+ Arrays.toString(numbers));

		Arrays.sort(numbers);

		System.out.println("Arrays before sorting: " 
			+ Arrays.toString(numbers));

		int position = Arrays.binarySearch(numbers, 25);
		System.out.println("Your key was found at: " + position);

		if (Arrays.equals(responses, responses2) == true) {
			System.out.println("Two booleans arrays are same..");
		} else {
			System.out.println("two boolean arrays are different..");
		}

		char[] vowels2 = Arrays.copyOf(vowels, vowels.length * 2);
		System.out.println(Arrays.toString(vowels2));

		vowels2[5] += 't';
		System.out.println(Arrays.toString(vowels2));
	}
}