package core.java.generics.genericbehaviour;

import java.util.ArrayList;

public class GenericBehaviourDemo {

	public static void main(String[] args) {
		// Generic area for al.
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hi");
		al.add("Generics");
		//al.add(10); // C.T.E.
		m1(al);
		System.out.println(al);
		// al.add(15); // C.T.E.
		
		// Non generic area for al1.
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add("Jeena");
		m2(al1);
		System.out.println(al1);
	}
	
	public static void m1(ArrayList l) {
		// Allow to add since it's non generic area.
		l.add(10);
		l.add(10.5);
		l.add(true);
	}
	
	public static void m2(ArrayList<String> l) {
		// Not Allow to add since it's generic area.
		// l.add(10); // C.T.E.
		l.add("Sunil");
	}
	
}
