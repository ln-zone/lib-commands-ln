package bittech.lib.commands.ln.invoices;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class PayInvoiceRequest implements Request {
	
	public String paymentRequest;
	public Btc amount;
	public Btc feeLimit;
	
	public PayInvoiceRequest(String paymentRequest, final Btc amount, final Btc feeLimit) {
		this.paymentRequest = Require.notNull(paymentRequest, "paymentRequest");
		this.amount = Require.notNull(amount, "amount");
		this.feeLimit = Require.notNull(feeLimit, "feeLimit");
	}

}
