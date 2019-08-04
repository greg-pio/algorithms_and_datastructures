package Person;

public class Person {
	
	private String name;
	private String surname;
	private int age;
	
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public void setName(String n) {
		name = n;
	}

	public void setSurname(String n) {
		surname = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}
}
