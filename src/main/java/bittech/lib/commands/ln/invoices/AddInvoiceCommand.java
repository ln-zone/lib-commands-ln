package bittech.lib.commands.ln.invoices;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class AddInvoiceCommand extends Command<AddInvoiceRequest, AddInvoiceResponse> {
	
	public static AddInvoiceCommand createStub () {
		return new AddInvoiceCommand(new Btc(), "");
	}
	
	public AddInvoiceCommand(Btc value, String memo) {
		this.request = new AddInvoiceRequest(value, memo);
	}
}
