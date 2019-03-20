package bittech.lib.commands.ln.invoices;

import java.util.List;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class DecodeInvoiceResponse implements Response {

	public static class HopHint {
		public String node_id; // The public key of the node at the start of the channel.
		public long chan_id; // The unique identifier of the channel.
		public Btc fee_base; // The base fee of the channel denominated in millisatoshis.
		public int fee_proportional_millionths; // The fee rate of the channel for sending one satoshi across it denominated in
											// millionths of a satoshi.
		public int cltv_expiry_delta; // The time-lock delta of the channel.
	}

	public static class RouteHint {
		public List<HopHint> hop_hints;
	}

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
