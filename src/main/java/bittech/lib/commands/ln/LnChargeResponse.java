package bittech.lib.commands.ln;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;

public class LnChargeResponse implements Response {

	public final String invoice_bolt11;

	public LnChargeResponse(final String invoice_bolt11) {
		this.invoice_bolt11 = Require.notNull(invoice_bolt11, "invoice_bolt11");
	}

}
