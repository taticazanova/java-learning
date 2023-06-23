/*
* ---- @author Tati Cazanova
* ---- Created in June 2023
* ---- Keywords: variables, values, reference, primitive types, comparing operator, if condition
*/

class Program0 {
	
	public static void main(String[]args) {
	
		// Declaring and initializing two primitive variables called 'x' and 'y'
		// Both store the value 12
		int x = 12;
		int y = 12;

		// Comparing the values stored in 'x' and 'y'
		if (x == y) { System.out.println("true"); }
		else { System.out.println("false"); }


		// 'x' receives 'y' -> the value in 'y' is copied in 'x'
		x = y;


		// Comparing them again
		if (x == y) { System.out.println("true"); }
		else { System.out.println("false"); }


		// Adding 1 to the value inside 'x' -> 12 + 1 = 13
		x++;

		// Since 12 != 13 the output will be 'false'
		if (x == y) { System.out.println("true"); }
		else { System.out.println("false"); }


		// Creating two more variables 'z' and 't'
		// Both are reference variables because they refer to objects
		String z = "abc";
		String t = "efg";
		
		// with 'z' we access 'abc' string
		// with 't' we access 'efg' string
		// Instead of storing the strings, both store the address in the memory where the strings are
		// This happens because String is not a primitive type, but a complex one
		// Since the content of each one is different the output will be 'false'
		if (z == t) {System.out.println("true"); }
		else { System.out.println("false"); }
		
		
		// Changing 't' content
		t = "abc";
		
		// Now 't' and 'z' has the same content reference
		if (z == t) {System.out.println("true"); }
		else { System.out.println("false"); }
		
		// Changing 'z' content'
		// 't' receives 'z'
		z = "mno";
		t = z;
		
		// Since the content of each one is equal the output will be 'true'
		if (z == t) {System.out.println("true"); }
		else { System.out.println("false"); }

	}
	
}
