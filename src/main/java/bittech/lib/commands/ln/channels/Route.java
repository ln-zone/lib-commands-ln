package bittech.lib.commands.ln.channels;

import java.util.List;

import bittech.lib.utils.Btc;

public class Route {
	public int totalTimeLock; // The cumulative (final) time lock across the entire route. This is the CLTV
	// value that should be extended to the first hop in the route. All other hops
	// will decrement the time-lock as advertised, leaving enough time for all hops
	// to wait for or present the payment preimage to complete the payment.
	public List<Hop> hops; // Contains details concerning the specific forwarding details at each hop.
	public Btc totalFees; // The total fees in millisatoshis.
	public Btc totalAmount; // The total amount in millisatoshis.
}
