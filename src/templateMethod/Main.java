package templateMethod;

public class Main {

	public static void main(String[] args) {

		AbstractDisplay cd = new CharDisplay('c');
		cd.display();

		AbstractDisplay sd = new StringDisplay("Hello,World");
		sd.display();

	}

}
