package core.java.generics.customgenerics;

public class Gen<T> {

	T obj;

	public Gen(T obj) {
		super();
		this.obj = obj;
	}
	
	public void show() {
		System.out.println("The type of object passed : "+ obj.getClass().getName());
	}
	
	public T get() {
		return obj;
	}
	
}
