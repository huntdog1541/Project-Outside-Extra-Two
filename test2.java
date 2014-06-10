import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = null;
		try {
			temp = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is code: " + temp);
	}

}
