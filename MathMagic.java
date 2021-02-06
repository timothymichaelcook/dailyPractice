public class MathMagic {
	public static void main(String[] args) {
    //This is your original number
    int myNumber = 5;

		int stepOne = myNumber * myNumber;

    int stepTwo = stepOne + myNumber;

    int stepThree = stepTwo / myNumber;

    int stepFour = stepThree + 17;

    int stepFive = stepFour - myNumber;

    int stepSix = stepFive / 6;
       
    //This final expression will always print out the number 3
    System.out.println(stepSix);

	}
}