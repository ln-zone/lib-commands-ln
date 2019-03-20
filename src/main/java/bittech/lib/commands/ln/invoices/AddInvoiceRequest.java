package bittech.lib.commands.ln.invoices;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class AddInvoiceRequest implements Request {
	
	public Btc value;
	public String memo;
	
	public AddInvoiceRequest(Btc value, String memo) {
		this.value = Require.notNull(value, "value");
		this.memo = Require.notNull(memo, "memo");
	}

}
