package core.java.generics.boundedtypes;

class TestInterfaceBound<T extends Runnable> {
	
}

public class BoundedTypeDemo {

	public static void main(String[] args) {
		Calculate<Integer> obj = new Calculate<Integer>(1, 2);
		System.out.println(obj.a);
		System.out.println(obj.b);

		
		// Compile Time Error
		// Calculate<String> obj1 = new Calculate<String>(1, 2);
		
		TestInterfaceBound<Runnable> run = new TestInterfaceBound<Runnable>();
		System.out.println(run);
		

		TestInterfaceBound<Thread> run1 = new TestInterfaceBound<Thread>();
		System.out.println(run1);
		
		//Compile Time Error
		/* TestInterfaceBound<String> run3 = new TestInterfaceBound<String>(); */
	}
	
}
