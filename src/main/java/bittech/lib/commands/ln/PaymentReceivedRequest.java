package bittech.lib.commands.ln;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;

public class PaymentReceivedRequest implements Request {
	
	public String label;
	public long index;
	public String payment_hash;
	public Btc amount;
	public String status;
	public long pay_index;
	public Btc amount_received;
	public int paid_timestamp;
	public long paid_at;
	public long expiry_time;
	public long expires_at;
	
	public PaymentReceivedRequest() {
		// TODO Auto-generated constructor stub
	}

}
