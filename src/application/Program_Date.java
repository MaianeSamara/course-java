package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program_Date {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Data Atual:");
		Date x1 = new Date();
		System.out.println("x1: " + sdf2.format(x1));
		Date x2 = new Date(System.currentTimeMillis());
		System.out.println("x2: " + sdf2.format(x2));
		
		System.out.println();
		System.out.println("Armazenamento de Data em milissegundos:");
		Date x3 = new Date(0L);
		System.out.println("x3: " + sdf2.format(x3));
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		System.out.println("x4: " + sdf2.format(x4));
		
		Date y1 = sdf1.parse("28/11/2022");
		Date y2 = sdf2.parse("28/11/2022 15:42:07");
//		ISO 8601
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println();
		System.out.println(y1);
		System.out.println(y2);
		System.out.println();
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println();
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));	
		System.out.println("y3: " + sdf2.format(y3));	
		
		System.out.println("-----------");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));
		System.out.println();
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));	
		System.out.println("y3: " + sdf3.format(y3));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));	
		
		System.out.println();
		System.out.println("--------");
		System.out.println("Data não Formatada:");
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);	
		System.out.println("y3: " + y3);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
	}

}
