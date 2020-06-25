package data.locale;

import java.time.LocalDate;

public class DataLocale {

	public static void main(String[] args) {
		LocalDate oggi = LocalDate.now();
		System.out.println(oggi);
		
		LocalDate quando = LocalDate.of(2019, 2, 12);
		System.out.println(quando);
		
		quando = quando.plusDays(6);
		System.out.println(quando);
		
		System.out.println(quando.compareTo(oggi));
	}

}
