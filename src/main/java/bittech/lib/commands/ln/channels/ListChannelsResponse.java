package bittech.lib.commands.ln.channels;

import java.util.List;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class ListChannelsResponse implements Response {

	public static class Channel {
		public String remote_node_pub;
		public String channel_point; // The outpoint (txid:index) of the funding transaction. With this value, Bob
		// will be able to generate a signature for Alice’s version of the commitment
		// transaction.
		public Btc capacity; // The total amount of funds held in this channel
		public Btc local_balance; // This node’s current balance in this channel
		public Btc remote_balance; // The counterparty’s current balance in this channel
	}

	public static class Htlc {
		public boolean incoming;
		public Btc amount;
		public String hash_lock;
		public int expiration_height;
	}

	public static class ActiveChannel extends Channel {
		public boolean active; // Whether this channel is active or not

		public String id; // The unique channel ID for the channel. The first 3 bytes are the block
		// height, the next 3 the index within the block, and the last 2 bytes are the
		// output index for the channel.
		public Btc commit_fee; // The amount calculated to be paid in fees for the current set of commitment
								// transactions. The fee amount is persisted with the channel in order to allow
								// the fee amount to be removed and recalculated with each channel state update,
								// including updates that happen after a system restart.
		public long commit_weight; // The weight of the commitment transaction
		public Btc fee_per_kw; // The required number of satoshis per kilo-weight that the requester will pay
								// at all times, for both the funding transaction and commitment transaction.
								// This value can later be updated once the channel is open.
		public Btc unsettled_balance; // The unsettled balance in this channel
		public Btc total_satoshis_sent; // The total number of satoshis we’ve sent within this channel.
		public Btc total_satoshis_received; // The total number of satoshis we’ve received within this channel.
		public long num_updates; // The total number of updates conducted within this channel.
		public List<Htlc> pending_htlcs; // HTLC The list of active, uncleared HTLCs currently pending within the
		// channel.
		public int csv_delay; // The CSV delay expressed in relative blocks. If the channel is force closed,
		// we’ll need to wait for this many blocks before we can regain our funds.
		public boolean isPrivate; // Whether this channel is advertised to the network or not.
		public boolean initiator; // True if we were the ones that creted the channel.
	}

	public List<ActiveChannel> channels;

}
