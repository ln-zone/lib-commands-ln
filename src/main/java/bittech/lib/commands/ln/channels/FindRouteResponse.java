package bittech.lib.commands.ln.channels;

import java.util.List;

import bittech.lib.commands.ln.invoices.PayInvoiceResponse.Hop;
import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class FindRouteResponse implements Response {

		public int totalTimeLock; //	The cumulative (final) time lock across the entire route. This is the CLTV value that should be extended to the first hop in the route. All other hops will decrement the time-lock as advertised, leaving enough time for all hops to wait for or present the payment preimage to complete the payment.
//		public long total_amt; //	The total amount of funds required to complete a payment over this route. This value includes the cumulative fees at each hop. As a result, the HTLC extended to the first-hop in the route will need to have at least this many satoshis, otherwise the route will fail at an intermediate node due to an insufficient amount of fees.
		public List<Hop> hops; //	Contains details concerning the specific forwarding details at each hop.
		public Btc totalFees; // The total fees in millisatoshis.
		public Btc totalAmount; // The total amount in millisatoshis.

}
