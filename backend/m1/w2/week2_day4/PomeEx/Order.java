package week2_day4_z.PomeEx;

import java.time.LocalDate;
import java.util.List;
import week2_day4_z.PomeEx.Customer;

public class Order {
	
		Long id;
		String status;
		LocalDate orderDate;
		LocalDate deliveryDate;
		List<Product> products;
		Customer customer;
		
		
		public Order (String status, LocalDate orderDate, LocalDate deliveryDate ) {
			this.status = status;
			this.orderDate = orderDate;
			this.deliveryDate = deliveryDate;
		}

}
