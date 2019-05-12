package bittech.lib.commands.ln.invoices;

import java.util.List;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class DecodeInvoiceResponse implements Response {

	public String destination;
	public String payment_hash;
	public Btc amount;
	public long timestamp;
	public long expiry;
	public String description;
	public String description_hash;
	public String fallback_addr;
	public long cltv_expiry;
	public List<RouteHint> route_hints;

}
