package bittech.lib.commands.ln;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class LnChargeRequest implements Request {

	public final String requestId;
	public final String addr;
	public final Btc amount;

	public LnChargeRequest(final String requestId, final Btc amount, final String addr) {
		this.requestId = Require.notNull(requestId, "requestId");
		this.amount = Require.notNull(amount, "amount");
		this.addr = Require.notNull(addr, "addr");
	}

}
