/*
 * CS -202 Homework 3
 * CustomString.java
 * Purpose:To implement all the functionality of string class
  * @author:Bhaumik Mehta
 */

public class CustomString {

	char[] data;
/*
 * creates CustomString object with char array
 */
	public CustomString(char[] data) {
		this.data = new char[data.length];
		this.data = data;

	}
/*
 * Returns the customString object with case changed
 */
	public CustomString changeCase() {
		char[] change;
		change = new char[data.length];
		for (int i = 0; i < data.length; i++) {
			int value = data[i];
			if (65 <= value && value <= 90) {
				value = value + 32;
				change[i] = ((char) value);
			} else {
				value = value - 32;
				change[i] = ((char) value);

			}
		}// end of for loop
		CustomString changeObj = new CustomString(change);
		return changeObj;
	}

	/*
	 * Returns the character at the given index
	 * 
	 */
	public char charAt(int index) {
		char value = data[index];
		return value;

	}
/*
 * Returns the length of the CustomString
 */
	public int length() {
		int size = data.length;
		return size;
	}

	/*
	 * Returns CustomString array by spliting the string by delimiter
	 */
	public CustomString[] split(char delimiter) {
		CustomString[] arr = new CustomString[data.length];
		int j = 0;
		int k = 0;
		for (int i = 0; i < data.length; i++) {

			if (this.data[i] == delimiter) {
				arr[j] = this.substring(k, i);
				k = i + 1;
				j++;
			}

		}
		arr[j] = this.substring(k, data.length);
		return arr;
	}

	/*
	 * Returns a boolean value that two CustomString  are equal or not
	 */
	public boolean equals(CustomString rhs) {
		for (int i = 0; i < rhs.data.length; i++) {

			if (rhs.data[i] == this.data[i]) {
				continue;

			} else
				return false;
		}
		return true;
	}

	/*
	 * Returns a boolean value that two CustomString  are equal or not irrespective of case
	 */
	public boolean equalsIgnoreCase(CustomString rhs) {
		CustomString right = rhs.toLowerCase();
		CustomString ignoreCase = this.toLowerCase();
		boolean ans = ignoreCase.equals(right);
		return ans;

	}
	
	/*
	 * Returns a new CustomString object by appending two CustomString object
	 */
public CustomString concat(CustomString rhs){
	char[] newArray=new char[this.data.length+rhs.data.length];
	for (int i = 0; i < this.data.length; i++) {
		newArray[i]=this.data[i];
	}
	for (int i = 0; i < rhs.data.length; i++) {
		newArray[i+this.data.length]=rhs.data[i];
	}
	CustomString concat=new CustomString(newArray);
	return concat;
	
	
	
}

/*
 * Returns int value as a result of comparing two CustomString.
 * Returns 0 if  they are equal.
 * Returns 1if left side is greater.
 * Returns 2 if right side is greater.
 */
	public int compareTo(CustomString rhs) {

		for (int i = 0; i < data.length; i++) {
			int leftValue = this.data[i];
			int rightValue = rhs.data[i];
			if (leftValue > rightValue) {
				return 1;
			} else if (leftValue < rightValue) {
				return -1;
			} else
				continue;

		}
		return 0;

	}

/*
 * Returns int value as a result of comparing two CustomString.
 * Returns 0 if  they are equal.
 * Returns 1if left side is greater.
 * Returns 2 if right side is greater.
 *Irrespective of case.
 */
	public int compareToIgnoreCase(CustomString rhs){
		int ans;
		CustomString rightSide = rhs.toUpperCase();
		CustomString compareToIgnoreCase = this.toUpperCase();
		ans =compareToIgnoreCase.compareTo(rightSide);
		return ans;
		
	}

	/*
	 * Returns true if CustomString starts with given prefix
	 */
	public boolean startsWith(CustomString prefix) {
		boolean ans = false;
		for (int i = 0; i < prefix.data.length; i++) {
			int c = prefix.data[i];
			int d = this.data[i];
			if (c == d) {
				ans = true;
			} else {
				ans = false;
				break;
			}
		}
		return ans;
	}

	/*
	 * Returns true if CustomString ends with given suffix
	 */
	public boolean endsWith(CustomString suffix) {

		boolean ans = false;
		
		for (int i = this.data.length - suffix.data.length,j=0; i < this.data.length; i++,j++) {
			
			if(suffix.data[j]==this.data[i]){
			ans = true;
			} 
			else{
				ans = false;
				break;
			}
			
		}
		return ans;

	}

	/*
	 * Returns new CustomString object in lower case
	 */
	public CustomString toLowerCase() {
		char[] change;
		change = new char[data.length];
		for (int i = 0; i < data.length; i++) {
			int value = data[i];
			if (65 <= value && value <= 90) {
				value = value + 32;
				change[i] = ((char) value);
			} else {
				change[i] = data[i];
			}
		}
		CustomString toLowerObj = new CustomString(change);
		return toLowerObj;

	}


	/*
	 * Returns new CustomString object in upper case
	 */
	public CustomString toUpperCase() {
		char[] change;
		change = new char[data.length];
		for (int i = 0; i < data.length; i++) {
			int value = data[i];
			if (97 <= value && value <= 122) {
				value = value - 32;
				change[i] = ((char) value);
			} else {
				change[i] = data[i];
			}
		}
		CustomString toUpperObj = new CustomString(change);
		return toUpperObj;
	}


	/*
	 * Returns new CustomString object which is substring starting with begin index
	 */
	public CustomString substring(int srcBegin) {
		char[] substring = new char[data.length];
		int j = 0;
		for (int i = srcBegin; i < data.length; i++) {
			substring[j] = data[i];
			j++;
		}
		CustomString subStringObj = new CustomString(substring);
		return subStringObj;

	}

	/*
	 * Returns new CustomString object which is substring starting with begin index and end to given index
	 */
	public CustomString substring(int srcBegin, int srcEnd) {
		char[] substring = new char[data.length];
		int j = 0;
		for (int i = srcBegin; i < srcEnd; i++) {
			substring[j] = data[i];
			j++;
		}
		CustomString subStringObj = new CustomString(substring);
		return subStringObj;

	}


	/*
	 * Returns new CustomString object which is first letter capitalize of every word
	 */
	public CustomString titleize() {
		CustomString titleObj;
		char title[] = new char[data.length];
		title = data;
		int first = title[0];
		if (97 <= first && first <= 122) {
			first = first - 32;
			title[0] = ((char) first);
		}
		for (int i = 0; i < title.length; i++) {
			if (data[i] == ' ') {
				int value = title[i + 1];
				if (97 <= value && value <= 122) {
					value = value - 32;
					title[i + 1] = ((char) value);
				}
			}
		}
		titleObj = new CustomString(title);
		return titleObj;
	}

/*
 * prints the object
 */
	public String toString() {

		String str = new String(data);
		return str;

	}
}
