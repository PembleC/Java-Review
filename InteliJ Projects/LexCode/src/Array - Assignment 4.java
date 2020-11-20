// Array - Assignment 4
// Carson Pemble
// 10/29/2020

class Tester6 {

	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		int index = 0;

		// Implement your code here
		if (num2 <= num1){
			System.out.println("num1 is not less than num2");  // Not Valid
			return numbers;
		}

		for(int i = num1; i <= num2; i++){
			//System.out.printf("i = " + i + "\n");
			if (i <= 9){i = 10;}
			if (num1 > 99){break;}
			if (num2 > 99){num2 = 99;}

			int ones = i % 10;
			//System.out.printf("ones = " + ones + "\n");
			int tens = (i/10) % 10;
			//System.out.printf("tens = " + tens + "\n");

			int sum = ones + tens;
			//System.out.println("sum = " + sum + "\n");

			if( sum % 3 == 0){
				if (i % 5 == 0){
					numbers[index] = i;
					index++;
				}
			}
		}


		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
