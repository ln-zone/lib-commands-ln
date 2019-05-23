package bittech.lib.commands.ln.invoices;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class PayInvoiceCommand extends Command<PayInvoiceRequest, PayInvoiceResponse> {
	
	public static PayInvoiceCommand createStub () {
		return new PayInvoiceCommand("", new Btc(), new Btc("3:000"));
	}
	
	public PayInvoiceCommand(final String paymentRequest) {
		this.request = new PayInvoiceRequest(paymentRequest, new Btc(), new Btc());
	}
	
	public PayInvoiceCommand(final String paymentRequest, final Btc amount, final Btc feeLimit) {
		this.request = new PayInvoiceRequest(paymentRequest, amount, feeLimit);
	}
}
