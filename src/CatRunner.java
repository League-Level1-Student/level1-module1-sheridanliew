
public class CatRunner {
	public static void main(String[] args) {
		Cat kitty = new Cat("Kitty");
		kitty.meow();
		kitty.printName();
		for (int i = 0; i < 9; i++) {
			kitty.kill();
		}
	}
}
