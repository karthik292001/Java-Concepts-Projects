
public class CharacterCheck {

	public void findCharacterColor(char character) {
		switch(character) {
		case 'V':
		case 'v':
			System.out.println("Voilet color");
			break;
		case 'I':
		case 'i':
			System.out.println("Indigo color");
			break;
		case 'B':
		case 'b':
			System.out.println("Blue color");
			break;
		case 'G':
		case 'g':
			System.out.println("Green color");
			break;
		case 'Y':
		case 'y':
			System.out.println("Yellow color");
			break;
		case 'O':
		case 'o':
			System.out.println("Orange color");
			break;
		case 'R':
		case 'r':
			System.out.println("Red color");
			break;
		default:
			System.out.println("Invalid character, Try with valid Input!");
		}
	}

}
