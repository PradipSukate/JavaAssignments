//Find duplicate elements in an array({"abc","def",mno","xyz","pqr","xyz","def"})

package arrayassignment;

//import java.util.TreeSet;

public class DuplicateElement {

	public static void main(String[] args) {
		String str[] = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };
		System.out.println("duplicate elements in an array");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					System.out.println(str[i]);
				}

			}
		}
	}
}
       
	

