/**
 * 
 */
package ramp.sample.orika.entity;

import java.util.Date;

/**
 * @author Rama Palaniappan
 * @since Apr 13, 2014
 */
public class BankPaymentMethod extends PaymentMethod {
	private String routingNumber = null;
	private String accountNumber = null;
	private String name = null;

	public String getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
