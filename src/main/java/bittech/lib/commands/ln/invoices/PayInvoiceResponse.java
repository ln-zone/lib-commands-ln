package bittech.lib.commands.ln.invoices;

import java.util.List;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class PayInvoiceResponse implements Response {
	
	public static class Hop {
		public long channelId;
		public Btc channelCapacity;
		public Btc amountToForward;
		public Btc fee;
		public int expiry;
		public String pubKey;
	}
	
	public static class Route {
		public int totalTimeLock;
		public Btc totalAmount;
		public Btc totalFees;
		public List<Hop> hops;
	}
	
	public String paymentPreimage;
	public Route route;

}
