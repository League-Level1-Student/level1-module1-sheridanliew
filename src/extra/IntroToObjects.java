package extra;

class Duck {
	String favoriteFood;
	int numberOfFriends;

	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

	void quack() {
		System.out.println("quack");
	}

	void waddle() {
		System.out.println("waddle");
	}
}

class Panda {
	String favoriteFood;
	int numberOfFriends;

	Panda(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

	void eat() {
		System.out.println("eat");
	}

	void sleep() {
		System.out.println("sleep");
	}
}

public class IntroToObjects {
	public static void main(String[] args) {
		Duck duck = new Duck("donuts", 8);
		duck.quack();
		Panda panda=new Panda("bamboo", 1);
		panda.sleep();
	}
}
