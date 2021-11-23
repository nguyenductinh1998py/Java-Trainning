package JavaCollection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class JavaList {
	public static void main(String[] args) {
		Animal dog = new Animal("Dog");
		Animal cat = new Animal("Cat");
		Animal bird = new Animal("Bird");
		
		List<Animal> listAnimal = new ArrayList<Animal>();
		
		//Add element
		System.out.println("------------------Delete Element------------------");
		
		listAnimal.add(dog);
		listAnimal.add(cat);
		listAnimal.add(bird);
		
		for(Animal animal: listAnimal) {
			System.out.println(animal.getName());
		}
				
		//Delete element
		System.out.println("------------------Delete Element------------------");
		listAnimal.remove(2);
		
		for(Animal animal: listAnimal) {
			System.out.println(animal.getName());
		}
		
	}
}