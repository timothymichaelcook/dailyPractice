public class MathMagicAlt {
	public static void main(String[] args) {
    //This is your original number
    int myNumber = 7;

	int magicNumber = myNumber * myNumber;

    magicNumber += myNumber;

    magicNumber /= myNumber;

    magicNumber += 17;

    magicNumber -= myNumber;

    magicNumber /= 6;
       
    //This final expression will always print out the number 3
    System.out.println(magicNumber);
    
    












	}
}