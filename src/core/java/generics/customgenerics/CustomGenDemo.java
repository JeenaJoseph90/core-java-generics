package core.java.generics.customgenerics;

public class CustomGenDemo {

	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("Jeena");
		System.out.println(g1.get());
		g1.show();
		
		Gen<Integer> g2 = new Gen<Integer>(10);
		System.out.println(g2.get());
		g2.show();
		
		Gen<Employee> g3 = new Gen<Employee>(new Employee(1, "Sunil"));
		System.out.println(g3.get());
		g3.show();

	}
	
}
