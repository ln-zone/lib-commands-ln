package bittech.lib.commands.ln;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class GetPaymentStatusRequest implements Request {

	public final String requestId;

	public GetPaymentStatusRequest(final String requestId) {
		this.requestId = Require.notNull(requestId, "requestId");
	}

}
