package bittech.lib.commands.ln;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;

public class GetPaymentStatusResponse implements Response {
	
	public static enum InvoiceStatus {
		NO_STATUS, UNPAID, PAID, COMPLETED, EXPIRED, ERROR
	}
	
	public final InvoiceStatus status;

	public GetPaymentStatusResponse(final InvoiceStatus status) {
		this.status = Require.notNull(status, "status");
	}

}
