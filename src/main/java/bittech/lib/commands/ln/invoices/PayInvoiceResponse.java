package bittech.lib.commands.ln.invoices;

import bittech.lib.commands.ln.channels.Route;
import bittech.lib.protocol.Response;

public class PayInvoiceResponse implements Response {
	
	public String paymentPreimage;
	public Route route;

}
