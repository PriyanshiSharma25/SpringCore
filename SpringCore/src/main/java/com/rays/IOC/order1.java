package com.rays.IOC;

public class order1 {
	
		
	
private payment payment;
private inventory inventory;

public void setPayment(payment payment) {
	this.payment= payment;
}
public void setInventory(inventory inventory) {
	this.inventory = inventory;
}
public void bookATicket(int items) {
	int price = 10;
	double totalAmount = items * price;
	double updatedBalance = payment.makePayment(totalAmount);
	int updatedStock = inventory.sold(items);;
	
	System.out.println("Tickets are Booked");
	System.out.println("Total Amount Paid: " + totalAmount);
	System.out.println("Remaining Balance: " + updatedBalance);
	System.out.println("Updated Stock: " + updatedStock);
}

}