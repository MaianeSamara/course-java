package application;

import java.util.Date;

import entities.OrderEnums;
import entities.enums.OrderStatus;

public class Program_Enum {

	public static void main(String[] args) {
		
		OrderEnums order = new OrderEnums(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		System.out.println();
		
		System.out.println("Conversão de String para enum:");
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
	}

}
