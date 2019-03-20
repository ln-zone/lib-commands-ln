package bittech.lib.commands.ln.invoices;

import bittech.lib.protocol.Command;

public class DecodeInvoiceCommand extends Command<DecodeInvoiceRequest, DecodeInvoiceResponse> {
	
	public static DecodeInvoiceCommand createStub () {
		return new DecodeInvoiceCommand("");
	}
	
	public DecodeInvoiceCommand(String paymentRequest) {
		this.request = new DecodeInvoiceRequest(paymentRequest);
	}
}
