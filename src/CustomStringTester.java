/*
 * CS -202 Homework 3
 * CustomString.java
 * Purpose:To implement all the functionality of string class
 * @author:Bhaumik Mehta
 */

public class CustomStringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s = { 'b', 'H', 'a', 'U', 'm', 'I', 'k', ' ', 'a', 'b', 'c',
				' ', 'x', 'y', 'z' };
		CustomString c = new CustomString(s);
		System.out.println("Creating a Custom string object data is:" + c);
		CustomString c2 = c.changeCase();
		System.out.println("After changing case using changeCase():" + c2);

		char value = c.charAt(3);
		System.out.println("Character at 3rd position using charAt():" + value);

		int length = c.length();
		System.out.println("Length of given String using length() :" + length);

		int compare = c.compareTo(c2);
		System.out
				.println("Result of comparision using compareTo():" + compare);
		char[] b2 = { 'x', 'Y', 'z' };
		char[] x2 = { 'X', 'y', 'Z' };
		CustomString compareI = new CustomString(b2);
		CustomString rightSide = new CustomString(x2);

		int ans3 = compareI.compareToIgnoreCase(rightSide);
		System.out.println("Result of compareToIgnoreCase():" + ans3);

		CustomString c3 = c.toLowerCase();
		System.out.println("Result of toLowerCase():" + c3);

		c3 = c.toUpperCase();
		System.out.println("Result of toUpperCase():" + c3);

		c3 = c2.substring(4);
		System.out.println("Result of substring(4):" + c3);

		c3 = c2.substring(2, 5);
		System.out.println("Result of substring(2,5):" + c3);

		c3 = c.titleize();
		System.out.println("Result of titlelize():" + c3);

		char[] a = { 'b', 'H', 'a', 'U' };
		CustomString prefix = new CustomString(a);
		boolean ans = c.startsWith(prefix);
		System.out.println("Result of startswith(prefix):" + ans);

		char[] b = { 'x', 'y', 'z' };
		char[] x = { 'a', 'b', 'c', 'x', 'y', 'z' };
		CustomString demo = new CustomString(x);
		CustomString suffix = new CustomString(b);
		boolean ans2 = demo.endsWith(suffix);
		System.out.println("Resullt of endsWith(suffix):" + ans2);

		CustomString[] c4 = c.split(' ');
		System.out.println("Result of split function:");
		for (int i = 0; i < 3; i++) {
			System.out.println(c4[i]);
		}
		ans = c.equals(c3);
		System.out.println("Result of Equal():" + ans);

		System.out.println("Equal ignore case method output:"
				+ c.equalsIgnoreCase(c2));

		
		CustomString concat = compareI.concat(rightSide);
		System.out.println("Result for concat():" + concat);

		System.out.println("Result of tostring" + c);
	}
}
