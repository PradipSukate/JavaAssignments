//14.  Find the extension of a given string file.
//input: "hello.jpeg"
//output: "jpeg"
package set1;

import java.io.File;
import java.util.StringTokenizer;

public class Q14 {

	public static void main(String[] args) {
		File file = new File("hello.jpeg");

		String fileName = file.toString(); // .toString method used to convert file name into string
		int index = fileName.lastIndexOf('.');
		if (index > 0) {
			String filextension = fileName.substring(index);
			System.out.println(filextension);
		}
	}
}


