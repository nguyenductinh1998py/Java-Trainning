package JavaGeneric;

public class Main {
	public static void main(String[] args) {
		Name<String> name = new Name<String>("Cat");
		
		System.out.println(name.getName());
	}
}