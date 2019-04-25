package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Request;

public class PayToRouteRequest implements Request {

	public String paymentHash; // The payment hash to use for the HTLC.
	public Route route;
}
