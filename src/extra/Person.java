package extra;

public class Person {
	private String name;
	private String superpower;

	public static void main(String[] args) {

	}

	String getName() {
		return name;
	}

	String getSuperpower() {
		return superpower;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSuperpower(String superpower) {
		this.superpower = superpower;

	}

	public String toString() {
		return "" + name + " has mad " + superpower + " skills.";
	}
}
