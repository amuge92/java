class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	String ani() {
		return name;
	}
}

class Dog extends Animal {
	String dog;

	Dog(String name, String dog) {
		super(name);
		this.dog = dog;
	}

}

public class Day14_11 {
	public static void main(String[] args) {

		Animal a1 = new Dog("°­¾ÆÁö","Çªµé");
		System.out.println(a1.ani());
}}
