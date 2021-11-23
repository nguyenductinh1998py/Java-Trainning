package JavaGeneric;

public class Name<T> {
	private T name;
	
	public Name(T name) {
		this.name = name;
	}
	
	public void setName(T name) {
		this.name = name;
	}
	
	public T getName() {
		return this.name;
	}
}