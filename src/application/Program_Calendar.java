package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program_Calendar {

	public static void main(String[] args) {
		
		System.out.println("Somando uma unidade de Tempo:");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		System.out.println("--------");
		System.out.println("Obtendo uma unidade de tempo:");
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
//		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
//		System.out.println(sdf.format(d));
//		
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);		
		System.out.println("Minutes: " + minutes);
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Month: " + month);

	}
	

}
