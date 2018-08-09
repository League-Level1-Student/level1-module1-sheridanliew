package extra;

public class PersonRunner {
	public static void main(String[] args) {
		Person rb = new Person();
		rb.setName("Robin");
		rb.setSuperpower("staff-wielding");
		System.out.println(rb.toString());
		Person rv = new Person();
		rv.setName("Raven");
		rv.setSuperpower("demon");
		System.out.println(rv.toString());
		Person c = new Person();
		c.setName("Cyborg");
		c.setSuperpower("cybernetic");
		System.out.println(c.toString());
		Person s = new Person();
		s.setName("Starfire");
		s.setSuperpower("Tamaranian");
		System.out.println(s.toString());
		Person b = new Person();
		b.setName("Beast Boy");
		b.setSuperpower("shapeshifting");
		System.out.println(b.toString());
	}
}
