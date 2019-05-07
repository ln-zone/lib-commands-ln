package bittech.lib.commands.ln.invoices;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class FastPayRequest implements Request {
	
	public String invoice;
	public Btc amount;
	public final boolean feeIncluded;
	public Btc feeLimit;
	
	public FastPayRequest(String invoice, final Btc amount, final boolean feeIncluded, final Btc feeLimit) {
		this.invoice = Require.notNull(invoice, "invoice");
		this.amount = Require.notNull(amount, "amount");
		this.feeIncluded = feeIncluded;
		this.feeLimit = Require.notNull(feeLimit, "feeLimit");
	}

}
