public class PracticeProblem {

	public static void main(String args[]) {

	}

	//q1
	public static String evenOrOdd(int num) { //String is used because it's returning a string
		if (num % 2 == 0){
			return "Even";
	 	} else {
			return "Odd";
		}
	}

	//q2
	public static String teacherOrStudent(String word) {
		if (word == "Kalisz") {
			return "Teacher";
		} else {
			return "Student";
		}
	}

	//q3
	public static int fartherFromZero(int num) {
		if (num > 0) {
			return num + 5;
		} else if (num < 0) {
			return num - 5;
		} else {
			return 0;
		}

	}

		//q4
		public static String isFive(int num) {
			if (num == 5) {
				return "The number is Five";
			} else {
				return "The number is not Five";
			}
		}

		//q5
		public static String positiveOrNegative(double num) {
			if (num > 0) {
				return "Positive";
			} else {
				return "Negative";
			}
		}

		//q6 
		public static String highOrLow(int num) {
			if (num > 100) {
				return "High";
			} else {
				return "Low";
			}
		}

		//q7
		public static String isHello(String word) {
			if (word == "Hello") {
				return "The word is Hello";
			} else {
				return "The word is not Hello";
			}
		}
}
