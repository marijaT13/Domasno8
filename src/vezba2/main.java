package vezba2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class main {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s=br.readLine();
			rechnik r=new rechnik();
			r.vnesiMapa();
			r.translate(s);
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
