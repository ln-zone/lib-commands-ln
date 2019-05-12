package bittech.lib.commands.ln.invoices;

import java.util.List;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;
import bittech.lib.utils.FormattedTime;

public class ListInvoicesResponse implements Response {

	public static class Invoice {
		public String memo; //	string	An optional memo to attach along with the invoice. Used for record keeping purposes for the invoice’s creator, and will also be set in the description field of the encoded payment request if the description_hash field is not being used.
//		String r_preimage	bytes	The hex-encoded preimage (32 byte) which will allow settling an incoming HTLC payable to this preimage
	//	r_hash	bytes	The hash of the preimage
		public Btc amount; // value	int64	The value of this invoice in satoshis
		public FormattedTime creation_date; //	int64	When this invoice was created
		public FormattedTime settle_date; //	int64	When this invoice was settled
		public String payment_request; //	string	A bare-bones invoice for a payment within the Lightning Network. With the details of the invoice, the sender has all the data necessary to send a payment to the recipient.
		public String  description_hash; //	bytes	Hash (SHA-256) of a description of the payment. Used if the description of payment (memo) is too long to naturally fit within the description field of an encoded payment request.
		public long expiry; //	int64	Payment request expiry time in seconds. Default is 3600 (1 hour).
		public String fallback_addr; //	string	Fallback on-chain address.
		public long cltv_expiry; //	uint64	Delta to use for the time-lock of the CLTV extended to the final hop.
		public List<RouteHint> route_hints; // Route hints that can each be individually used to assist in reaching the invoice’s destination.
		public boolean isPrivate; //	bool	Whether this invoice should include routing hints for private channels.
		public long add_index; //	uint64	The “add” index of this invoice. Each newly created invoice will increment this index making it monotonically increasing. Callers to the SubscribeInvoices call can use this to instantly get notified of all added invoices with an add_index greater than this one.
		public long settle_index; //	uint64	The “settle” index of this invoice. Each newly settled invoice will increment this index making it monotonically increasing. Callers to the SubscribeInvoices call can use this to instantly get notified of all settled invoices with an settle_index greater than this one.
		public Btc amoutPaid; //	int64	The amount that was accepted for this invoice, in millisatoshis. This will ONLY be set if this invoice has been settled. We provide this field as if the invoice was created with a zero value, then we need to record what amount was ultimately accepted. Additionally, it’s possible that the sender paid MORE that was specified in the original invoice. So we’ll record that here as well.
		public String state; //	InvoiceState	The state the invoice is in.
	}
	
	public List<Invoice> invoices;
	
}
