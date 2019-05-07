package bittech.lib.commands.ln.invoices;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class FastPayCommand extends Command<FastPayRequest, PayInvoiceResponse> {
	
	public static FastPayCommand createStub () {
		return new FastPayCommand("", new Btc(), false, new Btc("3:000"));
	}
	
	public FastPayCommand(final String invoice, final Btc amount, final boolean feeIncluded, final Btc feeLimit) {
		this.request = new FastPayRequest(invoice, amount, feeIncluded, feeLimit);
	}
}
