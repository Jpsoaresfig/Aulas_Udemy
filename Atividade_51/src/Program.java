
import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);

		Map<String, String> cookies = new HashMap<>();

		cookies.put("Username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "123");

		cookies.remove("email");// removeu email logo nao vai aparecer
		cookies.put("phone", "12345");// sobrescreve o primeiro put

		System.out.println(cookies);

		scanner.close();
	}
}