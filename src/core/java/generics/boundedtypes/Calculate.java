package core.java.generics.boundedtypes;

public class Calculate<T extends Number> {

	T a,b;

	public Calculate(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void show() {
		System.out.println(a);
		System.out.println(b);

	}
	
}
