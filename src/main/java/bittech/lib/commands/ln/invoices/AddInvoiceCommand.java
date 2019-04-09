package bittech.lib.commands.ln.invoices;

import org.apache.commons.lang3.RandomStringUtils;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class AddInvoiceCommand extends Command<AddInvoiceRequest, AddInvoiceResponse> {
	
	public static AddInvoiceCommand createStub () {
		return new AddInvoiceCommand(new Btc(), "inv" + RandomStringUtils.random(12, false, true), "");
	}
	
	public AddInvoiceCommand(Btc value, String label, String memo) {
		this.request = new AddInvoiceRequest(value, label, memo);
	}
	
	public AddInvoiceCommand(AddInvoiceRequest request) {
		this.request = Require.notNull(request, "request");
	}
}
