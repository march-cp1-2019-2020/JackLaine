import java.time.format.DateTimeFormatter;

public class LocalDateTime {
	
	public static void main(String[]args) {
		
		LocalDateTime localDate = LocalDateTime.now();
		System.out.println(localDate);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd, YYYY");
		System.out.println(dtf.format(localDate));
	}

}
