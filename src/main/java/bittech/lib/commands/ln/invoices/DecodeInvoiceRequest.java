package bittech.lib.commands.ln.invoices;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class DecodeInvoiceRequest implements Request {
	
	public String paymentRequest;
	
	public DecodeInvoiceRequest(String paymentRequest) {
		this.paymentRequest = Require.notNull(paymentRequest, "paymentRequest");
	}

}
